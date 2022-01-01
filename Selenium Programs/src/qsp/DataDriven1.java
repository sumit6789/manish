package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws IOException {
		
		//WebDriver driver= new ChromeDriver();
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String cellVal=wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(cellVal);
		
		wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("Pass");
		
		FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
		
		wb.write(fos);
		String cellVal1=wb.getSheet("CreateCustomer").getRow(1).getCell(4).getStringCellValue();
		
		System.out.println(cellVal1);
		wb.close();
		

		
	}
}
