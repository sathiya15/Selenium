package week2.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BondWithButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");		
		driver.manage().window().maximize();
		//Go to Home Page
		driver.findElementByXPath("//button[@id='home']").click();
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		
		//Get position
		WebElement position = driver.findElementByXPath("//button[@id='position']");
		Point point = position.getLocation();
		System.out.println("Position x: " +point.getX());
		System.out.println("Position Y: "+point.getY());
		
		//Get Color

		String color = driver.findElementById("color").getCssValue("background-color");		
		
		System.out.println("Background color is :"+color);
		
		//Height and Width
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("height and width is: "+size);
	

	}

}
