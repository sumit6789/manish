package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SingleSelect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create New Account")).click();
        WebElement monthlistbox =driver.findElement(By.id("month"));
		Select s=new Select(monthlistbox);
		Thread.sleep(4000);
//        s.selectByIndex(5);
//        Thread.sleep(4000);
//        s.selectByValue("12");
//        Thread.sleep(4000);
		s.selectByIndex(5);
		s.selectByValue("14");   
        s.deselectByVisibleText("Jan");	
	}
}
