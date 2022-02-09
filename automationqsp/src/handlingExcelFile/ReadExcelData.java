package handlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read operation
		Sheet sh = wb.getSheet("City");//to go the specified sheet
		Row row = sh.getRow(7);//to go the specified row
		
		Cell cell = row.getCell(0);//to go th specified cell
		String value = cell.getStringCellValue();//to get the string value present in the specified cell
		System.out.println(value);//print the value
		
	}
	
	
	
	
	

}
