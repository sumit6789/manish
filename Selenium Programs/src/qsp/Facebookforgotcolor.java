import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookforgotcolor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	String fonttype= driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
	String fontsize= driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
	System.out.println(color);
	System.out.println(fonttype);
	System.out.println(fontsize);
		
	}

}
