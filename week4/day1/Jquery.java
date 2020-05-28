package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
				
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		 driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		int x = driver.findElementByXPath("//li[text()='Item 4']").getLocation().getX();
		System.out.println("X: " +x);
		
		int y = driver.findElementByXPath("//li[text()='Item 4']").getLocation().getY();
		System.out.println("X: "+y);
		Actions builder= new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		
		
		
	}

}
