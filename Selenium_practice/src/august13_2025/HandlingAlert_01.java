package august13_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert_01 {
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://leafground.com/alert.xhtml";
		driver.manage().window().maximize();
		driver.get(url);
		
	
		WebElement alertButton = driver.findElement(By.id("j_idt88:j_idt91"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
	}

}
