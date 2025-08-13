package august13_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert_02 {
	
	public static WebDriver initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://leafground.com/alert.xhtml";
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public static Alert switchToAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	public static void alertHandle01(WebDriver driver) throws InterruptedException {
		WebElement alertButton = driver.findElement(By.id("j_idt88:j_idt91"));
		alertButton.click();
		
		Alert handle01Alert = switchToAlert(driver);
		Thread.sleep(2000);
		handle01Alert.accept();
		
	}
	
	public static void alertHandle02(WebDriver driver) throws InterruptedException {
		WebElement alertButton = driver.findElement(By.id("j_idt88:j_idt104"));
		alertButton.click();
		
		Alert Handle02Alert = switchToAlert(driver);
		
		Handle02Alert.sendKeys("Siva");
		Thread.sleep(2000);
		Handle02Alert.accept();	
	}
	
	public static void maxMixSweetAlert(WebDriver driver) {
		WebElement aButton = driver.findElement(By.id("j_idt88:j_idt111"));
		aButton.click();
		pauseMethod(2000);
		String xpath = "//*[contains(@class, 'ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all') and @role='button']";
		WebElement sAlertMax = driver.findElement(By.xpath(xpath));
		sAlertMax.click();
		pauseMethod(2000);
		sAlertMax.click();
		pauseMethod(2000);
		WebElement closeButton = driver.findElement(By.xpath("//span[contains(text(),'Min and Max')]//following::a[1]"));
		closeButton.click();
	}
	
	public static void pauseMethod(Integer sec) {
		try {
			Thread.sleep(sec);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver childDriver = initializeBrowser();
		alertHandle01(childDriver);
		alertHandle02(childDriver);	
		maxMixSweetAlert(childDriver);
	
		
	}
}
