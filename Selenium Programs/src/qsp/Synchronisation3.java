package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// CustomWait
public class Synchronisation3 { 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
    int i=0;
	while(i<1000) {
		try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch(NoSuchElementException e) {
			i++;
		}
	}
}
}