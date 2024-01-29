package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class excelboolen {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			FileInputStream kk= new FileInputStream("C:\\Users\\saiku\\Downloads\\TestData.xlsx");       
			Workbook wb = WorkbookFactory.create(kk);
		Boolean data=wb.getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
			System.out.println(data);
	}

}
