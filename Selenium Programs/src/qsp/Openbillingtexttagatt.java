import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbillingtexttagatt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		String t = driver.findElement(By.xpath("//button[.='Submit']")).getText();
		String tag = driver.findElement(By.xpath("//button[.='Submit']")).getTagName();
		String a = driver.findElement(By.xpath("//button[.='Submit']")).getAttribute("class");
		System.out.println(t);
		System.out.println(tag);
		System.out.println(a);
		driver.close();
	}

}
