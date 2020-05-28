package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions builder= new Actions(driver);
		//click on brands
		
		//builder.moveToElement(driver.findElementByXPath("//li[@class='menu-dropdown-icon']/a[text()='brands']")).build().perform();
		
		builder.moveToElement(driver.findElementByXPath("//li[@class='menu-dropdown-icon']/a[text()='brands']")).perform();
		Thread.sleep(3000);
		
		//click on popular
		builder.moveToElement(driver.findElementByXPath("//div[@class='BrandsCategoryHeading']/a[text()='Popular']")).perform();
		Thread.sleep(3000);
		
		//click on LO'real
		driver.findElementByXPath("//li/a/img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']").click();
		
		//Go to the newly opened window, check the Page title contains L'Oreal Paris and close the first window
		Set<String> window = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window);
		list.addAll(window);
		
		driver.switchTo().window(list.get(1));
		String title = driver.getTitle();
		System.out.println("page title: "+title);
		
		//closing the first window
		driver.switchTo().window(list.get(0));
		driver.close();
		
		//Click sort By and select customer top rated
		driver.switchTo().window(list.get(1));
		driver.findElementByXPath("//span/span[contains(text(),'Sort By')]").click();//click on sortby
		Thread.sleep(3000);
		
		//click on customer top rated
		driver.findElementByXPath("//div/span[text()='customer top rated']/ following-sibling :: div").click();
		Thread.sleep(3000);
		
		//click on category
		driver.findElementByXPath("//div[@class='clearfix']/div[text()='Category']").click();
		Thread.sleep(3000);
		
		//click on shampoo
		driver.findElementByXPath("//label/span[contains(text(),'Shampoo')]/following-sibling::div").click();
		Thread.sleep(3000);
		
		// Click on the first listed item
		driver.findElementByXPath("(//div/div/div/img[@class='listing-img'])[1]").click();
		Thread.sleep(3000);
		
		//GO to the new window 		
		Set<String> window1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(window1);
		list1.addAll(window1);
		Thread.sleep(3000);
		
		driver.switchTo().window(list1.get(1));
		driver.findElementByXPath("//div[@class='clearfix combo-add-to-btn-section']/div/div/button").click(); // click add to bag
		Thread.sleep(3000);
		
		//click on shopping bag icon 
		driver.findElementByXPath("//div[@class='AddToBagbox']/div[@class='AddBagIcon']").click();
		Thread.sleep(3000);
		
		//click on proceed
		driver.findElementByXPath("//button[@type='button']/span[text()='Proceed']").click();
		Thread.sleep(3000);
		
		//print the error message
		String error = driver.findElementByXPath("//div/div[@class='popup-error']").getText();
		System.out.println("Error message: "+error);
		driver.close();
		
		
		
		
		
		
		
	}

}
