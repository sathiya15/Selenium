package week2.day1;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		
		
//		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver_32 bit.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByPartialLinkText("Leads").click();
     	driver.findElementByLinkText("Create Lead").click();
     	driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
     	driver.findElementById("createLeadForm_firstName").sendKeys("Sathiya");
     	driver.findElementById("createLeadForm_lastName").sendKeys("Sam");
     	
     	Thread.sleep(2000);
     	
        WebElement source = driver.findElementById("createLeadForm_dataSourceId");
        Select dropdown1 = new Select(source);
        dropdown1.selectByVisibleText("Employee");
        
        Thread.sleep(2000);
        
        WebElement campaign = driver.findElementById("createLeadForm_marketingCampaignId");
        Select dropdown4 = new Select(campaign);
        dropdown4.selectByValue("9001");
        
//        WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
//        Select dropdown2 = new Select(industry);
//        dropdown2.selectByValue("IND_SOFTWARE");
        
        Thread.sleep(2000);
        
        WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
        Select dropdown3 = new Select(ownership);
        dropdown3.selectByIndex(5);
        
        Thread.sleep(2000);
        
        WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
        Select dropdown5 = new Select(country);
        dropdown5.selectByVisibleText("India");
        
        Thread.sleep(2000);
        
        driver.findElementByName("submitButton").click();
     	
		}
	}

