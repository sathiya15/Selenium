package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

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
		driver.findElementByXPath("(//ul[@class = 'shortcuts']//a)[4]").click();//Merge leads
		driver.findElementByXPath("(//input[@id='ComboBox_partyIdFrom']/ancestor::tr)[2]").click(); //from Lead icon
		driver.findElementByXPath("(//input[@id='ComboBox_partyIdTo']/ancestor::tr)[2]").click(); //To lead icon
		
		
		
		
		

	}

}
