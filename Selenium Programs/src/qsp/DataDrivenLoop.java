package qsp;

	import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class DataDrivenLoop {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws IOException {
			
			FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
			Workbook wb= WorkbookFactory.create(fis);

			int rowNum=wb.getSheet("Invalids").getLastRowNum();
			
			for(int i=0;i<rowNum;i++)
			{
			String usernames=wb.getSheet("Invalids").getRow(i).getCell(0).getStringCellValue();
			String passwords=wb.getSheet("Invalids").getRow(i).getCell(1).getStringCellValue();
			System.out.println(usernames+"\t"+passwords);
			}
			
			FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
			
			wb.write(fos);
			wb.close();
				
		}
	}



