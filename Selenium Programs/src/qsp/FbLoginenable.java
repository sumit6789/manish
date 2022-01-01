import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginenable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		boolean login = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(login==true)
		
			System.out.println("enabled");
		else

				System.out.println("not enabled");
			
			driver.close();

	}}
