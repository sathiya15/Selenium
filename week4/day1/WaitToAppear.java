package week4.day1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToAppear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Test Leaf\\Softwares\\Error\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL - https://www.cleartrip.com/
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//h5[text()='Wait to Appear']").click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//button[@id='btn']")));
		String text = driver.findElementByXPath("//button[@id='btn']").getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}

}
