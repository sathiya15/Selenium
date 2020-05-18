package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByXPath("//div[@id='label']").click();		
	
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("(//ul[@class = 'shortcuts']//a)[3]").click();//find leads
		Thread.sleep(3000);
		
		System.out.println(driver.findElementByXPath("// div[@class = 'x-panel-body x-panel-body-noheader x-panel-body-noborder']// input[@name = 'firstName']").isEnabled());
		driver.findElementByXPath("// div[@class = 'x-panel-body x-panel-body-noheader x-panel-body-noborder']// input[@name = 'firstName']").sendKeys("sathiya");
		
		Thread.sleep(2000);
		//first resulting lead
		driver.findElementByXPath("(//td[@class='x-btn-center']//button[@class='x-btn-text'])[7]").click(); //click on find leads
				
		Thread.sleep(1000);
		//First resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.tagName("title")).getText());
				
//		System.out.println("company name before Updating " + driver.findElementById("viewLead_companyName_sp").getText());
//	
//		driver.findElementByXPath("//a[@class='subMenuButton' and text()='Edit']").click();// edit button
//		
//		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
//		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");		
//		
//		driver.findElementByXPath("//input[@name='submitButton' and @value='Update']").click();
//		System.out.println("company name after Updating " + driver.findElementById("viewLead_companyName_sp").getText());
//		
//		driver.close();
		
		
		
		
		
	}

}
