package august11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//from UI perspective, to check image broken means can use naturalWidth.
		//for link validation, can use URL class.
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement cShopping = driver.findElement(By.xpath("//*[contains(text(),'Continue shopping')]"));
		cShopping.click();
		
		WebElement imageElement = driver.findElement(By.xpath("//div[@id='desktop-grid-2']//img"));
		
		//naturalWidth is a JavaScript DOM property
		//not HTML property like href, class, etc.
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		Long var = (Long) execute.executeScript("return arguments[0].naturalWidth;", imageElement);
		
		if(var>0) {
			System.out.println("image not broken");
		}
		else
			System.out.println("image broken");
	}

}
