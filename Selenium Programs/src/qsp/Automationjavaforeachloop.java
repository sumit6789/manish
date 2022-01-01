import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationjavaforeachloop {
	
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
			for(WebElement all:allautosugg)
			{
				
				System.out.println(all.getText());
				
			}
			allautosugg.get(0).click();
			
			driver.close();
		}

	}



