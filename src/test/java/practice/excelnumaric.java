package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelnumaric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream kk= new FileInputStream("C:\\Users\\saiku\\OneDrive\\Desktop\\Sheet1.xlsx");       
		Workbook wb = WorkbookFactory.create(kk);
		Sheet sh=wb.getSheet("Sheet1");
		double data=sh.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data);
	}

}
