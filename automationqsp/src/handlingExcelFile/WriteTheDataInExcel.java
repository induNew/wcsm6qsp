package handlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataInExcel {

	//write the data in the excel file
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/TestData1.xlsx");//make the excel file ready for read operation
		Workbook wb = WorkbookFactory.create(fis);//make the excel file ready for read operation
		Sheet sh = wb.getSheet("City");//go the sheet
		Row row = sh.getRow(0);//go to the row
		
		Cell cell = row.createCell(1);//make the cell ready for write operation
		cell.setCellValue("xyz");//set cell data
		
		FileOutputStream fos = new FileOutputStream("./data/TestData1.xlsx");//go to the file in which we need to write the data
		wb.write(fos);//write the data
		wb.close();


	}

}
