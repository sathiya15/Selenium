package week4.day2;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");		
		driver.findElementByClassName("decorativeSubmit").click();		
		driver.findElementByXPath("//div[@id='label']").click();	
		driver.findElementByXPath("//div[@class='x-panel-header']/a[text()='Contacts']").click(); //Click on contacts
		driver.findElementByXPath("//div[@class='frameSectionBody']//a[text()='Merge Contacts']").click();//Merge Contacts
		String mainwindow = driver.getWindowHandle();
		
		driver.findElementByXPath("(//input[@id='partyIdFrom']//following::img)[1]").click(); //from contact
		
		Set<String> childwindow = driver.getWindowHandles();
		for (String string : childwindow) {
			
			driver.switchTo().window(string);
			System.out.println("from window "+driver.getTitle());
		}
		Thread.sleep(2000);	
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]").click();
		driver.switchTo().window(mainwindow);
		
		Thread.sleep(2000);	
		
		driver.findElementByXPath("(//input[@id='partyIdFrom']//following::img)[2]").click(); //to contact
		Set<String> towindow = driver.getWindowHandles();
		for (String string : towindow) {
			driver.switchTo().window(string);	
			System.out.println("to window "+driver.getTitle());
			
		}
		Thread.sleep(2000);	
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[2]").click();
		driver.switchTo().window(mainwindow);
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();	
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("final page: "+driver.getTitle());
		
	
	}

}
