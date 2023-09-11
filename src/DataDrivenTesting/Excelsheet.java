package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\ExcelSheet\\Values.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String testdata = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(testdata);
		
		
		
	}

}
