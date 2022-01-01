import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handellingpopupalert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		//Alert a = driver.switchTo().alert();
WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.alertIsPresent());
		String s = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(s);
		driver.close();
		
	}

}
