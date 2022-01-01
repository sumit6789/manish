import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeforgottext {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		String forgot = driver.findElement(By.xpath("//a[.='Forgot your password?']")).getText();
		System.out.println(forgot);
		driver.close();
		
	}

}
