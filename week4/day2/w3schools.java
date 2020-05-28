package week4.day2;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Sathiya");
		Thread.sleep(2000);
	
		
		String text = driver.findElementByXPath("//p[contains(text(),'Sathiya')]").getText();
		System.out.println(text);
		
		
	}

}
