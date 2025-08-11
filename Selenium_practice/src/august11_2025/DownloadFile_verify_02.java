package august11_2025;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile_verify_02 {

	public static WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;	
	}

	public static void downloadFile(WebDriver driver) throws InterruptedException {
		driver.get("https://leafground.com/file.xhtml;jsessionid=node010bl699zqd34t1108mthfc2end3749595.node0");

		WebElement fileToDownload = driver.findElement(By.id("j_idt93:j_idt95"));
		fileToDownload.click();

		Thread.sleep(3000);
	}

	public static void verifyFile() {
		File filepath = new File("C:\\Users\\SIVA\\Downloads");
		File[] totalFiles = filepath.listFiles();

		for(File file : totalFiles) {
			if(file.getName().equals("TestLeaf Logo.png"));
			System.out.println("file downloaded");
			return;
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver childDriver = initializeDriver();
		downloadFile(childDriver);
		verifyFile();
	}

}
