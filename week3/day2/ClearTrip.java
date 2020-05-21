package week3.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
//		Launch the browser
			System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
			ChromeDriver  driver = new ChromeDriver();
			
//			Launch the URL - https://www.cleartrip.com/
			driver.get("https://www.cleartrip.com/");
			Thread.sleep(10000);
			driver.manage().window().maximize();
			ChromeOptions chrome=new ChromeOptions();
			chrome.addArguments("--disable-notificatons");
			
			driver.findElementByXPath("//input[@id='RoundTrip' and @type='radio']").click();//Click on round-trip
			driver.findElementByXPath("//input[@id='FromTag' and @name='origin']").sendKeys("chennai", Keys.TAB); //origin
			Thread.sleep(2000);
			driver.findElementByXPath("//input[@id='ToTag' and @name='destination']").sendKeys("New York", Keys.ENTER);//destination
			Thread.sleep(2000);
			driver.findElementByXPath("(//a[@class='calendarIcon']/i[@class='icon ir datePicker'])[1]").click();
			driver.findElementByLinkText("16").click();
			Thread.sleep(2000);
			driver.findElementByXPath("(//a[@class='calendarIcon']/i[@class='icon ir datePicker'])[2]").click();
			driver.findElementByLinkText("10").click();
			Thread.sleep(2000);
			//Select 2 adults
			WebElement dropdown = driver.findElementByXPath("//select[@id='Adults']");
			Select options = new Select(dropdown);
			List<WebElement> adults = options.getOptions();
			adults.get(1).click();
			
			//select 1 children
			WebElement dropdown2 = driver.findElementByXPath("//select[@id='Childrens' and @name='childs']");
			Select options2 = new Select(dropdown2);
			List<WebElement> childrens = options2.getOptions();
			childrens.get(1).click();
			Thread.sleep(2000);
			
			//Select infants
			WebElement dropdown3 = driver.findElementByXPath("//select[@id='Infants' and @name='infants']");
			Select  options3 = new Select(dropdown3);
			List<WebElement> infants = options3.getOptions();
			infants.get(1).click();
			driver.findElementById("MoreOptionsLink").click();
			Thread.sleep(2000);
			
			// Select Premium Economy as Class of Travel
			WebElement dropdown4 = driver.findElementByXPath("//select[@id='Class' and @name='class']");			
			Select  options4 = new Select(dropdown4);
			List<WebElement> travelclass = options4.getOptions();
			Thread.sleep(2000);
			
			for(int i=0;i<=travelclass.size()-1;i++) {
			String str = travelclass.get(i).getText();
			if(str.equalsIgnoreCase("Premium Economy")) {
				travelclass.get(i).click();
				break;
			}
			}
			Thread.sleep(2000);
			driver.findElementByXPath("//input[@id='AirlineAutocomplete']").sendKeys("Emirates",Keys.TAB);
			driver.findElementByXPath("//input[@id='SearchBtn' and @title='Search flights']").click();
			
		
			//driver.findElementById("SearchBtn").click();
			
			
			
			
			
			
			
			
			
	}

}
