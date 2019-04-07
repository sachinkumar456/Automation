package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String args[]) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Automation\\ExcelData\\TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);		
		//change of code from read excel data
		Cell cel = row.createCell(2);
		cel.setCellValue("Selenium");
	 FileOutputStream fos = new FileOutputStream("C:\\Automation\\ExcelData\\WriteTestData.xlsx");
		wb.write(fos);
		
	}
}