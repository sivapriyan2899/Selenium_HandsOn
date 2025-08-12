package august12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement uploadButton = driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		//uploadButton.click();
		
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click();", uploadButton);
		
		//both selenium .click and javascriptexecutor.click() is not opening the file picker
		//because the chrome is running in automation mode because of this it prevents OS file picker to appear
		//this is a security feature.

	}

}
