import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foreachjavapogramlast {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		
		List<WebElement> allautosugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allautosugg.size();
		System.out.println(count);
	for(WebElement sugg:allautosugg) {
		System.out.println(sugg.getText());
		}
		allautosugg.get(count-1).click();
		driver.close();
	}

}
