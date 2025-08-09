package august09_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node06by53kgtuykzlgx2bpgxmiu3687309.node0");
		
		WebElement fromElement = driver.findElement(By.id("form:drag_content"));
		WebElement toElement = driver.findElement(By.id("form:drop_content"));
		
		Actions action = new Actions(driver);
	/*	action.clickAndHold(fromElement);
		action.moveToElement(toElement);
		action.release(toElement);
		action.build().perform(); */
		
		action.dragAndDrop(fromElement, toElement);
		action.build().perform();
		
		String bgColor = toElement.getCssValue("background-color");
		//System.out.println(bgColor);
		if(bgColor.equals("rgba(0, 113, 188, 1)")) {
			System.out.println("Element dropped successfully and the value is: " + bgColor);
		}
	}

}
