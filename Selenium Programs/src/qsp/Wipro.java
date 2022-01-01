import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wipro {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count = alllink.size();
		System.out.println(count);
		for (WebElement all : alllink) {
			System.out.println(all.getAttribute("href"));
		}
		driver.close();
	}
}
