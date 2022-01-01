package qsp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOption { 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sumit/Desktop/hotel.html");
	WebElement slvlistbox =driver.findElement(By.id("slv"));
	Select s=new Select(slvlistbox);
	List<WebElement> allselected =s.getAllSelectedOptions();
	int count = allselected.size();
	System.out.println(count);
	for( WebElement option: allselected) {
		String text=option.getText();
		System.out.println(text);
	}
//	for(int i=0;i<count;i++) {
//		String text= allselected.get(i).getText();
//		System.out.println(text);
//	}
    driver.close();
   
}
}