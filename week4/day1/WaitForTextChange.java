package week4.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTextChange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL - https://www.cleartrip.com/
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//h5[text()='Wait for Text Change']").click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe(By.id("btn"),"Click ME!"));
		String text = driver.findElementById("btn").getText();
		System.out.println(text);
		driver.findElementById("btn").click();
		wait.until(ExpectedConditions.alertIsPresent());
		String alert = driver.switchTo().alert().getText();
		System.out.println("Alert box text: " +alert);
		
		
		
		
	}

}
