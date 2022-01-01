package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstelected { 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sumit/Desktop/hotel.html");
	WebElement slvlistbox =driver.findElement(By.id("slv"));
	Select s=new Select(slvlistbox);
	WebElement firstoption = s.getFirstSelectedOption();
	String text = firstoption.getText();
	System.out.println(text);
    driver.close();
   
}
}