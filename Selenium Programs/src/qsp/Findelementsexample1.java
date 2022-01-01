import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementsexample1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the url ");
		String url = scn.nextLine();
		WebDriver driver=new ChromeDriver();
		//driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/1st.html");
		//driver.get("https://www.amazon.in/");
		driver.get(url);
		 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		 int count = alllinks.size();
		 System.out.println(count);
		for(int i=0;i<count;i++) {
		WebElement link = alllinks.get(i);
		String av = link.getText();
		System.out.println(av);
		 }
		
		 driver.close();

}
}
