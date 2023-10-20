import java.util.ArrayList;
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

public class Run {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		ObeModelFactory factory = ObeModelFactory.eINSTANCE;

        ObeUtility utility = new ObeUtility(factory);

        Institute university = utility.createInstitute("University of Azad Jammu & Kashmir", InstituteLevel.UNIVERSITY, null);
        Institute faculty = utility.createInstitute("Faculty of Engineering", InstituteLevel.FACULTY, university);
        Institute department = utility.createInstitute("Department of Software Engineering", InstituteLevel.DEPARTMENT, faculty);

        Vision universityVision = utility.createVision("Transformation to excellence through holistic education.");
        
        Mission universityMission = utility.createMission("The University is committed to quality education, research and values-driven mentorship through innovations to serve the society and the changing world.");
        Mission facultyMission = utility.createMission("Faculty Mission");
        Mission departmentMission = utility.createMission("To prepare graduates to have concrete software engineering knowledge, real-world problem-solving skills, excellent leadership qualities, and entrepreneurial abilities for their professional growth and service to society.");

        utility.setVisionMission(university, universityVision, universityMission);
        utility.setMission(faculty, facultyMission);
        utility.setMission(department, departmentMission);

        
        
        ObeModel.Program program = utility.createProgram("BSc Software Engineering");
        PEO peo1 = utility.createPEO("PEO 1", "Apply sound engineering knowledge and skills to design, analyze and investigate a problem for appropriate solutions.", departmentMission, 50);
        PEO peo2 = utility.createPEO("PEO 2", "Exhibit professionally sound character, having leadership qualities, adaptability in a team, and entrepreneurial skills.", departmentMission, 60);
        PEO peo3 = utility.createPEO("PEO 3", "Demonstrate devotion through ethical engineering practices and effective communication skills to serve the society.", departmentMission, 70);

        Plo plo1 = utility.createPlo("Engineering Knowledge", peo1);
        Plo plo2 = utility.createPlo("Problem Analysis", peo1);
        Plo plo3 = utility.createPlo("Design / Development of Solutions", peo1);
        Plo plo4 = utility.createPlo("Investigation", peo1);
        Plo plo5 = utility.createPlo("Modern Tool Usage", peo1);
        Plo plo6 = utility.createPlo("The Engineer and Society", peo3);
        Plo plo7 = utility.createPlo("Environment and Sustainability", peo2);
        Plo plo8 = utility.createPlo("Ethics", peo3);
        Plo plo9 = utility.createPlo("Individual and Teamwork", peo2);
        Plo plo10 = utility.createPlo("Communication", peo3);
        Plo plo11 = utility.createPlo("Project Management", peo2);
        Plo plo12 = utility.createPlo("Lifelong Learning", peo1);

        utility.addProgramObjective(program, peo1);
        utility.addProgramObjective(program, peo2);
        utility.addProgramObjective(program, peo3);

        utility.addProgramLearningOutcome(program, plo1);
        utility.addProgramLearningOutcome(program, plo2);
        utility.addProgramLearningOutcome(program, plo3);
        utility.addProgramLearningOutcome(program, plo4);
        utility.addProgramLearningOutcome(program, plo5);
        utility.addProgramLearningOutcome(program, plo6);
        utility.addProgramLearningOutcome(program, plo7);
        utility.addProgramLearningOutcome(program, plo8);
        utility.addProgramLearningOutcome(program, plo9);
        utility.addProgramLearningOutcome(program, plo10);
        utility.addProgramLearningOutcome(program, plo11);
        utility.addProgramLearningOutcome(program, plo12);

        Batches sessions_19_23 = utility.createBatches("2019-2023");
        Courses course1 = utility.createCourse("Programming Fundamentals");
        
        utility.addBatchToProgram(program, sessions_19_23);
        utility.addCourseToProgram(program, course1);
        utility.addProgramToDepartment(department, program);
        
       
        CaseStudyData data = new CaseStudyData();
        String[] names = data.loadStudentNames();
        String[] rollNumbers = data.loadRollNumbers();
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = utility.createStudent(names[i], rollNumbers[i], sessions_19_23);
            utility.associateCourseWithStudent(students[i], course1);
            sessions_19_23.getStudents().add(students[i]); //added later
        }
        
        LearningLevels c1 = utility.createLearningLevel(LearningDomain.COGNITIVE, "C2 - Comprehension");
        LearningLevels c3 = utility.createLearningLevel(LearningDomain.COGNITIVE, "C3 - Application");
        LearningLevels c5 = utility.createLearningLevel(LearningDomain.COGNITIVE, "C5 - Synthesis");

        CLO clo1 = utility.createCLO("Understand basic programming principles and logic constructs.", plo1, c1);
        CLO clo2 = utility.createCLO("Apply programming techniques to solve various problems.", plo3, c3);
        CLO clo3 = utility.createCLO("Design and implement algorithm's to solve real world problems", plo3, c5);

        utility.associateCLOWithCourse(course1, clo1);
        utility.associateCLOWithCourse(course1, clo2);
        utility.associateCLOWithCourse(course1, clo3);
        
     // Create activities for clo1
        Activity q1 = utility.createActivity("Quiz 1", clo1, ActivityType.QUIZ, 20, 10);
        Activity a1 = utility.createActivity("Assignment 1", clo1, ActivityType.ASSIGNMENT, 20, 10);
        Activity m1 = utility.createActivity("Mid Term (Q1 + Q3)", clo1, ActivityType.MID, 40, 20);
        Activity t1 = utility.createActivity("Terminal - Q1", clo1, ActivityType.FINALS, 20, 10);

        // Create activities for clo2
        Activity q2 = utility.createActivity("Q2", clo2, ActivityType.QUIZ, 22.22, 10);
        Activity a2 = utility.createActivity("A2", clo2, ActivityType.ASSIGNMENT, 22.22, 10);
        Activity m2 = utility.createActivity("Mid Term (Q2)", clo2, ActivityType.MID, 22.22, 10);
        Activity t2 = utility.createActivity("Terminal - Q2", clo2, ActivityType.FINALS, 33.34, 15);

        // Create activity for clo3
        Activity t3 = utility.createActivity("Terminal - Q3", clo3, ActivityType.FINALS, 100, 25);

        // Add activities to the course
        utility.addActivityToCourse(course1, q1);
        utility.addActivityToCourse(course1, q2);
        utility.addActivityToCourse(course1, a1);
        utility.addActivityToCourse(course1, a2);
        utility.addActivityToCourse(course1, m1);
        utility.addActivityToCourse(course1, m2);
        utility.addActivityToCourse(course1, t1);
        utility.addActivityToCourse(course1, t2);
        utility.addActivityToCourse(course1, t3);

		
		//activites marks
		double[] quizMarks_q1 = data.loadQuiz1Marks();
		double[] quizMarks_q2 = data.loadQuiz2Marks();
		double[] assingmentMarks_a1 = data.loadAssignment1Marks();
		double[] assingmentMarks_a2 = data.loadAssignment2Marks();
		double[] midMarks_m1 = data.loadMidQ1Q3Marks();
		double[] midMarks_m2 = data.loadMidQ2Marks();
		double[] terminalMarks_t1 = data.loadTerminalQ1Marks();
		double[] terminalMarks_t2 = data.loadTerminalQ2Marks();
		double[] terminalMarks_t3 = data.loadTerminalQ3Marks();
        
        //add marks to students
		List<Results> quiz_res_q1 = utility.updateMarks(students, q1,quizMarks_q1);
		List<Results> quiz_res_q2 = utility.updateMarks(students, q2,quizMarks_q2);
		List<Results> assg_res_a1 = utility.updateMarks(students, a1,assingmentMarks_a1);
		List<Results> assg_res_a2 = utility.updateMarks(students, a2,assingmentMarks_a2);
		List<Results> mid_res_m1 = utility.updateMarks(students, m1,midMarks_m1);
		List<Results> mid_res_m2 = utility.updateMarks(students, m2,midMarks_m2);
		List<Results> terminal_res_t1 = utility.updateMarks(students, t1,terminalMarks_t1);
		List<Results> terminal_res_t2 = utility.updateMarks(students, t2,terminalMarks_t2);
		List<Results> terminal_res_t3 = utility.updateMarks(students, t3,terminalMarks_t3);
		
		
		 
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
        
  
        
        //display informations and reports
        utility.displayInstituteInformation(university);
        utility.displayInstituteInformation(faculty);
        utility.displayInstituteInformation(department);
        for (ObeModel.Program prog : department.getOfferprograms()) {
        	utility.displayProgramInformation(prog);
        }
        //display results
        utility.printStudentResults(students, allResults);
        utility.printCLOPLOReport(students, course1, allResults);
        utility.printChortLevelCloResult(students, course1, allResults,sessions_19_23.getIndvThreshold(),sessions_19_23.getChortLevelThreshold());
        Map<Plo, Double> cohortPLOPercentages = utility.getCohortPLOPercentages(students, course1, allResults);
        utility.printCohortLevelPLOResult(cohortPLOPercentages);
        

	}
	
	
}
