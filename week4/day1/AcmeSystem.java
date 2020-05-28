package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AcmeSystem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		Actions builder=new Actions(driver);
		builder.click(driver.findElementById("email")).sendKeys("kumar.testleaf@gmail.com").sendKeys(Keys.TAB).perform();
		builder.click(driver.findElementById("password")).sendKeys("leaf@12").perform();
		builder.click(driver.findElementById("buttonLogin")).perform();
		//WebDriverWait wait=new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		builder.moveToElement(driver.findElementByXPath("(//button/i)[5]")).perform();
		builder.click(driver.findElementByXPath("//a[text()='Search for Vendor']")).perform();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		
		List<WebElement> list = driver.findElementsByXPath("//table[@class='table']//tr");
		System.out.println("row size: "+list.size());
		List<String> list1 = new ArrayList<String>();
		for(int i=2;i<=list.size();i++) {
			String text = driver.findElementByXPath("//tbody//tr["+i+"]/td[5]").getText();
			list1.add(text);
		}
		
		for (String string : list1) {
			System.out.println("country name : "+string);
			
		}		
		driver.findElementByXPath("//a[text()='Log Out']").click();
		driver.close();
	}

}
