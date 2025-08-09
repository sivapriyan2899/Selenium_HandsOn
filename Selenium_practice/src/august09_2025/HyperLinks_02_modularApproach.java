package august09_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks_02_modularApproach {
	
	public static WebDriver initailizeDriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static List<WebElement> getAllURL(WebDriver driver) {
		driver.get("https://leafground.com/link.xhtml");
		List<WebElement> listOfLinks = driver.findElements(By.xpath("//div[@class='layout-main-content']//following::a"));
		return listOfLinks;
	}
	
	public static void printAllURL(List<WebElement> linksToPrint) {
		for(WebElement element : linksToPrint) {
			System.out.println(element.getAttribute("href"));
		}
	}
	
	public static void main (String[] args) {
		WebDriver childDriver = initailizeDriver();
		List<WebElement> totalLinks = getAllURL(childDriver);
		printAllURL(totalLinks);
	}

}
