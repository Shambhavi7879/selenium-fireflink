package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// STEP1: CREATE FIS/FR OBJECT
	FileInputStream fis=new FileInputStream("./testdata/testdataExcel.xlsx");
		
		//step2: Create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3: call read methods
		String URL = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String Username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(URL);
		System.out.println(Username);
		System.out.println(Password);
		
		System.out.println("=================================================================================");
		
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(3).getLocalDateTimeCellValue();
		System.out.println(date);
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
		
		System.out.println("================================================================================");
		
		int number = (int) workbook.getSheet("Sheet1").getRow(1).getCell(5).getNumericCellValue();
		System.out.println(number);		
		

	}

}
