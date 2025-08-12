package august12_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestedValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[normalize-space(text())='From']/ancestor::div[contains(@class,'placeHolderContainer')]"))).click();
	
		//to inspect the element which disappear after clicking on other. create snipet in sources and paste below code.
		//setTimeout(function(){debugger;}, 5000);
		//this will freeze the browser, after timeout and allow us to inspect.
		
		Thread.sleep(3000);
		
		List<WebElement> suggestedValues = driver.findElements(By.xpath("//div[@class='searchCategory___12a664']/div[contains(@role,'option')]"));
		
		for(WebElement element : suggestedValues) {
			System.out.println(element.getText());
		}
		
	}

}
