package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstResultingLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByXPath("//div[@id='label']").click();		
	
		driver.findElementByXPath("//a[text()='Leads']").click();
	//	driver.findElementByXPath("//a[contains(@id,'ext-gen') and @class='selected']").click();
		driver.findElementByXPath("(//ul[@class = 'shortcuts']//a)[3]").click();//find lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();  //First Resulting Lead
		//driver.get("URL"); 
		

	}

}
