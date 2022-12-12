package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./testData/RegisterStudent.xls");
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		HSSFSheet sheet = workbook.getSheet("SmokeTest");
		
		int rowCount = sheet.getLastRowNum();              

        int columnCount = sheet.getRow(0).getLastCellNum();
        
        
        System.out.println("Row Count: " + rowCount);
        System.out.println("Column Count : " + columnCount);
        System.out.println("==================");
        
        for (int i = 1; i <= rowCount ; i++) {
        	
        	String FirstName = sheet.getRow(1).getCell(0).toString();
        	String Locality = sheet.getRow(1).getCell(4).toString();
        	
        	System.out.println("============="+i+"===========");
			System.out.println("First Nmae : " + FirstName);
			System.out.println("Locality : " + Locality);
			
			
		}
		
		

	}

}
