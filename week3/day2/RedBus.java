package week3.day2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RedBus {

	public static void main(String[] args) throws InterruptedException {
//		Launch the browser
			System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
			ChromeDriver  driver = new ChromeDriver();
			
//			Launch the URL - https://www.cleartrip.com/
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			ChromeOptions chrome=new ChromeOptions();
			chrome.addArguments("--disable-notificatons");
			//System.out.println("disable");
			//select Source
			driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai");
			Thread.sleep(2000);
			driver.findElementByXPath("//input[@id='src']").sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			//Select destination
			driver.findElementByXPath("//input[@id='dest']").sendKeys("Trichy");
			Thread.sleep(2000);
			driver.findElementByXPath("//input[@id='dest']").sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			//from date
			driver.findElementByXPath("(//td[@class='current day'])[2]").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//label[@for='return_cal' and text()='Return Date']").click();
			driver.findElementByXPath("(//td[@class='current day'])[2]").click();
////			//driver.findElementByLinkText("21").click();
//			Thread.sleep(1000);
			driver.findElementByXPath("//button[@id='search_btn']").click();
	}

}
