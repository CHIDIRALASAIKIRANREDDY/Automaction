package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		FileInputStream kk= new FileInputStream("C:\\Users\\saiku\\OneDrive\\Desktop\\Sheet1.xlsx");       
Workbook wb = WorkbookFactory.create(kk);
Sheet sh=wb.getSheet("Sheet1");
String data=sh.getRow(0).getCell(0).getStringCellValue();
System.out.println(data);
	}

}
