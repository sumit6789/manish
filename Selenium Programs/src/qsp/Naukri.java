import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		 // Thread.sleep(2000); File f = new File("./data/selenium 20.09.2021.txt");
		 // String ab = f.getAbsolutePath();
		//  driver.findElement(By.id("wdgt-file-upload")).sendKeys(ab);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(0);
		 driver.findElement(By.id("wdgt-file-upload")).sendKeys("C:\\Users\\bikas\\OneDrive\\Desktop\\selenium 20.09.2021.txt");
		 
	}

}
