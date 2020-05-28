package week4.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL
		driver.get("https://dev60453.service-now.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementById("sysverb_login").click();
		System.out.println("title of the page: "+driver.getTitle());
		driver.findElementByXPath("//input[@id='filter']").sendKeys("change");
		Thread.sleep(5000);
		//driver.findElementByXPath("//span[text()='Change']").click();
		//Thread.sleep(5000);
		driver.findElementByXPath("(//div[text()='Open'])[3]").click();
		Thread.sleep(5000);
		
		//click on new
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[@type='submit' and text()='New']").click();
		driver.findElementByXPath("(//div[@class='container-fluid wizard-container']/a)[1]").click();//first option
		
		//Capture the change request Number from the Number Field
		String changeNo = driver.findElementByXPath("//input[@id='change_request.number']").getAttribute("value");
		System.out.println("Change number: "+changeNo);
		
		//filling mandatory fields
		driver.findElementByXPath("//input[@id='change_request.short_description']").sendKeys("Error in creating change request");
		driver.findElementByXPath("//button[@type='submit' and text()='Submit']").click(); //click on submit
		driver.switchTo().defaultContent();
		//sending number to search field
		Thread.sleep(5000);
		driver.findElementByXPath("//div/input[@id='sysparm_search']").sendKeys(changeNo,Keys.ENTER);
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		String DisplayedChangeNo = driver.findElementByXPath("//input[@id='change_request.number']").getAttribute("value");
		System.out.println("DisplayedChangeNo on screen: "+DisplayedChangeNo);
		driver.switchTo().defaultContent();
		
		if(changeNo.equalsIgnoreCase(DisplayedChangeNo)) {
			System.out.println("Change ticket created successfully");
		}	
		

		
	}

}
