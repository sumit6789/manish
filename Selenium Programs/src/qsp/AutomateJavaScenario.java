import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateJavaScenario {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<WebElement> allautosugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allautosugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allautosugg.get(i).getText();
			System.out.println(text);
			
		}
		allautosugg.get(1).click();
		
		driver.close();
	}

}
