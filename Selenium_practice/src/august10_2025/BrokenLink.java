package august10_2025;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	
	
	public static void checkBrokenLink(String link) {
		
		try {
			
		URL url = new URL(link);
		HttpURLConnection httpConnection = (HttpURLConnection)  url.openConnection();
		httpConnection.setConnectTimeout(5000);
		httpConnection.connect();

		if(httpConnection.getResponseCode()>=400) {
			System.out.println(httpConnection.getResponseMessage());
		}
		else
			System.out.println(httpConnection.getResponseMessage());

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("button.a-button-text")).click();

		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(listOfLinks.size());

		List<String> urlList = new ArrayList<String>();
		

		for(WebElement element : listOfLinks) {
			String link = element.getAttribute("href");

			if(link==null || link.isEmpty() || !link.startsWith("http")) {
				continue;
			}

			urlList.add(link);
		}
		
		long startTime = System.currentTimeMillis();
		urlList.parallelStream().forEach(e -> checkBrokenLink(e));
		long endTime = System.currentTimeMillis();
		long totalTime = endTime-startTime;
	
		System.out.println("Total time taken "+totalTime);
}

}
