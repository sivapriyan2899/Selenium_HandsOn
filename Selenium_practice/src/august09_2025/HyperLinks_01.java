package august09_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/link.xhtml");
		
		List<WebElement> listOfLinks= driver.findElements(By.xpath("//div[@class='layout-main-content']//following::a"));
		
		for(WebElement element : listOfLinks) {
			 System.out.println(element.getText());
		}

	}

}
