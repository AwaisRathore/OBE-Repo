import ObeModel.Activity;
import ObeModel.ActivityType;
import ObeModel.AssesmentType;
import ObeModel.Batches;
import ObeModel.CLO;
import ObeModel.Courses;
import ObeModel.Institute;
import ObeModel.LearningDomain;
import ObeModel.LearningLevels;
import ObeModel.Mission;
import ObeModel.ObeModelPackage;
import ObeModel.PEO;
import ObeModel.Plo;
import ObeModel.Program;
import ObeModel.Results;
import ObeModel.Student;
import ObeModel.Vision;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelToText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "model/evaluation.txt";
		   // Register the package URI
        Registry.INSTANCE.put("http://www.example.org/ObeModel", ObeModelPackage.eINSTANCE);

        // Specify the path to your .xmi file
        String xmiFilePath = "model/ExcelOBE.xmi"; // Update with your file path

        // Register the XMI resource factory
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        // Initialize the EMF ResourceSet
        ResourceSet resourceSet = new ResourceSetImpl();

        // Create a URI for the .xmi file
        org.eclipse.emf.common.util.URI xmiFileURI = org.eclipse.emf.common.util.URI.createFileURI(xmiFilePath);

        // Load the resource
        Resource resource = resourceSet.getResource(xmiFileURI, true);

        // Get the root element of the .xmi file
        EObject rootElement = resource.getContents().get(0);
        
        EReference roottoInstituteReference = (EReference) rootElement.eClass().getEStructuralFeature("institutes");
        EList<EObject> roottoInstituteReference_containedElements = (EList<EObject>) rootElement.eGet(roottoInstituteReference);
        
        //****************************************************INSTITUTE AND IT'S RELATED DATA*********************************************//
        for (EObject institute : roottoInstituteReference_containedElements) {
            // Access and print information about each element
        	//System.out.println(institute.eClass().getName());
            EAttribute nameAttribute = (EAttribute) institute.eClass().getEStructuralFeature("Name");
            EAttribute instituteLevelAttribute = (EAttribute) institute.eClass().getEStructuralFeature("InstituteLevel");
            
            //**************************************************REFERENCES*************************************************************************//
            EReference parentInstituteReference = (EReference) institute.eClass().getEStructuralFeature("parentInstitute"); 
            EReference instituteToVisionReference = (EReference) institute.eClass().getEStructuralFeature("associatedvision");
            EReference instituteToMissionReference = (EReference) institute.eClass().getEStructuralFeature("associatedmission");
            EReference instituteToProgramReference = (EReference) institute.eClass().getEStructuralFeature("Offerprograms");
            
            if (nameAttribute != null) {
                String name = (String) institute.eGet(nameAttribute);
                appendToFile(filePath, "Name: " + name);      
            }
            if (instituteLevelAttribute != null) {
                Object instituteLevelValue = institute.eGet(instituteLevelAttribute);
                appendToFile(filePath, "Institute Level: " + instituteLevelValue);
            }
            if (parentInstituteReference != null) {
                // Access the referenced element using the reference
                Institute parentInstituteElement = (Institute) institute.eGet(parentInstituteReference);
                if(parentInstituteElement != null) {
                	String parentInstitutename = (String) parentInstituteElement.eGet(nameAttribute);
                	appendToFile(filePath, "Parent: " + parentInstitutename);
                	
                } 
            }
            
            //*****************************VISION & IT'S RELEATED DATA **********************************************************//
            if(instituteToVisionReference != null) {
            	Vision visionElement = (Vision) institute.eGet(instituteToVisionReference);
            	if(visionElement != null) {
            		EAttribute visionStatementAttribute = (EAttribute) visionElement.eClass().getEStructuralFeature("VisionStatement");
            		if (visionStatementAttribute != null) {
                        String visionStatement = (String) visionElement.eGet(visionStatementAttribute);
                        appendToFile(filePath, "Vision: " + visionStatement);      
                    }
            		
            	}
            }
          //*****************************Mission  & IT'S RELEATED DATA **********************************************************//
            if(instituteToMissionReference != null) {
            	Mission missionElement = (Mission) institute.eGet(instituteToMissionReference);
            	if(missionElement != null) {
            		EAttribute missionStatementAttribute = (EAttribute) missionElement.eClass().getEStructuralFeature("MissionStatement");
            		if (missionStatementAttribute != null) {
                        String missionStatement = (String) missionElement.eGet(missionStatementAttribute);
                        appendToFile(filePath, "Mission: " + missionStatement);      
                    }
            		
            	}
            }
          //*****************************PROGRAM **********************************************************//
            
            if(instituteToProgramReference != null) {
            	EList<Program> programs = (EList<Program>)institute.eGet(instituteToProgramReference);
            	for (Program program : programs) {
            		EAttribute programNameAttribute = (EAttribute) program.eClass().getEStructuralFeature("name");
            		if (programNameAttribute != null) {
            			 String programName = (String) program.eGet(programNameAttribute);
            			 appendToFile(filePath, "\nOffered Program: " + programName); 
            		}
           //*****************************PROGRAM OBJECTIVES **********************************************************//	
            		EReference	programToPEOReference = (EReference) program.eClass().getEStructuralFeature("programobjectives");
            		if(programToPEOReference != null) {
            			EList<PEO> peos = (EList<PEO>)program.eGet(programToPEOReference);
            			appendToFile(filePath, "\n" + "------------------Program Educational Objectives------------------");
            			for (PEO peo : peos) {
            				EAttribute peoTitleAttribute = (EAttribute) peo.eClass().getEStructuralFeature("Title");
            				EAttribute peoStatementAttribute = (EAttribute) peo.eClass().getEStructuralFeature("PEOStatement");
            				EAttribute peoThresholdAttribute = (EAttribute) peo.eClass().getEStructuralFeature("threshold");
            				
            				if (peoTitleAttribute != null) {
                   			 String peoTitle = (String) peo.eGet(peoTitleAttribute);
                   			 appendToFile(filePath, "\n" + peoTitle); 
            				}
            				if (peoStatementAttribute != null) {
                      			 String peoStatement = (String) peo.eGet(peoStatementAttribute);
                      			 appendToFile(filePath, "Statement: " + peoStatement); 
               				}
            				if (peoThresholdAttribute != null) {
                     			 Integer peoThreshold = (Integer) peo.eGet(peoThresholdAttribute);
                     			 appendToFile(filePath, "Passing Threshold: " + peoThreshold); 
              				}
            				
            			}
            			
            		}
            //*****************************PROGRAM LEARNING OUTCOMES **********************************************************//	
            	EReference	programToPLOReference = (EReference) program.eClass().getEStructuralFeature("programlearningoutcomes");
            	if(programToPLOReference != null) {
            		EList<Plo> plos = (EList<Plo>)program.eGet(programToPLOReference);
            		appendToFile(filePath, "\n" + "------------------Program Learning Outcomes------------------"); 
            		for (Plo plo : plos) {
            			EAttribute ploTitleAttribute = (EAttribute) plo.eClass().getEStructuralFeature("Title");
            			if (ploTitleAttribute != null) {
                  			 String ploTitle = (String) plo.eGet(ploTitleAttribute);
                  			 appendToFile(filePath, "\t" + ploTitle); 
           				}
            		}
            		
           //***************************** PEO - PLO Mappings **********************************************************// 
            		appendToFile(filePath, "\n" + "------------------PLO - PEO Mappings ------------------"); 
            		for (Plo plo : plos) {
            			EAttribute ploTitleAttribute = (EAttribute) plo.eClass().getEStructuralFeature("Title");
            			
            			if (ploTitleAttribute != null) {
                  			String ploTitle = (String) plo.eGet(ploTitleAttribute);
                  			EReference	plotoPeoMappingReference = (EReference) plo.eClass().getEStructuralFeature("peo");
                  			if(plotoPeoMappingReference !=null) {
                  				PEO peo = (PEO)plo.eGet(plotoPeoMappingReference);
                  				EAttribute peoTitleAttribute = (EAttribute) peo.eClass().getEStructuralFeature("Title");
                  				if (peoTitleAttribute != null) {
                         			 String peoTitle = (String) peo.eGet(peoTitleAttribute); 
                         			 appendToFile(filePath, "\t" + ploTitle + " : " + peoTitle);
                  				}
                  			} 
                  			 
                  			 
           				}
            		}
            	}
            	
            	
            //***************************** Program Courses **********************************************************//      	
            EReference	programToCoursesReference = (EReference) program.eClass().getEStructuralFeature("offeredcourses");
            if(programToCoursesReference != null) {
            	EList<Courses> courses = (EList<Courses>)program.eGet(programToCoursesReference);
            	appendToFile(filePath, "\n" + "------------------Courses Offered ------------------"); 
            	for (Courses course : courses) {
            		EAttribute courseNameAttribute = (EAttribute) course.eClass().getEStructuralFeature("Name");
            		String courseName = (String) course.eGet(courseNameAttribute); 
            		appendToFile(filePath, "\t Course Name : " + courseName );
            //*****************************  Courses to CLO **********************************************************//
            		EReference	coursetoCLOReference = (EReference) course.eClass().getEStructuralFeature("learningoutcomes");
            		if(coursetoCLOReference !=null) {
            			EList<CLO> clos = (EList<CLO>)course.eGet(coursetoCLOReference);
            			for (CLO clo : clos) {
            				EAttribute cloStamentAttribute = (EAttribute) clo.eClass().getEStructuralFeature("Statement");
            				String cloStatement = (String) clo.eGet(cloStamentAttribute);
            				appendToFile(filePath, "\t CLO : " + cloStatement );
            				
            //*****************************  CLO to Learning Levels  and Domain **********************************************************//	
            		EReference	clotolearningLevelReference = (EReference) clo.eClass().getEStructuralFeature("learninglevels");
            		if(clotolearningLevelReference !=null) {
            			LearningLevels learningLevel = (LearningLevels) clo.eGet(clotolearningLevelReference);
            			EAttribute learningLevelAttribute = (EAttribute) learningLevel.eClass().getEStructuralFeature("Level");
            			EAttribute learningdomainAttribute = (EAttribute) learningLevel.eClass().getEStructuralFeature("domain");
            			String clolearningLevel = (String) learningLevel.eGet(learningLevelAttribute);
            			LearningDomain clolearningDomain = (LearningDomain) learningLevel.eGet(learningdomainAttribute);
            			appendToFile(filePath, "\t Learning Domain : " + clolearningDomain);
            			appendToFile(filePath, "\t Learning Level : " + clolearningLevel);
            			
            		}
           //*****************************  CLO to PLO Mapping **********************************************************//		
            		
            		EReference	clotoPLOReference = (EReference) clo.eClass().getEStructuralFeature("maptoplo");
            		if(clotoPLOReference != null) {
            			Plo plo = (Plo) clo.eGet(clotoPLOReference);
            			EAttribute ploTitleAttribute = (EAttribute) plo.eClass().getEStructuralFeature("Title");
            			String ploName = (String) plo.eGet(ploTitleAttribute);
            			appendToFile(filePath, "\t Mapped to PLO : " + ploName);
            		}
            		
            		appendToFile(filePath, "\n");
				}
            			
            }
			}           		
            }	
            	
            //***************************** Program To Batch Reference **********************************************************//      	
            
            EReference	programToBatchesReference = (EReference) program.eClass().getEStructuralFeature("associatedbatches");
            if(programToBatchesReference !=null) {
            	EList<Batches> batches = (EList<Batches>)program.eGet(programToBatchesReference);
            	appendToFile(filePath, "\n" + "------------------ Batches In Program ------------------"); 
            	for (Batches batch : batches) {
            		EAttribute batchNameAttribute = (EAttribute) batch.eClass().getEStructuralFeature("Name");
            		EAttribute indvThresholdAttribute = (EAttribute) batch.eClass().getEStructuralFeature("IndvThreshold");
            		EAttribute cohortThresholdAttribute = (EAttribute) batch.eClass().getEStructuralFeature("ChortLevelThreshold");
            		String batchName = (String) batch.eGet(batchNameAttribute);
            		Integer indvLevelThreshold = (Integer) batch.eGet(indvThresholdAttribute);
            		Integer cohortLevelThreshold = (Integer) batch.eGet(cohortThresholdAttribute);
            		appendToFile(filePath, "\t Batch : " + batchName);
            		appendToFile(filePath, "\t Indviduval Level Threshold : " + indvLevelThreshold);
            		appendToFile(filePath, "\t Cohort Level Threshold : " + cohortLevelThreshold);
            				
            		//***************************** Student in Batch  **********************************************************//      	
            		EReference	batchToStudentReference = (EReference) batch.eClass().getEStructuralFeature("students");
            		if(batchToStudentReference != null) {
            			EList<Student> students = (EList<Student>)batch.eGet(batchToStudentReference);
            			appendToFile(filePath, "\n" + "------------------ Students ------------------"); 
            			 Map<CLO, List<Double>> individualCloPercentageMap = new HashMap<>();	 
            			 // Loop over individual CLOs for the student
                     	Map<Plo, Double> ploTotalScoreMap = new HashMap<>();
                     	Map<Plo, Double> ploTotalWeightMap = new HashMap<>();
                     	
            			for (Student student : students) {
            				EAttribute studentNameAttribute = (EAttribute) student.eClass().getEStructuralFeature("Name");
            				EAttribute studentRollNumberAttribute = (EAttribute) student.eClass().getEStructuralFeature("RollNumber");
            				String studentName = (String) student.eGet(studentNameAttribute);
            				String studentRollNumber = (String) student.eGet(studentRollNumberAttribute);
            				appendToFile(filePath, "\t Name : " + studentName);
            				appendToFile(filePath, "\t Roll Number : " + studentRollNumber);
            		 //***************************** Student Course  **********************************************************//	
            		EReference	studentToCourseReference = (EReference) student.eClass().getEStructuralFeature("registercourse");
            		if(studentToCourseReference !=null) {
            			EList<Courses> courses = (EList<Courses>)student.eGet(studentToCourseReference);
            			for (Courses course : courses) {
                    		EAttribute courseNameAttribute = (EAttribute) course.eClass().getEStructuralFeature("Name");
                    		String courseName = (String) course.eGet(courseNameAttribute); 
                    		appendToFile(filePath, "\t Course Name : " + courseName );
                    		
                    		
                    //***************************** Student Results  **********************************************************//	
                    EReference	studentToResultReference = (EReference) student.eClass().getEStructuralFeature("results");
                    if(studentToResultReference !=null) {
                    	EList<Results> studentResults = (EList<Results>)student.eGet(studentToResultReference);
                    	 // Map to store individual-level variables for each CLO
                        Map<CLO, Double> cloTotalScoreMap = new HashMap<>();
                        Map<CLO, Double> cloTotalWeightMap = new HashMap<>();
                    	for (Results result : studentResults) {
	                		EAttribute obtainedMarksAttribute = (EAttribute) result.eClass().getEStructuralFeature("obtainedMarks");
	                      	Double  obtainedMarks = (Double) result.eGet(obtainedMarksAttribute); 
	                      	EReference	resultToActivityReference = (EReference) result.eClass().getEStructuralFeature("activity");
	                      	Activity activity = (Activity) result.eGet(resultToActivityReference);
	                      	EAttribute activityNameAttribute = (EAttribute) activity.eClass().getEStructuralFeature("Name");
                    		EAttribute activityTotalMarksAttribute = (EAttribute) activity.eClass().getEStructuralFeature("totalMarks");
                    		EAttribute assesmentTypeAttribute = (EAttribute) activity.eClass().getEStructuralFeature("AssesmentType");
                    		EAttribute activityTypeAttribute = (EAttribute) activity.eClass().getEStructuralFeature("ActivityType");
                    		EAttribute activityWeightAttribute = (EAttribute) activity.eClass().getEStructuralFeature("activityWeight");
                    		String activityName = (String) activity.eGet(activityNameAttribute); 
                    		Integer activityTotalMarks = (Integer) activity.eGet(activityTotalMarksAttribute); 
                    		AssesmentType assesmentType = (AssesmentType) activity.eGet(assesmentTypeAttribute); 
                    		ActivityType activityType = (ActivityType) activity.eGet(activityTypeAttribute); 
                    		Double activityWeight = (Double) activity.eGet(activityWeightAttribute); 
                    		appendToFile(filePath, "\t Activity Name : " + activityName );
                    		appendToFile(filePath, "\t Activity Type : " + activityType );
                    		appendToFile(filePath, "\t Weight : " + activityWeight );
                    		appendToFile(filePath, "\t AssesmentType : " + assesmentType );
                    		appendToFile(filePath, "Marks : " + obtainedMarks + " / " + activityTotalMarks );
                   		    //***************************** Activity CLO -  **********************************************************//	
                    		EReference	activityToCLOReference = (EReference) activity.eClass().getEStructuralFeature("clo");
                             if(activityToCLOReference != null) {
                             	CLO activitiyCLO = (CLO)activity.eGet(activityToCLOReference);
                             	EAttribute activitiyCLOAttribute = (EAttribute) activitiyCLO.eClass().getEStructuralFeature("Statement");
                             	String  activityCLOStatement = (String) activitiyCLO.eGet(activitiyCLOAttribute); 
                             	appendToFile(filePath, "CLO Mapping : " + activityCLOStatement );
                                
                             	EReference	cloToPLoReference = (EReference) activitiyCLO.eClass().getEStructuralFeature("maptoplo");
                             	if(cloToPLoReference != null) {
                             		Plo plo = (Plo)activitiyCLO.eGet(cloToPLoReference);
                             	// Calculate the weighted score for the activity
        	                        double weightedScore = (obtainedMarks / activityTotalMarks) * activityWeight;
        	                        // Add to individual CLO total score and total weight
        	                        cloTotalScoreMap.put(activitiyCLO, cloTotalScoreMap.getOrDefault(activitiyCLO, 0.0) + weightedScore);
        	                        cloTotalWeightMap.put(activitiyCLO, cloTotalWeightMap.getOrDefault(activitiyCLO, 0.0) + activityWeight);
        	                        
                             	}
                             }
                    		}
                       
                    	  appendToFile(filePath, "\n ----OBE Result----");
                        for (Map.Entry<CLO, Double> entry : cloTotalScoreMap.entrySet()) {
                       	 CLO clo = entry.getKey();
                            double cloTotalScore = entry.getValue();
                            double cloTotalWeight = cloTotalWeightMap.get(clo);
                            // Calculate individual percentage for the CLO
                            double individualCloPercentage = (cloTotalScore / cloTotalWeight) * 100;
                            // Add the individual percentage to the map
                            individualCloPercentageMap.computeIfAbsent(clo, k -> new ArrayList<>()).add(individualCloPercentage);
                            
                          //  System.out.println(individualCloPercentage);
                            // Compare individual percentage with individual threshold
                            appendToFile(filePath, "\t\tCLO : " + clo.getStatement());
                            if (individualCloPercentage >= indvLevelThreshold) {
                                appendToFile(filePath, "\t\tCLO Status : Passed");
                            } else {
                            	appendToFile(filePath, "\t\tCLO Status : Failed");
                            }

                            // Log individual percentage for the CLO
                            appendToFile(filePath, "\t\tAchiceved CLO % " + individualCloPercentage + "%");    
                            EReference	cloToPLoReference = (EReference) clo.eClass().getEStructuralFeature("maptoplo");
                         	if(cloToPLoReference != null) {
                         		Plo plo = (Plo)clo.eGet(cloToPLoReference);
                         		double cloWeightedScore = (cloTotalScore / cloTotalWeight);
                         	    // Add to individual PLO total score and total weight
                         	    ploTotalScoreMap.put(plo, ploTotalScoreMap.getOrDefault(plo, 0.0) + cloWeightedScore);
                         	    ploTotalWeightMap.put(plo, ploTotalWeightMap.getOrDefault(plo, 0.0) + 1); // Assuming equal weight for each CLO
                         	}
                        }
                        
                     // Loop over individual PLOs for the student
                        appendToFile(filePath, "\n ----OBE Result----");
                     //  System.out.println(ploTotalScoreMap);
                        for (Map.Entry<Plo, Double> entry : ploTotalScoreMap.entrySet()) {
                        	Plo plo = entry.getKey();
                            double ploTotalScore = entry.getValue();
                            double ploTotalWeight = ploTotalWeightMap.get(plo);

                            // Calculate average percentage for the PLO
                            double averagePloPercentage = (ploTotalScore / ploTotalWeight) * 100;

                            // Compare average PLO percentage with PLO threshold
                            appendToFile(filePath, "\t\tPLO : " + plo.getTitle());
                            if (averagePloPercentage >= indvLevelThreshold) {
                                appendToFile(filePath, "\t\tPLO Status : Passed");
                            } else {
                                appendToFile(filePath, "\t\tPLO Status : Failed");
                            }

                            // Log average percentage for the PLO
                            appendToFile(filePath, "\t\tAchieved PLO % " + averagePloPercentage + "%");
                         
                        }
                    }		
            		}
            		}	
            				
            		appendToFile(filePath, "********************************************************************** " );
            		
            	}  	
            			// CHORT LEVEL CLO REPORT
            			appendToFile(filePath, "\n ----CHORT LEVEL CLO REPORT----");
            			for (Map.Entry<CLO, List<Double>> entry : individualCloPercentageMap.entrySet()) {
            			    CLO clo = entry.getKey();
            			    List<Double> percentages = entry.getValue();
            			    int totalPercentages = percentages.size();
            			    int abovethresholdPercentCount = 0;
            			    for (Double percentage : percentages) {
            			        if (percentage > indvLevelThreshold) {
            			        	abovethresholdPercentCount++;
            			        }
            			    }
            			    appendToFile(filePath, "CLO: " + clo.getStatement());
            			    appendToFile(filePath, "\t\tTotal Students: " + totalPercentages);
            			    appendToFile(filePath, "\t\tNumber of Students above Threshold: " + abovethresholdPercentCount);
            			  
            			    double chortLevelPercentageCLO = ((double) abovethresholdPercentCount / totalPercentages) * 100;
            			    appendToFile(filePath, "\t\tPercentage of Student who pass CLO : " + chortLevelPercentageCLO);
            			    if(chortLevelPercentageCLO >= cohortLevelThreshold) {
            			    	appendToFile(filePath, "\t\t CLO Achieved at chort level :  YES");
            			    }else {
            			    	appendToFile(filePath, "\t\t CLO Achieved at chort level :  NO");
            			    }   
            			}	
            		
            			
            		}
				}
            }	
          }
            	
         }
            appendToFile(filePath, "-------------------------------------------------------------------------------------");
          }
        //**************************************************** END INSTITUTE*********************************************//
        
        
        System.out.println("Congratulations : Report generated at " + filePath);
	}
	
	
	
	
	
	
	
	
	
	
	
	   public static void appendToFile(String filePath, String data) {
	        try {
	            // Create a FileWriter with append mode
	            FileWriter fileWriter = new FileWriter(filePath, true);

	            // Wrap it in a BufferedWriter for better performance
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

	            // Append the data to the file
	            bufferedWriter.write(data);
	            bufferedWriter.newLine(); // Add a new line for separation

	            // Close the BufferedWriter (this will also close the FileWriter)
	            bufferedWriter.close();
	        } catch (IOException e) {
	            // Handle any potential I/O exceptions
	            e.printStackTrace();
	        }
	    }

}
