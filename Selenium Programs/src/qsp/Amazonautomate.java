import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonautomate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		List<WebElement> allsugg = driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
		int count=allsugg.size();
		System.out.println(count);
		for(WebElement all:allsugg)
		{
			System.out.println(all.getText());
		}
		allsugg.get(count-1).click();
		driver.close();

}
}