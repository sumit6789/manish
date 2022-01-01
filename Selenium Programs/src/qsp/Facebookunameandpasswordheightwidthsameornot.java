import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookunameandpasswordheightwidthsameornot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement usertext = driver.findElement(By.name("email"));
		 int height = usertext.getSize().getHeight();
		int width = usertext.getSize().getWidth();
		WebElement usertext1 = driver.findElement(By.name("pass"));
		int height1 = usertext1.getSize().getHeight();
		int width1 = usertext1.getSize().getWidth();
	if(height==height1 && width==width1  )
			
			System.out.println("match");
		else
			System.out.println("unmatch");
		
		
		
	}

}
