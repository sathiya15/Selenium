package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL 
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElementByXPath("(//div/a[text()='Women'])[1]")).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//li/a[text()='Jackets & Coats']").click();
		
		//Find the total count of item 
		String count = driver.findElementByXPath("//span[@class='title-count']").getText();
		String count1 = count.replaceAll("[!@#$%^&*()a-zA-Z- ]","");
		int total_items = Integer.parseInt(count1);
		System.out.println("total items: "+total_items);
		
		//Validate the sum of categories count matches
		//Count of jackets
		String jacket = driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText();
	
		String jack = jacket.replaceAll("[a-zA-Z!@#$%^&*()]", "");
		
		int jacketcount = Integer.parseInt(jack);
		System.out.println("jackets count: "+jacketcount);
		
		//count of coats
		String coat = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText();
	
		String coat1 = coat.replaceAll("[!@#$%^&*()]", "");
		int coatcount = Integer.parseInt(coat1);		
		System.out.println("coat count: "+coatcount);
		
		int total = jacketcount+coatcount;
		System.out.println("total count: "+total);
		
		if(total==total_items) {
			System.out.println("sum of categories count matches with total items");
		}

		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
		driver.findElementByXPath("//div[@class='brand-more']").click();
		driver.findElementByXPath("//input[@type='text' and @placeholder='Search brand']").sendKeys("MANGO");
		//driver.findElementByXPath("(//input[@value='MANGO'])[2]").click();
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[11]").click(); //click on mango
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
		Thread.sleep(2000);
		//String brandtotal = driver.findElementByXPath("//span[@class='title-count']").getText();
		//System.out.println(brandtotal);
		List<WebElement> brand = driver.findElementsByXPath("//div/h3[@class='product-brand']");
		for (WebElement webElement : brand) {
			String brandname = webElement.getText();
			if(brandname.equalsIgnoreCase("MANGO")) {
				System.out.println("coat brand is "+brandname);
			}			
		}
				
		builder.moveToElement(driver.findElementByXPath("//div[@class='sort-sortBy']/span[text()='Recommended']")).perform();
		driver.findElementByXPath("//li/label[text()='Better Discount']").click();
		Thread.sleep(3000);
	//String price = driver.findElementByXPath("(//span[@class='product-discountedPrice'])[1]").getText();
		String price = driver.findElementByXPath("//div[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]").getText();
		System.out.println("first displayed item price: "+price);
		Thread.sleep(3000);
		builder.moveToElement(driver.findElementByXPath("(//h4[@class = 'product-product'])[1]")).perform();
		Thread.sleep(3000);
		
		//click on whishlist
	    driver.findElementByXPath("(//div/span[text()='wishlist'])[1]").click();
	    driver.close();
		
	}

}
