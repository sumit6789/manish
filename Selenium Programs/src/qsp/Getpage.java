import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String source = driver.getPageSource();
		System.out.println(source);
		Thread.sleep(2000);
		driver.close();
		// TODO Auto-generated method stub

	}

}
