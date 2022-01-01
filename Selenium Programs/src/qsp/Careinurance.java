import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Careinurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Thread.sleep(2000);
		Select s = new Select(month);
		s.selectByIndex(1);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 = new Select(year);
		Thread.sleep(2000);
		
		
		s2.selectByValue("1999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[9]")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("alternative_number")).sendKeys("9845798457");
		driver.findElement(By.id("renew_policy_submit")).click();

	}

}
