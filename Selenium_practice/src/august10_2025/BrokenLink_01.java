package august10_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_01 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("button.a-button-text")).click();
		
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(listOfLinks.size());
		
		for(WebElement element : listOfLinks) {
			System.out.println(element.getAttribute("href"));
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
