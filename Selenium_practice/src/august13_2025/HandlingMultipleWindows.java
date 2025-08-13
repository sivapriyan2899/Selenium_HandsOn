package august13_2025;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://leafground.com/window.xhtml;jsessionid=node0tfmhbg9qk9vc1otbd2uazn7a13843257.node0"
;		driver.manage().window().maximize();
		driver.get(url);
		
		String parentWindow = driver.getWindowHandle();
		
		WebElement mulWindowButton = driver.findElement(By.id("j_idt88:new"));
		mulWindowButton.click();
		
		Set<String> openedWindows = driver.getWindowHandles();
		
		for(String s : openedWindows) {
			if(!s.equals(parentWindow)) {
				driver.switchTo().window(s);
			}
		} 
		
		String targetURL =driver.getCurrentUrl();
		System.out.println(targetURL);
		
		//getCurrentURL ---> will return URL of the Webpage which is currently on focus by WebDriver
		//getWindowHandle ---> will return ID of the window which currently on focus by WebDriver
		//getWindowHandles ---> will return ID of the all windows opened by WebDriver
		//driver.switchTo.window()  ---> to switching between windows opened by WebDriver
		driver.quit();

	}

}
