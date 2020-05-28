package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	
	public static void main(String[] args) {
		
	
	
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
	ChromeDriver  driver = new ChromeDriver();
	
//	Launch the URL - https://www.cleartrip.com/
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement men = driver.findElementByLinkText("Men's Fashion");
	
	Actions builder= new Actions(driver);
	builder.moveToElement(men).perform();
	driver.findElementByLinkText("Shirts").click();
	WebElement shirts = driver.findElementByXPath("//picture/img");
	builder.moveToElement(shirts).perform();
	driver.findElementByXPath("//div/div[contains(text(),'Quick View')]").click();

}
}