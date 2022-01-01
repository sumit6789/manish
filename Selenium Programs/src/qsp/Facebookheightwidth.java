import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookheightwidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		int height = driver.findElement(By.name("login")).getSize().getHeight();
		int width = driver.findElement(By.name("login")).getSize().getWidth();
		System.out.println("Height is"+height);
		System.out.println("Width is"+width);
		
		 WebElement login = driver.findElement(By.name("pass"));
		 int height1 = login.getSize().getHeight();
		 int width1 = login.getSize().getWidth();
		 System.out.println("Height is"+height1);
			System.out.println("Width is"+width1);
		 driver.close();
		
	}

}
