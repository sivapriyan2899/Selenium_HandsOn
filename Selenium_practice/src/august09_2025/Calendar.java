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
		
		
		String monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		String month = monthYear.split(" ")[0].trim();
		String year = monthYear.split(" ")[1].trim();
		
		//following loop will iterate to the year 2023 and month June
		while(!(month.equals("June") && year.equals("2023"))){
			WebElement prevButton = driver.findElement(By.cssSelector("a.ui-datepicker-prev.ui-corner-all > span"));
			prevButton.click();
			
			String newMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			month = newMonthYear.split(" ")[0].trim();
			year = newMonthYear.split(" ")[1].trim();
		}
		
		//will select the date
		WebElement selectDate = driver.findElement(By.xpath("//a[contains(text(), '28')]"));
		selectDate.click();
		
		
		
		
		
	}

}
