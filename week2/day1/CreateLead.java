package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
     	driver.findElementByXPath("//a[text()='Create Lead']").click();
     	driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("testleaf");
     	driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("sathiya");
     	driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("sam");
     	driver.findElementByXPath("//input[@name='submitButton']").click();
 
	}

}
