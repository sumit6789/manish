package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbillingsubmit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login_btn")).submit();
		String color = driver.findElement(By.linkText("Sign In as a Client")).getCssValue("color");
		System.out.println(color);
		
		
		driver.close();
	}

}
