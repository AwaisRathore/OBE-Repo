import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class ObeUtility {

        private ObeModelFactory factory;

        public ObeUtility(ObeModelFactory factory) {
            this.factory = factory;
        }

        public Institute createInstitute(String name, InstituteLevel level, Institute parentInstitute) {
            Institute institute = factory.createInstitute();
            institute.setName(name);
            institute.setInstituteLevel(level);
            institute.setParentInstitute(parentInstitute);

            return institute;
        }

        public Vision createVision(String visionStatement) {
            Vision vision = factory.createVision();
            vision.setVisionStatement(visionStatement);

            return vision;
        }

        public Mission createMission(String missionStatement) {
            Mission mission = factory.createMission();
            mission.setMissionStatement(missionStatement);

            return mission;
        }

        public void setVisionMission(Institute institute, Vision vision, Mission mission) {
            institute.setAssociatedvision(vision);
            institute.setAssociatedmission(mission);
        }

        public void setMission(Institute institute, Mission mission) {
            institute.setAssociatedmission(mission);
        }

        public void displayInstituteInformation(Institute institute) {
            System.out.println("Institute:");
            System.out.println("\t" + institute.getName());

            System.out.println("Mission:");
            System.out.println("\t" + institute.getAssociatedmission().getMissionStatement());

            if (institute.getAssociatedvision() != null) {
                System.out.println("Vision:");
                System.out.println("\t" + institute.getAssociatedvision().getVisionStatement());
            }

            System.out.println("----------------------------------------------------------");
        }
        public ObeModel.Program createProgram(String name) {
            ObeModel.Program program = factory.createProgram();
            program.setName(name);

            return program;
        }

        public PEO createPEO(String title, String peoStatement, Mission mission, int threshold) {
            PEO peo = factory.createPEO();
            peo.setTitle(title);
            peo.setPEOStatement(peoStatement);
            peo.setMission(mission);
            peo.setThreshold(threshold);

            return peo;
        }

        public Plo createPlo(String title, PEO peo) {
            Plo plo = factory.createPlo();
            plo.setTitle(title);
            plo.setPeo(peo);

            return plo;
        }

        public void addProgramObjective(ObeModel.Program program, PEO peo) {
            program.getProgramobjectives().add(peo);
        }

        public void addProgramLearningOutcome(ObeModel.Program program, Plo plo) {
            program.getProgramlearningoutcomes().add(plo);
        }

        public Batches createBatches(String name) {
            Batches batches = factory.createBatches();
            batches.setName(name);

            return batches;
        }

        public void addBatchToProgram(ObeModel.Program program, Batches batches) {
            program.getAssociatedbatches().add(batches);
        }

        public Student createStudent(String name, String rollNumber, Batches batches) {
            Student student = factory.createStudent();
            student.setName(name);
            student.setRollNumber(rollNumber);
            student.setBatche(batches);

            return student;
        }

        public Courses createCourse(String name) {
            Courses course = factory.createCourses();
            course.setName(name);

            return course;
        }

        public void addCourseToProgram(ObeModel.Program program, Courses course) {
            program.getOfferedcourses().add(course);
        }
        
        public  void addProgramToDepartment(Institute department, ObeModel.Program program) {
            department.getOfferprograms().add(program);
        }
        
        public LearningLevels createLearningLevel(LearningDomain domain, String level) {
            LearningLevels learningLevel = factory.createLearningLevels();
            learningLevel.setDomain(domain);
            learningLevel.setLevel(level);
            return learningLevel;
        }

        public CLO createCLO(String statement, Plo mappedPlo, LearningLevels learningLevel) {
            CLO clo = factory.createCLO();
            clo.setStatement(statement);
            clo.setMaptoplo(mappedPlo);
            clo.setLearninglevels(learningLevel);
            return clo;
        }

        public void associateCLOWithCourse(Courses course, CLO clo) {
            course.getLearningoutcomes().add(clo);
        }

        public void associateCourseWithStudent(Student student, Courses course) {
            student.getRegistercourse().add(course);
        }
        
        public Activity createActivity(String name, CLO clo, ActivityType activityType, double activityWeight, int totalMarks) {
            Activity activity = factory.createActivity();
            activity.setName(name);
            activity.setClo(clo);
            activity.setActivityType(activityType);
            activity.setActivityWeight(activityWeight);
            activity.setTotalMarks(totalMarks);
            return activity;
        }

        public void addActivityToCourse(Courses course, Activity activity) {
            course.getActivities().add(activity);
        }

    	public List<Results> updateMarks(Student students[], Activity activity,double studentMarks[]) {
    		
    		List<Results> results = new ArrayList<>();
    		for (int i = 0; i < students.length; i++) {
    			 Results studentResult = factory.createResults();		
    			 studentResult.setActivity(activity);
    			 studentResult.setObtainedMarks(studentMarks[i]);
    			 studentResult.setStudent(students[i]);
    			 results.add(studentResult);
    			 students[i].getResults().add(studentResult);
    		}
    		return results;
    	}
        
    	public  void printStudentResults(Student[] students, List<List<Results>> allResults) {
    		System.out.println("Student Marks: ");
    	    for (Student student : students) {
    	        System.out.println("\tStudent: " + student.getName());

    	        for (List<Results> resultType : allResults) {
    	            for (Results result : resultType) {
    	                if (result.getStudent().equals(student)) {
    	                    System.out.println( "\t"+ result.getActivity().getName() + " Marks: " + result.getObtainedMarks());
    	                    break;
    	                }
    	            }
    	        }

    	        System.out.println(""); // Add a line break after each student's marks
    	    }
    	    
    	    System.out.println("----------------------------------------------------------");
    	}

    	
    	public  void printCLOReport(Student[] students, Courses course, List<List<Results>> allResults) {
    	    List<CLO> clos = course.getLearningoutcomes();
    	    System.out.println("INDIVIDUAL LEVEL CLO REPORT :");
    	    for (Student student : students) {
    	        System.out.println("Student: " + student.getName());
    	        
    	        for (CLO clo : clos) {
    	        	 double obtainedCLOPercentage = 0;
    	        	 System.out.println("\tCLO: " + clo.getStatement());
    	            
    	            for (Activity activity : clo.getActivity()) {
    	            	 double obtainedMarks = 0;
    	            	 double totalMarks = 0;
    	 	           
//    	                System.out.println("\tActivity: " + activity.getName());
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
    	            System.out.println("\tCLO Obtained Percentage: " + obtainedCLOPercentage + "%");
    	            
    	            if (obtainedCLOPercentage >= 50) {
    	                System.out.println("\tCLO Status: Pass");
    	            } else {
    	                System.out.println("\tCLO Status : Fail");
    	            }
    	            
    	            System.out.println(); // Add a line break after each CLO report
    	        }
    	        
    	        System.out.println(); // Add a line break after each student's report
    	    }
    	    System.out.println("----------------------------------------------------------");
    	}

    	public void printCLOPLOReport(Student[] students, Courses course, List<List<Results>> allResults) {
    	    List<CLO> clos = course.getLearningoutcomes();
    	    System.out.println("INDIVIDUAL LEVEL CLO REPORT:");

    	    for (Student student : students) {
    	        System.out.println("Student: " + student.getName());

    	        // Map PLOs to a list of associated CLOs
    	        Map<Plo, List<CLO>> ploToCloMap = new HashMap<>();
    	        Map<CLO, Double> cloPercentages = new HashMap<>();

    	        for (CLO clo : clos) {
    	            Plo plo = clo.getMaptoplo();
    	            ploToCloMap.computeIfAbsent(plo, key -> new ArrayList<>()).add(clo);
    	            cloPercentages.put(clo, 0.0);
    	        }

    	        for (Map.Entry<Plo, List<CLO>> entry : ploToCloMap.entrySet()) {
    	            Plo plo = entry.getKey();
    	            List<CLO> associatedClos = entry.getValue();
    	            double totalCLOPercentage = 0;

    	            System.out.println("\tPLO: " + plo.getTitle());

    	            for (CLO clo : associatedClos) {
    	                double obtainedCLOPercentage = 0;
    	                double totalWeight = 0;

    	                for (Activity activity : clo.getActivity()) {
    	                    double obtainedMarks = 0;
    	                    double totalMarks = activity.getTotalMarks();
    	                    double activityWeight = activity.getActivityWeight();

    	                    for (List<Results> resultType : allResults) {
    	                        for (Results result : resultType) {
    	                            if (result.getStudent().equals(student) && result.getActivity().equals(activity)) {
    	                                obtainedMarks = result.getObtainedMarks();
    	                                obtainedCLOPercentage += (obtainedMarks / totalMarks) * activityWeight;
    	                                totalWeight += activityWeight;
    	                                break;
    	                            }
    	                        }
    	                    }
    	                }

    	                System.out.println("\t\tCLO: " + clo.getStatement());
    	                System.out.println("\t\tCLO Obtained Percentage: " + obtainedCLOPercentage + "%");

    	                if (obtainedCLOPercentage >= 50) {
    	                    System.out.println("\t\tCLO Status: Pass");
    	                } else {
    	                    System.out.println("\t\tCLO Status: Fail");
    	                }

    	                cloPercentages.put(clo, obtainedCLOPercentage);
    	                totalCLOPercentage += obtainedCLOPercentage;
    	            }

    	            // Calculate average CLO percentage for multiple CLOs mapped to the same PLO
//    	            if (associatedClos.size() > 1) {
    	                double averageCLOPercentage = totalCLOPercentage / associatedClos.size();
    	                System.out.println("\tAverage CLO Percentage for PLO: " + averageCLOPercentage + "%");

    	                if (averageCLOPercentage >= 50) {
    	                    System.out.println("\tPLO Status: Pass");
    	                } else {
    	                    System.out.println("\tPLO Status: Fail");
    	                }
//    	            }

    	            System.out.println(); // Add a line break after each PLO report
    	        }

    	      
    	        System.out.println(); // Add a line break after each student's report
    	    }

    	    System.out.println("----------------------------------------------------------");
    	}


    	public  Map<CLO, List<Double>> getCLOPercentages(Student[] students, Courses course, List<List<Results>> allResults) {
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

    	public  void printChortLevelCloResult(Student[] students, Courses course, List<List<Results>> allResults,double indThreshold, double cohortThreshold) {
    		System.out.println("CHORT LEVEL CLO RESULT: ");
    		Map<CLO, List<Double>> cloPercentages = getCLOPercentages(students, course, allResults);
    	    int totalStudents = students.length;
    	    for (Map.Entry<CLO, List<Double>> entry : cloPercentages.entrySet()) {
    	        CLO clo = entry.getKey();
    	        List<Double> percentages = entry.getValue();

    	        int studentsAboveThreshold = 0;

    	        // Count the number of students above 50% for the current CLO
    	        for (double percentage : percentages) {
    	            if (percentage > indThreshold) {
    	            	studentsAboveThreshold++;
    	            }
    	        }

    	        double studentsAboveThresholdPercentage = (double) studentsAboveThreshold / totalStudents * 100;

    	        System.out.println("\tCLO: " + clo.getStatement());
    	        System.out.println("\tTotal Students: " + totalStudents);
    	        System.out.println("\tStudents Above 50%: " + studentsAboveThreshold);
    	        System.out.println("\tPercentage of Students Above 50%: " + studentsAboveThresholdPercentage + "%");

    	        // Check if the percentage is above 60% to classify it as achieved at the cohort level
    	        if (studentsAboveThresholdPercentage > cohortThreshold) {
    	            System.out.println("\tCLO Achieved at Cohort Level");
    	        }else {
    	        	System.out.println("\tCLO Failed at Cohort Level");
    	        }

    	        System.out.println();
    	    }
    	    System.out.println("----------------------------------------------------------");
    	}
        
        
        
        
    	public Map<Plo, Double> getCohortPLOPercentages(Student[] students, Courses course, List<List<Results>> allResults) {
    	    List<CLO> clos = course.getLearningoutcomes();
    	    Map<Plo, List<Double>> ploPercentages = new HashMap<>();

    	    for (Student student : students) {
    	        Map<Plo, List<Double>> studentPLOPercentages = new HashMap<>();

    	        for (CLO clo : clos) {
    	            Plo plo = clo.getMaptoplo();
    	            double obtainedCLOPercentage = 0;
    	            double totalWeight = 0;

    	            for (Activity activity : clo.getActivity()) {
    	                double obtainedMarks = 0;
    	                double totalMarks = activity.getTotalMarks();
    	                double activityWeight = activity.getActivityWeight();

    	                for (List<Results> resultType : allResults) {
    	                    for (Results result : resultType) {
    	                        if (result.getStudent().equals(student) && result.getActivity().equals(activity)) {
    	                            obtainedMarks = result.getObtainedMarks();
    	                            obtainedCLOPercentage += (obtainedMarks / totalMarks) * activityWeight;
    	                            totalWeight += activityWeight;
    	                            break;
    	                        }
    	                    }
    	                }
    	            }

    	            double cloPercentage = (obtainedCLOPercentage / totalWeight) * 100;
    	            studentPLOPercentages.computeIfAbsent(plo, key -> new ArrayList<>()).add(cloPercentage);
    	        }

    	        for (Map.Entry<Plo, List<Double>> entry : studentPLOPercentages.entrySet()) {
    	            Plo plo = entry.getKey();
    	            List<Double> cloPercentages = entry.getValue();
    	            double ploPercentage = calculateAveragePercentage(cloPercentages);

    	            ploPercentages.computeIfAbsent(plo, key -> new ArrayList<>()).add(ploPercentage);
    	        }
    	    }

    	    Map<Plo, Double> cohortPLOPercentages = new HashMap<>();
    	    int totalStudents = students.length;

    	    for (Map.Entry<Plo, List<Double>> entry : ploPercentages.entrySet()) {
    	        Plo plo = entry.getKey();
    	        List<Double> percentages = entry.getValue();

    	        int studentsAbove50Count = 0;

    	        for (double percentage : percentages) {
    	            if (percentage > 50) {
    	                studentsAbove50Count++;
    	            }
    	        }

    	        double studentsAbove50Percentage = (double) studentsAbove50Count / totalStudents * 100;
    	        cohortPLOPercentages.put(plo, studentsAbove50Percentage);
    	    }

    	    return cohortPLOPercentages;
    	}

    	public void printCohortLevelPLOResult(Map<Plo, Double> cohortPLOPercentages) {
    	    System.out.println("COHORT LEVEL PLO RESULT:");
    	    int totalPLOs = cohortPLOPercentages.size();
    	    
    	    
    	    for (Map.Entry<Plo, Double> entry : cohortPLOPercentages.entrySet()) {
    	        Plo plo = entry.getKey();
    	        double percentage = entry.getValue();

    	        System.out.println("PLO: " + plo.getTitle());
    	        System.out.println("Percentage of Students Above Threshold%: " + percentage + "%");

    	        if (percentage >= 50) {
    	            System.out.println("PLO Status: Achieved at Cohort Level");
    	        } else {
    	            System.out.println("PLO Status: Not Achieved at Cohort Level");
    	        }

    	        System.out.println();
    	    }

    	    System.out.println("Total PLOs: " + totalPLOs);
    	    System.out.println("----------------------------------------------------------");
    	}
        
        
    	private double calculateAveragePercentage(List<Double> percentages) {
    	    double totalPercentage = 0;
    	    int count = 0;

    	    for (double percentage : percentages) {
    	        totalPercentage += percentage;
    	        count++;
    	    }

    	    if (count > 0) {
    	        return totalPercentage / count;
    	    } else {
    	        return 0;
    	    }
    	}

        
        
        
        
        public void displayProgramInformation(ObeModel.Program program) {
            System.out.println("Program:");
            System.out.println("\t" + program.getName());

            System.out.println("Program Educational Objectives (PEO's):");
            for (PEO peo : program.getProgramobjectives()) {
                System.out.println("\t" + peo.getPEOStatement() + "\t\t" + "Passing Threshold: " + peo.getThreshold() + "%");
            }
            System.out.println("----------------------------------------------------------");

            System.out.println("Program Learning Outcomes (PLO's):");
            for (Plo plo : program.getProgramlearningoutcomes()) {
                System.out.println("\t" + plo.getTitle());
            }
            System.out.println("----------------------------------------------------------");

            System.out.println("Mapping Program Learning Outcomes (PLO's) -> Program Educational Objectives (PEO's):");
            for (Plo plo : program.getProgramlearningoutcomes()) {
                System.out.println("\t" + plo.getTitle() + " : " + plo.getPeo().getTitle());
            }
            System.out.println("----------------------------------------------------------");

            System.out.println("Courses in the Program:");
            for (Courses course : program.getOfferedcourses()) {
                System.out.println("Course: " + course.getName());
                System.out.println("CLO's:");
                for (CLO clo : course.getLearningoutcomes()) {
                    System.out.println("\t" + clo.getStatement());
                    System.out.println("\t\tLearning Level: " + clo.getLearninglevels().getLevel());
                    System.out.println("\t\tMapped PLO: " + clo.getMaptoplo().getTitle());
                }
                System.out.println("----------------------------------------------------------");
            }
        }

        

    }
	
	
	

