import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbc {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		List<WebElement> r = driver.findElements(By.xpath("//span[contains(@class,'top-list-item__bullet')]/../../..//h3"));
		int count = r.size();
		System.out.println(count);
		for (WebElement text : r) {
			System.out.println(text.getText());
		}
		driver.close();
	}

}
