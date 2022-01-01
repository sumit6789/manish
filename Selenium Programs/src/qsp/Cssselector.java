import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/1st.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://www.fb.com/']")).click();
	
		Thread.sleep(2000);
 
		driver.close();
	}

}
