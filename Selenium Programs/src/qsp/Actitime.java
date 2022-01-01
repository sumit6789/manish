import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(1000);
	driver.close();
	}
}
