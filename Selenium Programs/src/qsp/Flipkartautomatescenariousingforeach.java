import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartautomatescenariousingforeach {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		String pname = null;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		// Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> productname = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
		List<WebElement> productprice = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]/../..//div[contains(@class,'_30jeq3 _1_WHN1')]"));
		int count = productname.size();
		count = productprice.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String prod = productname.get(i).getText();
			String price = productprice.get(i).getText();
			System.out.println(prod+"---->"+"price");
		}

	}

}
