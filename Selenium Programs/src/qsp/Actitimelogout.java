package qsp;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimelogout {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Trac"));
		wait.until(ExpectedConditions.titleContains("Time"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));

		// String title = driver.getTitle();
		// System.out.println(title);
		int i = 0;
		//while (i < 10)
		while(true){
			try {

				driver.findElement(By.id("logoutLink")).click();
				break;

			} catch (NoSuchElementException e) {
				i++;
			}
		}
		//driver.close();

	}
}
