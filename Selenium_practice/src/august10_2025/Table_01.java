package august10_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node010qqzgkigpo1z14gp2oqu7rqns3705887.node0");
		
		List<WebElement> listOfNames = driver.findElements(By.xpath("//*[@id='form:j_idt89_data']/tr/td[1]"));
		
		for(WebElement element : listOfNames) {
			
				WebElement joinDate = driver.findElement(By.xpath("//*[@id='form:j_idt89_data']/tr/td[4]"));
				System.out.println(element.getText() +" - "+ joinDate.getText());

		}

	}

}
