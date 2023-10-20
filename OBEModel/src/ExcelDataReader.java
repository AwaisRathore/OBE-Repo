import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	FileInputStream file = null;
	XSSFWorkbook workbook = null;
	
	public ExcelDataReader(String excelFilePath) throws IOException {
		 file = new FileInputStream(new File(excelFilePath)); 
		 workbook = new XSSFWorkbook(file);
	}
	public String getCourseName() {
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		String courseName = row.getCell(2).getStringCellValue();
		return courseName;
	}
	public String getBatchName() {
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		String batch = row.getCell(5).getStringCellValue();
		return batch;
	}
	
	public List<String> getStudentNames(){
		List<String> studentNames = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0); 
		// Iterate through rows starting from the second row (index 1)
        for (int i = 7; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
           // Assuming Student name is in the second column (index 1)
            String studentName = row.getCell(1).getStringCellValue();
            studentNames.add(studentName);
        }
		return studentNames;
	}
	public List<Integer> getRollNumbers() {
		List<Integer> rollNumbers = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0); 
		// Iterate through rows starting from the second row (index 1)
        for (int i = 7; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
           // Assuming roll number is in the first column (index 0)
            int rollNumber = (int) row.getCell(0).getNumericCellValue();
            rollNumbers.add(rollNumber);
        }
		return rollNumbers;
		
	}
	public List<List<Double>> getActivityNumbers()  {
		List<List<Double>> activityNumbers = new ArrayList<>();
		List<Double> rollNumbers = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int i = 7; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			// Initialize a list to store activity numbers for this student
	        List<Double> studentActivityNumbers = new ArrayList<>();
	        // Iterate through activity columns starting from the third column (index 2)
	        for (int j = 2; j < row.getLastCellNum(); j++) {
	            double activityNumber = (double) row.getCell(j).getNumericCellValue();
	            studentActivityNumbers.add(activityNumber);
	        }
	
	        // Add the activity numbers for this student to the activityNumbers list
	        activityNumbers.add(studentActivityNumbers);
		}

		return activityNumbers;
			
	}
	public List<String> getactivityNames(){
		List<String> activityNames = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row activityRow = sheet.getRow(1);
		//assuming that the activities names start from third column 
		for (int j = 2; j < activityRow.getLastCellNum(); j++) {
            String activityName = activityRow.getCell(j).getStringCellValue();
            activityNames.add(activityName);
        }
		return activityNames;
		
    }
	public List<Double> getActivitiesTotalMarks(){
		List<Double> activitiesTotalMarks = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row activityRow = sheet.getRow(2);
		//assuming that the activities names start from third column 
		for (int j = 2; j < activityRow.getLastCellNum(); j++) {
            double activityNumbers = (double)activityRow.getCell(j).getNumericCellValue();
            activitiesTotalMarks.add(activityNumbers);
        }
		return activitiesTotalMarks;	
    }
	public List<Integer> getActivitiesCloMapping(){
		List<Integer> activitiesCLOMap = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(3);
		//assuming that the activities names start from third column 
		for (int j = 2; j < row.getLastCellNum(); j++) {
            int activityClo = (int)row.getCell(j).getNumericCellValue();
            activitiesCLOMap.add(activityClo);
        }
		return activitiesCLOMap;	
    }
	public List<Double> getActivitiesOBEWeight(){
		List<Double> activitiesOBEWeight = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row activityRow = sheet.getRow(5);
		//assuming that the activities names start from third column 
		for (int j = 2; j < activityRow.getLastCellNum(); j++) {
            double activityWeight = (double)activityRow.getCell(j).getNumericCellValue();
            activitiesOBEWeight.add(activityWeight);
        }
		return activitiesOBEWeight;	
    }
	public List<Integer> getActivitiesType(){
		List<Integer> activitiesTypes = new ArrayList<>();
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row activityRow = sheet.getRow(4);
		//assuming that the activities names start from third column 
		for (int j = 2; j < activityRow.getLastCellNum(); j++) {
            int activityType = (int)activityRow.getCell(j).getNumericCellValue();
            activitiesTypes.add(activityType);
        }
		return activitiesTypes;	
    }
	
	//***********************************************GENERAL INFROMATION***************************************//
	
	public String getUniversityName() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(2);
		String university_name = row.getCell(1).getStringCellValue();
		return university_name;
	}
	public String getUniversityVision() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(2);
		String university_Vision = row.getCell(2).getStringCellValue();
		return university_Vision;
	}
	public String getUniversityMission() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(2);
		String university_Mission = row.getCell(3).getStringCellValue();
		return university_Mission;
	}
	public String getFacultyName() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(3);
		String faculty_name = row.getCell(1).getStringCellValue();
		return faculty_name;
	}
	public String getFacultyMission() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(3);
		String faculty_Mission = row.getCell(3).getStringCellValue();
		return faculty_Mission;
	}
	public String getDepartmentName() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(4);
		String dept_name = row.getCell(1).getStringCellValue();
		return dept_name;
	}
	public String getDepartmentMission() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(4);
		String dept_Mission = row.getCell(3).getStringCellValue();
		return dept_Mission;
	}
	public String getProgramName() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(7);
		String program_Name = row.getCell(0).getStringCellValue();
		return program_Name;
	}
	public String getBatchNameGeneralInformation() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(7);
		String batch_Name = row.getCell(1).getStringCellValue();
		return batch_Name;
	}
	public Double getIndvCLOThreshold() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(7);
		double indvCloThreshold = (double)row.getCell(2).getNumericCellValue();
		return indvCloThreshold;
	}
	public Double getCohortCLOThreshold() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(7);
		double chortCloThreshold = (double)row.getCell(3).getNumericCellValue();
		return chortCloThreshold;
	}
	public Double getIndvPLOThreshold() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(7);
		double indvPLOThreshold = (double)row.getCell(4).getNumericCellValue();
		return indvPLOThreshold;
	}
	public Double getCohortPLOThreshold() {
		XSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(7);
		double cohortPLOThreshold = (double)row.getCell(5).getNumericCellValue();
		return cohortPLOThreshold;
	}
	public  List<List<Object>> getPloPeoMappings() throws IOException {
		  XSSFSheet sheet = workbook.getSheetAt(2);
	       List<List<Object>> ploPeoList = new ArrayList<>();
	        for (int i = 7; i <= 18; i++) {
	            Row row = sheet.getRow(i);
	            if (row != null) {
	                Cell cellPlo = row.getCell(0);
	                Cell cellPeo = row.getCell(1);
	                if (cellPlo != null && cellPeo != null) {
	                    String plo = cellPlo.getStringCellValue();
	                    int peo = (int) cellPeo.getNumericCellValue(); // Assuming PEOs are integers

	                    List<Object> ploPeoPair = new ArrayList<>();
	                    ploPeoPair.add(plo);
	                    ploPeoPair.add(peo);

	                    ploPeoList.add(ploPeoPair);
	                }
	            }
	        }
	        workbook.close();  // Close the workbook
	        return ploPeoList;
	    }


	public List<Integer> getPEONumbers() {
	    XSSFSheet sheet = workbook.getSheetAt(2);
	    Row row = sheet.getRow(1);
		List<Integer> peoNumber = new ArrayList<>();
	    for (int j = 1; j < row.getLastCellNum(); j++) {
	    	int value = (int)row.getCell(j).getNumericCellValue();
		    if(value!=0) {
		    	peoNumber.add(value);
		    }   
        } 
	    return peoNumber;   
	}
	public List<String> getPEOStatements() {
	    XSSFSheet sheet = workbook.getSheetAt(2);
	    Row row = sheet.getRow(2);
		List<String> peoStatements = new ArrayList<>();
	    for (int j = 1; j < row.getLastCellNum(); j++) {
	    	String statement = row.getCell(j).getStringCellValue();
		    if(statement!= null || statement != "") {
		    	peoStatements.add(statement);
		    }   
        } 
	    return peoStatements;   
	}
	public List<Integer> getPEOPMissionMapping() {
	    XSSFSheet sheet = workbook.getSheetAt(2);
	    Row row = sheet.getRow(3);
		List<Integer> peoMapping = new ArrayList<>();
	    for (int j = 1; j < row.getLastCellNum(); j++) {
	    	int mapping = (int)row.getCell(j).getNumericCellValue();
		    peoMapping.add(mapping);
        } 
	    return peoMapping;   
	}

	public List<Integer> getPEOThreshold() {
	    XSSFSheet sheet = workbook.getSheetAt(2);
	    Row row = sheet.getRow(4);
		List<Integer> peoThreshold = new ArrayList<>();
	    for (int j = 1; j < row.getLastCellNum(); j++) {
	    	int threshold = (int)row.getCell(j).getNumericCellValue();
	    	peoThreshold.add(threshold);
        } 
	    return peoThreshold;   
	}
	
	public List<List<Object>> getPEOInformation() {	
		List<Integer> titles = getPEONumbers();
		List<String> statements = getPEOStatements();
		List<Integer> mappings = getPEOPMissionMapping();
		List<Integer> thresholds = getPEOThreshold();	
		return combineLists(titles, statements, mappings, thresholds);	
	}
	
	private List<List<Object>> combineLists(List<Integer> titles, List<String> statements,
            List<Integer> mappings, List<Integer> thresholds) {
			List<List<Object>> combinedList = new ArrayList<>();
			// Determine the length based on the titles list
			int length = titles.size();
			for (int i = 0; i < length; i++) {
			List<Object> combinedItem = new ArrayList<>();
			combinedItem.add(titles.get(i));
			combinedItem.add(statements.get(i));
			combinedItem.add(mappings.get(i));
			combinedItem.add(thresholds.get(i));
			combinedList.add(combinedItem);
			}
			return combinedList;
		   }
	
	 public List<List<Object>> getCLOInformation(){
		 XSSFSheet sheet = workbook.getSheetAt(2);
		 List<List<Object>> cloData = new ArrayList<>(); 
		 for (int rowIndex = 21; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
			 Row row = sheet.getRow(rowIndex);
			 if (row != null) {
				 List<Object> rowData = new ArrayList<>();
				 String cloStatement  = row.getCell(0).getStringCellValue();
				 int learningDomain  = (int)row.getCell(1).getNumericCellValue();
				 int learningLevel  = (int)row.getCell(2).getNumericCellValue();
				 String learningLevelDescription  = row.getCell(3).getStringCellValue();
				 int mappedPLO  = (int)row.getCell(4).getNumericCellValue();
				 rowData.add(cloStatement);
				 rowData.add(learningDomain);
				 rowData.add(learningLevel);
				 rowData.add(learningLevelDescription);
				 rowData.add(mappedPLO);
				 cloData.add(rowData);
			 }
		 }
		 return cloData;
	 }	
}

