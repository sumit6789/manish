import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookradiobuttonallign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);

	int f = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
	Thread.sleep(2000);
	int m = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
	Thread.sleep(2000);
	int c = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
	Thread.sleep(2000);
	if(f==m && m==c)
		System.out.println("same allign");
	else
		System.out.println("not same allign");
		
	driver.close();
	}

}
