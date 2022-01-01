package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// CustomWait
public class GetMethodTimeException { 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	try {
	driver.get("http://demo.actitime.com/");
    System.out.println("page is loaded within 7 seconds");
	}
	catch(Exception e) {
		System.out.println("pageis not loaded within 7 seconds");
	}
	driver.close();
	}
   
}
