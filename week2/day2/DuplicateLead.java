package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[@class='x-tab-strip-inner']/span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress' and @type='text']").sendKeys("testleaf@gmail.com");
		driver.findElementByXPath("//button[@class='x-btn-text' and text()='Find Leads']").click(); //click on find leads
	 	Thread.sleep(3000);
	 	String name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]").getText();
	 	System.out.println(name); //capture first resulting name
	 	
	 	//click on first resulting lead
	 	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();		
		
		//Click on duplicate lead
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/a[@class='subMenuButton'])[1]").click();
		
		//Print Title of the page
		String duptitle = driver.getTitle();
				System.out.println(duptitle);
				
		if(duptitle.contains("Duplicate Lead")) {
			System.out.println("Title verified as 'Duplicate Lead'");
		}
		
		driver.findElementByXPath("//input[@type='submit' and @value='Create Lead']").click();
		String dupname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		System.out.println(dupname);
		
		if(name.equalsIgnoreCase(dupname)) {
			System.out.println("duplicated lead name is same as captured name");
		}	
		
		driver.close();
	}

}
