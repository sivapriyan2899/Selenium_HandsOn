package august15_2025;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileWriting_W3Schools_Topics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/sql_null_values.asp");

		List<WebElement> listOfTopics = driver.findElements(By.xpath("//*[@id='leftmenuinnerinner']/a"));
		System.out.println(listOfTopics.size());

		String resultFile = "Topics.txt"; // delete the file in project folder and run the program
		String topic;
		int i =1;

		try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(resultFile, true))){
			for(WebElement element : listOfTopics) {
				topic = i+". "+element.getText();
				buffWriter.write(topic);
				buffWriter.newLine();
				i++;
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.quit();

	}
}
