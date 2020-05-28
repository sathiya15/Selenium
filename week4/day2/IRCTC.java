package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL 
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//alert
		driver.findElementByXPath("//div/button[@type='submit']").click();		
		Thread.sleep(5000);
		
		//click on flights
		driver.findElementByXPath("//li/a[contains(text(),'FLIGHTS')]").click();
		
		Set<String> window = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(window);
		System.out.println("windows "+windows.size());
		
		//Switch to child window
		String childwindow = windows.get(1);		
		driver.switchTo().window(childwindow);
		
		driver.findElementByXPath("//div/label[text()='I have read the guidelines']").click();
		driver.findElementByXPath("//div/button[contains(text(),'Continue')]").click();
		
		
		//flights screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/flights.png");
		FileUtils.copyFile(source, dest);		
		//FileUtils.copyFile();
		driver.switchTo().window(windows.get(0));
		driver.close();
		
		
	}

}
