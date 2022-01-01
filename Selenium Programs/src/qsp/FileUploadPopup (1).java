import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/Naukri.html");
		Thread.sleep(2000);
		File f = new File("./data/selenium 20.09.2021.txt");
		String ab = f.getAbsolutePath();
		driver.findElement(By.id("myFile")).sendKeys(ab);
		// driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\bikas\\OneDrive\\Desktop\\selenium 20.09.2021.txt");

	}

}
