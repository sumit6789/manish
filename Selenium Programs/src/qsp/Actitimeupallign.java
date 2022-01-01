import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeupallign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	 driver.navigate().to("https://demo.actitime.com/login.do");
	int x1= driver.findElement(By.id("username")).getLocation().getX();

	 int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
		if(x1==x2)
			System.out.println("same allign");
		else
			System.out.println("not same allign");
		
	
		driver.close();
		
	}

}
