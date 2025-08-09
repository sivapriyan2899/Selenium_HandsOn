package august09_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/link.xhtml");
		
		WebElement targetURL = driver.findElement(By.xpath("//*[contains(text(),'Find the URL without clicking me.')]"));
		
		String toURL = targetURL.getAttribute("href");
		
		System.out.println(toURL);
	}

}
