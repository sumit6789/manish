package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// CustomWait
public class MultiSelect { 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sumit/Desktop/hotel.html");
	WebElement mtrlistbox =driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlistbox);
	s.selectByIndex(0);
	Thread.sleep(3000);
	s.selectByValue("v");
	Thread.sleep(3000);
	s.selectByVisibleText("dosa");
	s.deselectByIndex(2);
	s.deselectByVisibleText("idly");
	s.deselectByValue("d");
    System.out.println(s.isMultiple());	
    driver.close();
   
}
}