package august09_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);		
		
		WebElement calendarInput = driver.findElement(By.id("datepicker"));
		calendarInput.click();
		
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	WebElement calendarInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker")));
		
	}

}
