import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//p[.='Java']/../p[2]/a")).click();
		Robot r=new Robot();
	
			Thread.sleep(2000);
			//r.keyPress(KeyEvent.VK_PAGE_DOWN);
			//r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_ALT);
			
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	
	}
		
	

}
