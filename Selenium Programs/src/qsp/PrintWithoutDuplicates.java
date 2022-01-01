package qsp;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicates { 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<>();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sumit/Desktop/hotel.html");
	WebElement mtrListbox =driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	List<WebElement> allOptions =s.getOptions();
	for(int i=0; i<allOptions.size();i++) {
    String text= allOptions.get(i).getText();
    hs.add(text);
    System.out.println(text);
	}
//	for(String text:hs) {
//		System.out.println(text);
//	}
    driver.close();
   
}
}