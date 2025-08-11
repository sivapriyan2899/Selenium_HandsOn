package august11_2025;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile_verify_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node010bl699zqd34t1108mthfc2end3749595.node0");
		
		WebElement Dbutton = driver.findElement(By.id("j_idt93:j_idt95"));
		Dbutton.click();
		
		Thread.sleep(3000);
		
		File fileLocation = new File("C:\\Users\\SIVA\\Downloads");
		File[] allFiles = fileLocation.listFiles();
		
		for(File file : allFiles) {
			//System.out.println(file.getName());
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("file is downloaded");
				return;
			}
		}
	}
}
