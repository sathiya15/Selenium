package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");		
		driver.manage().window().maximize();
		//Go to Home Page
		driver.findElementByLinkText("Go to Home Page").click();
	    driver.findElementByXPath("//img[@alt='Link']/parent::a").click();	
	    
	    //Find where am supposed to go without clicking me?
	    driver.findElementByXPath("(//div[@class='row']//a)[2]");
	    
	    //Verify am I broken?
	    driver.findElementByXPath("(//div[@class='row']//a)[3]").click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    if(title.contains("404")) {
	    	System.out.println("Link Is Broken");
	    }
	    else {
	    	System.out.println("Link Is not Broken");
	    }
	    
	    driver.navigate().back();
	    driver.findElementByLinkText("Go to Home Page").click();
	      //  System.out.println("url "+driver.getCurrentUrl());
	    
	   // Go to Home Page (Interact with same link name)
	   
	    
	}

}
