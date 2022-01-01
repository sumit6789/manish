import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/1st.html");
	//	driver.findElement(By.linkText("fb")).click();
		driver.findElement(By.partialLinkText("f")).click();
		driver.close();

}
}
