import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimecheckbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		boolean check = driver.findElement(By.xpath("//label[.='Keep me logged in']")).isSelected();
		if(check==true)
			System.out.println("selected");
		else
			System.out.println("not selected");

}
}
