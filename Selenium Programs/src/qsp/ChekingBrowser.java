package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekingBrowser 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	 {
//Open the browser
WebDriver driver=new ChromeDriver();
driver.get("file://C:/Users/sumit/Desktop/a.html");
Thread.sleep(2000);
 //Resize the browser
Dimension d=new Dimension(200, 200);
driver.manage().window().setSize(d);
Thread.sleep(2000);
//Move the browser
Point p=new Point(300, 200);
driver.manage().window().setPosition(p);
Thread.sleep(2000);
 //Maximize the browser
driver.manage().window().maximize();
}
}
