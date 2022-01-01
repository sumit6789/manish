package qsp;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class DD1 {
	
	public static void main(String[] args) throws IOException {
		
		FileLib f=new FileLib();
		String username= f.getPropertyValue("username");
		String password= f.getPropertyValue("password");
		System.out.println(username+"\t"+password);
		
		String value = f.getExcelValue("CreateCustomer", 0, 1);
		System.out.println(value);

	}

}
