package qsp;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

@Test
public class ScreenShotGoogle
{
static
}
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public void testScreenShotGoogle()
WebDriver driver = new ChromeDriver();
driver.get(https://www.google.com/);
	TakesScreenshot t= (TakesScrenShot)driver;
File src = t.getScreenshotAs(null)
