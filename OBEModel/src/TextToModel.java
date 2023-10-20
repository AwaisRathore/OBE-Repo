import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl; 
import ObeModel.Activity;
import ObeModel.ActivityType;
import ObeModel.Batches;
import ObeModel.CLO;
import ObeModel.Courses;
import ObeModel.Institute;
import ObeModel.InstituteLevel;
import ObeModel.LearningDomain;
import ObeModel.LearningLevels;
import ObeModel.Mission;
import ObeModel.OBERootNode;
import ObeModel.ObeModelFactory;
import ObeModel.PEO;
import ObeModel.Plo;
import ObeModel.Program;
import ObeModel.Results;
import ObeModel.Student;
import ObeModel.Vision;

public class TextToModel {

	public static void main(String[] args) throws IOException {
		try {
			String path  = "src/Test.xlsx";
			ExcelDataReader dataReader = new ExcelDataReader(path);
			//Prepare factory instance
			ObeModelFactory factory = ObeModelFactory.eINSTANCE;
			ObeUtility utility = new ObeUtility(factory);
			//get root node. This will help for creating resources and in graphical editor
			OBERootNode rootNode = factory.createOBERootNode();

			//***********INSTITUTE MAPPING ****************************	
			Institute university = utility.createInstitute(dataReader.getUniversityName(), InstituteLevel.UNIVERSITY, null);
			Institute faculty = utility.createInstitute(dataReader.getFacultyName(), InstituteLevel.FACULTY, university);
			Institute department = utility.createInstitute(dataReader.getDepartmentName(), InstituteLevel.DEPARTMENT, faculty);
			
			
			///***********VISION AND MISSION MAPPING********************
			Vision universityVision = utility.createVision(dataReader.getUniversityVision());    
	        Mission universityMission = utility.createMission(dataReader.getUniversityMission());
	        Mission facultyMission = utility.createMission(dataReader.getFacultyMission());
	        Mission departmentMission = utility.createMission(dataReader.getDepartmentMission());
	        utility.setVisionMission(university, universityVision, universityMission);
	        utility.setMission(faculty, facultyMission);
	        utility.setMission(department, departmentMission);
			
	        
	        //***********PROGRAM EDUCATIONL SECTION MAPPING ********************
	        List<PEO> peoList = new ArrayList<>();
	        for (List<Object> peoInfo : dataReader.getPEOInformation()) {
	            int title = (int) peoInfo.get(0);
	            String statement = (String) peoInfo.get(1);
	            int mapping = (int) peoInfo.get(2);
	            int threshold = (int) peoInfo.get(3);
	            String titleString = "PEO " + title;
	            if(mapping==1) {
	            	PEO peo = utility.createPEO(titleString, statement, departmentMission, threshold);
	            	peoList.add(peo);
	            }else {
	            	PEO peo = utility.createPEO(titleString, statement, null, threshold);
	            	peoList.add(peo);
	            }
	        }
	        
	        
	      //***********PROGRAM LEARNING OUTCOMES MAPPING ********************
	        List<List<Object>> ploData = dataReader.getPloPeoMappings();
	        List<Plo> ploList = new ArrayList<>();
	        for (List<Object> ploInfo : ploData) {
	            String ploName = (String) ploInfo.get(0);
	            int peoNumber = (int) ploInfo.get(1);
	            // Assuming PEO numbers are 1-indexed
	            PEO mappedPEO = peoList.get(peoNumber - 1);
	            // Create PLO object and add it to the list
	            Plo plo = utility.createPlo(ploName, mappedPEO);
	            ploList.add(plo);
	        }
	        
	        
	      //***********PROGRAM SECTION MAPPING ********************
	        Program program = utility.createProgram(dataReader.getProgramName());
	        for (PEO peo : peoList) {
	        	utility.addProgramObjective(program, peo);
			}
	        for (Plo plo : ploList) {
	        	utility.addProgramLearningOutcome(program, plo);
			}
	        
	        
	      //***********Batch SECTION MAPPING ********************
	      String batchName = dataReader.getBatchName();
	      Batches batch = utility.createBatches(batchName);  
	      utility.addBatchToProgram(program, batch);
	      
	      
	      //***********Course SECTION MAPPING ********************
	      Courses course = utility.createCourse(dataReader.getCourseName());
	      utility.addCourseToProgram(program, course);
	     
	      
	    //***********COURSE LEARNING OUTCOMES SECTION MAPPING ********************
	      List<LearningLevels> learningLevelsList = new ArrayList<>();
	      List<CLO> CloList = new ArrayList<>();
	      List<List<Object>> cloData = dataReader.getCLOInformation();
	        for (List<Object> rowData : cloData) {
	        	LearningDomain domain = LearningDomain.values()[(int) rowData.get(1)]; 
	        	String levelDescString = (String) rowData.get(3);
	        	String cloStatement = (String)rowData.get(0);
	        	int ploNumber = (int)rowData.get(4);
	        	LearningLevels levels = utility.createLearningLevel(domain, levelDescString);
	        	CLO clo = utility.createCLO(cloStatement, ploList.get(ploNumber-1),levels);
	        	learningLevelsList.add(levels);
	        	CloList.add(clo);
	        }
	      //Associate clos with course
	      for (CLO clo : CloList) {
	    	  utility.associateCLOWithCourse(course, clo);
	      }
	        
	      
	      
	    //***********ACTIVITIES SECTION MAPPING ******************** 
	      List<String> activitiesNames = dataReader.getactivityNames();
	      List<Activity> activitiesList = new ArrayList();
			for (int i = 0; i < activitiesNames.size(); i++) {
			    String activityName = activitiesNames.get(i);
			    int mappedCloNumber = dataReader.getActivitiesCloMapping().get(i);
			    CLO mappedClo = CloList.get(mappedCloNumber-1);
			    ActivityType activityType = ActivityType.values()[(int) dataReader.getActivitiesType().get(i)]; 
			    double activityObeWeight = dataReader.getActivitiesOBEWeight().get(i);
			    int acitivtyTotalMarks = dataReader.getActivitiesTotalMarks().get(i).intValue();
	            Activity activity = utility.createActivity(activityName, mappedClo, activityType,activityObeWeight,acitivtyTotalMarks);
	            utility.addActivityToCourse(course, activity);
	            activitiesList.add(activity); 
			}
	      
			
			//***********Students SECTION MAPPING ********************
			List<String> studentNames = dataReader.getStudentNames();
			List<Integer> rollNumbers = dataReader.getRollNumbers();
			List<Student> studentLists = new ArrayList();
			for (int i = 0; i < studentNames.size(); i++) {
	            Student student  = utility.createStudent(studentNames.get(i), rollNumbers.get(i).toString(), batch);
	            utility.associateCourseWithStudent(student, course);
	            batch.getStudents().add(student); 
	            studentLists.add(student);
	        }
			
			
			//***********Result SECTION MAPPING ********************
			List<List<Results>> resultsByActivity = new ArrayList<>(); // List to store results grouped by activity

			// Initialize sublists for each activity
			for (int i = 0; i < activitiesList.size(); i++) {
			    resultsByActivity.add(new ArrayList<>());
			}

			for (int studentIndex = 0; studentIndex < studentLists.size(); studentIndex++) {
			    Student student = studentLists.get(studentIndex);

			    for (int activityIndex = 0; activityIndex < activitiesList.size(); activityIndex++) {
			        Activity activity = activitiesList.get(activityIndex);
			        List<Double> studentActivityNumbers = dataReader.getActivityNumbers().get(studentIndex);

			        if (activityIndex < studentActivityNumbers.size()) {
			            double activityNumber = studentActivityNumbers.get(activityIndex);

			            Results studentResult = ObeModelFactory.eINSTANCE.createResults();
			            studentResult.setActivity(activity);
			            studentResult.setObtainedMarks(activityNumber);
			            studentResult.setStudent(student);
			            student.getResults().add(studentResult);

			            // Add the result to the corresponding sublist
			            resultsByActivity.get(activityIndex).add(studentResult);
			        }
			    }
			}
			
	        utility.addProgramToDepartment(department, program);   
	      
	        
	        //***********ADD ALL CONTENTS TO ROOT NODE ********************
	        rootNode.getInstitutes().add(university);
	        rootNode.getInstitutes().add(faculty);
	        rootNode.getInstitutes().add(department);
	        rootNode.getVisions().add(universityVision);
	        rootNode.getMissions().add(universityMission);
	        rootNode.getMissions().add(facultyMission);
	        rootNode.getMissions().add(departmentMission);
	        rootNode.getPeos().addAll(peoList);
	        rootNode.getPlos().addAll(ploList);
	        rootNode.getPrograms().add(program);
	        rootNode.getBatches().add(batch);
	        rootNode.getCourses().add(course);
	        rootNode.getLearninglevels().addAll(learningLevelsList);
	        rootNode.getClos().addAll(CloList);
	        rootNode.getActivitties().addAll(activitiesList);
	        rootNode.getStudents().addAll(studentLists);
	        for (List<Results> result : resultsByActivity) {
			rootNode.getResults().addAll(result);
	       }
	        
	      
	        //***********MODEL CREATION SECTION********************
	        String modelPath  = "model/ExcelOBE.xmi";
	        ResourceSet resourceSet = new ResourceSetImpl();
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	        URI fileUri = URI.createFileURI(new File(modelPath).getAbsolutePath());
	        Resource resource = resourceSet.createResource(fileUri);
	        resource.getContents().add(rootNode);
	       	resource.save(Collections.EMPTY_MAP); 
	       	System.out.print("XMI MODEL CREATED SUCCESSFULLY AT PATH : " + modelPath);
	       	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
 
	}
}

