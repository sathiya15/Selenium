package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithEditFields {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");		
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("TestLeaf");
		Thread.sleep(2000);
	//	String str = driver.findElementByXPath("(//label[@for='uname'])[1]").getText();
		//System.out.println(str);
		String text = driver.findElementByXPath("(//input[@type='text'])[3]").getAttribute("value");		
		System.out.println(text);
		
		
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		Thread.sleep(2000);
		boolean enabled = driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();
		System.out.println(enabled);
		

	}

}
