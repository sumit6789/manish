package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestion {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args)  throws InterruptedException {
	        //open the browser
			WebDriver driver = new ChromeDriver();
			//goto google.com
			driver.get("https://www.google.com/");
			//type java in search textbox
			driver.findElement(By.name("q")).sendKeys("java");
			Thread.sleep(1000);
			//find  all the suggestion and print the count
			List<WebElement> allAutoSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));			
			int count = allAutoSugg.size();
			System.out.println(count);
			//print the all the autosuggestiions
			for(int i=0;i<count;i++) {
				String text = allAutoSugg.get(i).getText();
				System.out.println(text);
			}
			Thread.sleep(1000);
			//select the first suggestion
			allAutoSugg.get(0).click();
			}			 			
	}


