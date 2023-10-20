import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

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
import ObeModel.ObeModelFactory;
import ObeModel.PEO;
import ObeModel.Plo;
import ObeModel.Results;
import ObeModel.Student;
import ObeModel.Vision;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Program {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObeModelFactory factory = ObeModelFactory.eINSTANCE;
		//create an institute,faculty and department
		Institute university = factory.createInstitute();
		university.setName("University of Azad Jammu & Kashmir");
		university.setInstituteLevel(InstituteLevel.UNIVERSITY);
		
		Institute faculty = factory.createInstitute();
		faculty.setName("Faculty of Engineering");
		faculty.setInstituteLevel(InstituteLevel.FACULTY);
		faculty.setParentInstitute(university);
	
		
		Institute department = factory.createInstitute();
		department.setName("Department of Software Engineering");
		faculty.setInstituteLevel(InstituteLevel.DEPARTMENT);
		department.setParentInstitute(faculty);
		
		
		//create vision and mission statement
		Vision university_vision = factory.createVision();
		university_vision.setVisionStatement("Transformation to excellence through holistic education.");
		
		Mission university_mission = factory.createMission();
		university_mission.setMissionStatement("The University is committed to quality education, research and values-driven mentorship through innovations to serve the society and the changing world.");
		
		Mission faculty_mission = factory.createMission();
		faculty_mission.setMissionStatement("Faculty Mission");
		
		Mission department_mission = factory.createMission();
		department_mission.setMissionStatement("To prepare graduates to have concrete software engineering knowledge, real-world problem-solving skills, excellent leadership qualities, and entrepreneurial abilities for their professional growth and service to society.");
		
		//set vision and mission for institute,faculty and department
		university.setAssociatedvision(university_vision);
		university.setAssociatedmission(university_mission);
		faculty.setAssociatedmission(faculty_mission);
		department.setAssociatedmission(department_mission);
		
		//University
		
		System.out.println("University:");
		System.out.println("\t"+university.getName());
		
		System.out.println("Vision:");
		System.out.println("\t"+ university.getAssociatedvision().getVisionStatement());
		
		System.out.println("Mission:");
		System.out.println("\t"+university.getAssociatedmission().getMissionStatement());
	
		System.out.println("----------------------------------------------------------");
	
		//faculties
		System.out.println("Faculty:");
		System.out.println("\t"+faculty.getName());
		
		System.out.println("Mission:");
		System.out.println("\t"+faculty.getAssociatedmission().getMissionStatement());
		
		System.out.println("----------------------------------------------------------");
		
		//department
		System.out.println("Department:");
		System.out.println("\t"+department.getName());
		
		System.out.println("Mission:");
		System.out.println("\t"+department.getAssociatedmission().getMissionStatement());
		
		System.out.println("----------------------------------------------------------");
		
		//create programs
		
		ObeModel.Program program = factory.createProgram();
		program.setName("BSc Software Engineering");
		
		PEO peo1 = factory.createPEO();
		peo1.setTitle("PEO 1");
		peo1.setPEOStatement("Apply sound engineering knowledge and skills to design, analyze and investigate a problem for appropriate solutions.");
		peo1.setMission(department_mission);
		peo1.setThreshold(50);
		
		PEO peo2 = factory.createPEO();
		peo2.setTitle("PEO 2");
		peo2.setPEOStatement("Exhibit professionally sound character, having leadership qualities, adaptability in a team, and entrepreneurial skills.");
		peo2.setMission(department_mission);
		peo2.setThreshold(60);
		
		PEO peo3 = factory.createPEO();
		peo3.setTitle("PEO 3");
		peo3.setPEOStatement("Demonstrate devotion through ethical engineering practices and effective communication skills to serve the society.");
		peo3.setMission(department_mission);
		peo3.setThreshold(70);
		
		
		Plo plo1 = factory.createPlo();
		plo1.setTitle("Engineering Knowledge");
		plo1.setPeo(peo1);
		
		Plo plo2 = factory.createPlo();
		plo2.setTitle("Problem Analysis");
		plo2.setPeo(peo1);
		
		Plo plo3 = factory.createPlo();
		plo3.setTitle("Design / Development of Solutions");
		plo3.setPeo(peo1);
		
		Plo plo4 = factory.createPlo();
		plo4.setTitle("Investigation");
		plo4.setPeo(peo1);
		
		Plo plo5 = factory.createPlo();
		plo5.setTitle("Modern Tool Usage");
		plo5.setPeo(peo1);
		
		Plo plo6 = factory.createPlo();
		plo6.setTitle("The Engineer and Society");
		plo6.setPeo(peo3);
		
		Plo plo7 = factory.createPlo();
		plo7.setTitle("Environment and Sustainability");
		plo7.setPeo(peo2);
		
		Plo plo8 = factory.createPlo();
		plo8.setTitle("Ethics");
		plo8.setPeo(peo3);
		
		Plo plo9 = factory.createPlo();
		plo9.setTitle("Individual and Teamwork");
		plo9.setPeo(peo2);
		
		Plo plo10 = factory.createPlo();
		plo10.setTitle("Communication");
		plo10.setPeo(peo3);
		
		Plo plo11 = factory.createPlo();
		plo11.setTitle("Project Management");
		plo11.setPeo(peo2);
		
		Plo plo12 = factory.createPlo();
		plo12.setTitle("Lifelong Learning");
		plo12.setPeo(peo1);
		
		
		program.getProgramobjectives().add(peo1);
		program.getProgramobjectives().add(peo2);
		program.getProgramobjectives().add(peo3);
		
		program.getProgramlearningoutcomes().add(plo1);
		program.getProgramlearningoutcomes().add(plo2);
		program.getProgramlearningoutcomes().add(plo3);
		program.getProgramlearningoutcomes().add(plo4);
		program.getProgramlearningoutcomes().add(plo5);
		program.getProgramlearningoutcomes().add(plo6);
		program.getProgramlearningoutcomes().add(plo7);
		program.getProgramlearningoutcomes().add(plo8);
		program.getProgramlearningoutcomes().add(plo9);
		program.getProgramlearningoutcomes().add(plo10);
		program.getProgramlearningoutcomes().add(plo11);
		program.getProgramlearningoutcomes().add(plo12);
		
		
		
		
		
		Batches sessions_19_23 = factory.createBatches();
		sessions_19_23.setName("2019-2023");
		
		program.getAssociatedbatches().add(sessions_19_23);
		
		
		
		
		Student std1 = factory.createStudent();
		std1.setName("Riaz Ahmad Butt");
		std1.setRollNumber("2018-GMDB(B)-003500");
		std1.setBatche(sessions_19_23);
		
		
		Student std2 = factory.createStudent();
		std2.setName("Abdullah Khan");
		std2.setRollNumber("2019-UMDB-001049");
		std2.setBatche(sessions_19_23);
		
		
		Courses course1 = factory.createCourses();
		course1.setName("Programming Fundamentals");
		
		program.getOfferedcourses().add(course1);
		
		LearningLevels c1 = factory.createLearningLevels();
		c1.setDomain(LearningDomain.COGNITIVE);
		c1.setLevel("C2 - Comprehension");
		LearningLevels c3 = factory.createLearningLevels();
		c3.setDomain(LearningDomain.COGNITIVE);
		c3.setLevel("C3 - Application");
		LearningLevels c5 = factory.createLearningLevels();
		c5.setDomain(LearningDomain.COGNITIVE);
		c5.setLevel("C5 - Synthesis");
		
		
		
		CLO clo1 = factory.createCLO();
		clo1.setStatement("Understand basic programming principles and logic constructs.");
		clo1.setMaptoplo(plo11);
		clo1.setLearninglevels(c1);
		
		CLO clo2 = factory.createCLO();
		clo2.setStatement("Apply programming technique's to solve various problems.");
		clo2.setMaptoplo(plo3);
		clo2.setLearninglevels(c3);
		
		CLO clo3 = factory.createCLO();
		clo3.setStatement("Apply programming technique's to solve various problems.");
		clo3.setMaptoplo(plo3);
		clo3.setLearninglevels(c5);
		
		
		course1.getLearningoutcomes().add(clo1);
		course1.getLearningoutcomes().add(clo2);
		course1.getLearningoutcomes().add(clo3);
		
		std1.getRegistercourse().add(course1);
		std2.getRegistercourse().add(course1);
		
		
		//clo1 activites
		Activity q1	= factory.createActivity();
		q1.setName("Quiz 1");
		q1.setClo(clo1);
		q1.setActivityType(ActivityType.QUIZ);
		q1.setActivityWeight(20);
		q1.setTotalMarks(10);
		
		Activity a1	= factory.createActivity();
		a1.setName("Assingment 1");
		a1.setClo(clo1);
		a1.setActivityType(ActivityType.ASSIGNMENT);
		a1.setActivityWeight(20);
		a1.setTotalMarks(10);
		
		
		Activity m1	= factory.createActivity();
		m1.setName("Mid Term (Q1 + Q3)");
		m1.setClo(clo1);
		m1.setActivityType(ActivityType.MID);
		m1.setActivityWeight(40);
		m1.setTotalMarks(20);
		
		Activity t1	= factory.createActivity();
		t1.setName("Terminal - Q1");
		t1.setClo(clo1);
		t1.setActivityType(ActivityType.FINALS);
		t1.setActivityWeight(20);
		t1.setTotalMarks(10);
		
		//clo2 activites
		
		Activity q2	= factory.createActivity();
		q2.setName("Q2");
		q2.setClo(clo2);
		q2.setActivityType(ActivityType.QUIZ);
		q2.setActivityWeight(22.22);
		q2.setTotalMarks(10);
		
		Activity a2	= factory.createActivity();
		a2.setName("A2");
		a2.setClo(clo2);
		a2.setActivityType(ActivityType.ASSIGNMENT);
		a2.setActivityWeight(22.22);
		a2.setTotalMarks(10);
			
		Activity m2	= factory.createActivity();
		m2.setName("Mid Term (Q2)");
		m2.setClo(clo2);
		m2.setActivityType(ActivityType.MID);
		m2.setActivityWeight(22.22);
		m2.setTotalMarks(10);
		
		Activity t2	= factory.createActivity();
		t2.setName("Terminal - Q2");
		t2.setClo(clo2);
		t2.setActivityType(ActivityType.FINALS);
		t2.setActivityWeight(33.34);
		t2.setTotalMarks(15);
		
		//clo3 activites
		
		Activity t3	= factory.createActivity();
		t3.setName("Terminal - Q3");
		t3.setClo(clo3);
		t3.setActivityType(ActivityType.FINALS);
		t3.setActivityWeight(100);
		t3.setTotalMarks(25);
		
		
		
		course1.getActivities().add(q1);
		course1.getActivities().add(q2);
		course1.getActivities().add(a1);
		course1.getActivities().add(a2);
		course1.getActivities().add(m1);
		course1.getActivities().add(m2);
		course1.getActivities().add(t1);
		course1.getActivities().add(t2);
		course1.getActivities().add(t3);
		
		
		
		Student[] students = {std1, std2};
		
		double[] quizMarks_q1 = {6,2.50};
		double[] quizMarks_q2 = {0,8};
		
		double[] assingmentMarks_a1 = {8.5,6.5};
		double[] assingmentMarks_a2 = {8,7.5};
		
		
		double[] midMarks_m1 = {7.50,5.50};
		double[] midMarks_m2 = {5.50,3};
		
		double[] terminalMarks_t1 = {9,9};
		double[] terminalMarks_t2 = {12,12.50};
		double[] terminalMarks_t3 = {20,18.50};
	
		
		
		
		List<Results> quiz_res_q1 = updateMarks(students, q1,quizMarks_q1);
		List<Results> quiz_res_q2 = updateMarks(students, q2,quizMarks_q2);
		
		
		List<Results> assg_res_a1 = updateMarks(students, a1,assingmentMarks_a1);
		List<Results> assg_res_a2 = updateMarks(students, a2,assingmentMarks_a2);
		
		List<Results> mid_res_m1 = updateMarks(students, m1,midMarks_m1);
		List<Results> mid_res_m2 = updateMarks(students, m2,midMarks_m2);
		
		
		List<Results> terminal_res_t1 = updateMarks(students, t1,terminalMarks_t1);
		List<Results> terminal_res_t2 = updateMarks(students, t2,terminalMarks_t2);
		List<Results> terminal_res_t3 = updateMarks(students, t3,terminalMarks_t3);
		
		
		 
		List<List<Results>> allResults = new ArrayList<>();
		allResults.add(quiz_res_q1);
		allResults.add(quiz_res_q2);
		allResults.add(assg_res_a1);
		allResults.add(assg_res_a2);
		allResults.add(mid_res_m1);
		allResults.add(mid_res_m2);
		allResults.add(terminal_res_t1);
		allResults.add(terminal_res_t2);
		allResults.add(terminal_res_t3);
		
		printStudentResults(students, allResults);
		printCLOReport(students, course1, allResults);
		// Call the 'getCLOPercentages' function to get the obtained CLO percentages
	    printChortLevelCloResult(students, course1, allResults);

	    
		
		
		
		
		
		
		

		
		
		
		
		department.getOfferprograms().add(program);
		
		for (ObeModel.Program prog : department.getOfferprograms()) {
			System.out.println("Program:");
			System.out.println("\t"+ prog.getName());
			System.out.println("Program Educational Objectives (PEO's):");
			for (PEO peo : prog.getProgramobjectives()) {
				System.out.println("\t"+ peo.getPEOStatement() + "\t\t" + "Passing Threshold: " + peo.getThreshold() + "%");
			}
			System.out.println("----------------------------------------------------------");
			System.out.println("Program Learning Outcomes (PLO's):");
			for (Plo plo : prog.getProgramlearningoutcomes()) {
				System.out.println("\t"+ plo.getTitle());
			}
			System.out.println("----------------------------------------------------------");
			
			System.out.println("Mapping Program Learning Outcomes (PLO's) -> Program Educational Objectives (PEO's):");
			for (Plo plo : prog.getProgramlearningoutcomes()) {
				System.out.println("\t"+ plo.getTitle() + " : " + plo.getPeo().getTitle());
				
			}
			System.out.println("----------------------------------------------------------");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	public static List<Results> updateMarks(Student students[], Activity activity,double studentMarks[]) {
		
		List<Results> results = new ArrayList<>();
		for (int i = 0; i < students.length; i++) {
			 Results studentResult = ObeModelFactory.eINSTANCE.createResults();		
			 studentResult.setActivity(activity);
			 studentResult.setObtainedMarks(studentMarks[i]);
			 studentResult.setStudent(students[i]);
			 results.add(studentResult);
			 students[i].getResults().add(studentResult);
		}
		return results;
	}
	
	public static void printStudentResults(Student[] students, List<List<Results>> allResults) {
	    for (Student student : students) {
	        System.out.println("Student: " + student.getName());

	        for (List<Results> resultType : allResults) {
	            for (Results result : resultType) {
	                if (result.getStudent().equals(student)) {
	                    System.out.println(result.getActivity().getName() + " Marks: " + result.getObtainedMarks());
	                    break;
	                }
	            }
	        }

	        System.out.println(); // Add a line break after each student's marks
	    }
	}

	
	public static void printCLOReport(Student[] students, Courses course, List<List<Results>> allResults) {
	    List<CLO> clos = course.getLearningoutcomes();
	    
	    for (Student student : students) {
	        System.out.println("Student: " + student.getName());
	        
	        for (CLO clo : clos) {
	        	 double obtainedCLOPercentage = 0;
	            System.out.println("CLO: " + clo.getStatement());
	            
	            for (Activity activity : clo.getActivity()) {
	            	 double obtainedMarks = 0;
	            	 double totalMarks = 0;
	 	           
	                System.out.println("Activity: " + activity.getName());
	                totalMarks = activity.getTotalMarks();
	                double activityweight = activity.getActivityWeight();
	                for (List<Results> resultType : allResults) {
	                    for (Results result : resultType) {
	                        if (result.getStudent().equals(student) && result.getActivity().equals(activity)) {
	                            obtainedMarks = result.getObtainedMarks();   
	                            obtainedCLOPercentage += ((obtainedMarks/totalMarks) * activityweight);
	                            break;
	                        }
	                    }
	                }
	            }
	            System.out.println("CLO Obtained Percentage: " + obtainedCLOPercentage + "%");
	            
	            if (obtainedCLOPercentage >= 50) {
	                System.out.println("CLO Status: Pass");
	            } else {
	                System.out.println("CLO Status : Fail");
	            }
	            
	            System.out.println(); // Add a line break after each CLO report
	        }
	        
	        System.out.println(); // Add a line break after each student's report
	    }
	}



	public static Map<CLO, List<Double>> getCLOPercentages(Student[] students, Courses course, List<List<Results>> allResults) {
	    List<CLO> clos = course.getLearningoutcomes();
	    Map<CLO, List<Double>> cloPercentages = new HashMap<>();
	    
	    for (CLO clo : clos) {
	        List<Double> percentages = new ArrayList<>();
	        
	        for (Student student : students) {
	            double obtainedCLOPercentage = 0.0;
	            for (Activity activity : clo.getActivity()) {
	                double obtainedMarks = 0.0;
	                double totalMarks = activity.getTotalMarks();
	                double activityWeight = activity.getActivityWeight() ;// Get the activity weight
	                
	                for (List<Results> resultType : allResults) {
	                    for (Results result : resultType) {
	                        if (result.getStudent().equals(student) && result.getActivity().equals(activity)) {
	                            obtainedMarks = result.getObtainedMarks();
	                            break;
	                        }
	                    }
	                }
	                
	                obtainedCLOPercentage += (obtainedMarks / totalMarks) * activityWeight;
	                
	            }             
	            percentages.add(obtainedCLOPercentage);
	        }
	        
	        cloPercentages.put(clo, percentages);
	    }
	    
	    return cloPercentages;
	}

	public static void printChortLevelCloResult(Student[] students, Courses course, List<List<Results>> allResults) {
		Map<CLO, List<Double>> cloPercentages = getCLOPercentages(students, course, allResults);
	    int totalStudents = students.length;
	    for (Map.Entry<CLO, List<Double>> entry : cloPercentages.entrySet()) {
	        CLO clo = entry.getKey();
	        List<Double> percentages = entry.getValue();

	        int studentsAbove50Count = 0;

	        // Count the number of students above 50% for the current CLO
	        for (double percentage : percentages) {
	            if (percentage > 50) {
	                studentsAbove50Count++;
	            }
	        }

	        double studentsAbove50Percentage = (double) studentsAbove50Count / totalStudents * 100;

	        System.out.println("CLO: " + clo.getStatement());
	        System.out.println("Total Students: " + totalStudents);
	        System.out.println("Students Above 50%: " + studentsAbove50Count);
	        System.out.println("Percentage of Students Above 50%: " + studentsAbove50Percentage + "%");

	        // Check if the percentage is above 60% to classify it as achieved at the cohort level
	        if (studentsAbove50Percentage > 60) {
	            System.out.println("CLO Achieved at Cohort Level");
	        }else {
	        	System.out.println("CLO Failed at Cohort Level");
	        }

	        System.out.println();
	    }
	}
	
	
	
	
	
	
	
}
