import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alltagidnameclassname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/1st.html");
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.close();
	}

}
