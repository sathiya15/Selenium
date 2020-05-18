package week2.day2;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");		
		driver.manage().window().maximize();
//		String java =  driver.findElementByXPath("(//div[@class = 'example'])[1]/div[1]").getText();
		
		//Select the languages that you know?
	  for(int i=1;i<=5;i++) {
		  String option = driver.findElementByXPath("(//div[@class = 'example'])[1]/div["+i+"]").getText();
		  System.out.println("option " +option); 
		  if(option.equalsIgnoreCase("Java")) {
			  driver.findElementByXPath("(//div[@class = 'example'])[1]/div["+i+"]/input").click();			  
		  }
	  }
		//Confirm Selenium is checked
	  boolean flag=false;
	flag= driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		if(flag) {
		System.out.println("Selenium is checked");	
		}
		else {
			System.out.println("Selenium is not checked");
		}
		
		//DeSelect only checked
		
		 for(int i=7;i<=8;i++) {
			 boolean  select=false;
			  select = driver.findElementByXPath("(//input[@type='checkbox'])["+i+"]").isSelected();
			System.out.println(select);
			  if(select) {
				  driver.findElementByXPath("(//input[@type='checkbox'])["+i+"]").click();			  
			  }
		  }
		
		//Select all below checkboxes
		 
		 for(int i=9;i<=13;i++) {
		
			 driver.findElementByXPath("(//input[@type='checkbox'])["+i+"]").click();			  
			  
		  }
	  
	}

}
