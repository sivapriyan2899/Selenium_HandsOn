package august12_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node01hppo6vge5wn61qggkigixxjx93791210.node0");
		
		//click() is not working. because its hidden under span tag...
		//to bypass it sendKeys() can be used..this does not trigger OS file picker
		WebElement uploadButton = driver.findElement(By.id("j_idt88:j_idt89_input"));
		
		//uploadButton.click(); is not allowed due to security reason
		uploadButton.sendKeys("C:\\Users\\SIVA\\Downloads\\TestLeaf Logo.png");

	}

}
