package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author sumit
 *
 */

public class FileLib 
{
	public String getPropertyValue(String key) throws IOException{
	
		FileInputStream fis= new FileInputStream("./data/DD3.property");
		Properties p= new Properties();
		p.load(fis);
		String uValue=p.getProperty(key);

//		System.out.println(uValue);
		return uValue;


	}
	public String getExcelValue(String sheetName,int rowNum,int cellNum) throws IOException{
		
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		

		//System.out.println(value);
		return value;



	}

}
