package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		 //click on Phone		
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner'])[2]/span[text()='Phone']").click();
		//enter Phone number
		driver.findElementByXPath("//input[@name='phoneNumber' and @type='text']").sendKeys("99"); 
		 
		//click on find leads
		driver.findElementByXPath("//button[@class='x-btn-text' and text()='Find Leads']").click(); 
	 	Thread.sleep(5000);
	 	
	 	//capture first resulting lead id
		String id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText(); 
		System.out.println("First Resulting id "+id.toString());
		
		//Click on first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		//Delete lead
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous' and text()='Delete']").click();
		
		driver.findElementByXPath("(//ul[@class = 'shortcuts']//a)[3]").click();//find leads
		
		//send id
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[@name='id']").sendKeys(id); 

		driver.findElementByXPath("//button[@class='x-btn-text' and text()='Find Leads']").click();//find leads
		
		//String id1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText(); //first resulting lead
		
//		boolean displayed = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").isDisplayed();
//		if(!displayed) {
			//String text = driver.findElementByXPath("((//table/following::button[@type='button' and text()='Export To Excel'])/following::div)[1]").getText();
		
		Thread.sleep(5000);
		
		String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
					
			System.out.println("text " +text.toString());
			driver.close();
			}
}

 