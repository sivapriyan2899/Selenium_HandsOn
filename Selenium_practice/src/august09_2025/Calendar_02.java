package august09_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_02 {
	
	
	public static String[] splitTitle(String monthYearVar) {
		return monthYearVar.split(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		WebElement input = driver.findElement(By.id("datepicker"));
		input.click();
		
		String monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		
		
		
		//faced issue with the values got by xpath... lesson learned: need to write effective xpath.	
		
		while(!(splitTitle(monthYear)[0].equals("May") && splitTitle(monthYear)[1].equals("2023"))) {
			
			WebElement prev = driver.findElement(By.cssSelector("a.ui-datepicker-prev.ui-corner-all"));
			prev.click();
			
			monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		
		WebElement selectDate = driver.findElement(By.xpath("//a[contains(text(),'25')]"));
		selectDate.click();		
	}

}
