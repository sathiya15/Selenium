package week3.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");	
		driver.manage().window().maximize();
		driver.findElementByXPath("//table[@id='table_id']");
		
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		System.out.println("Row size: " +rows.size());
	
		for(int i=2;i<=rows.size();i++) {
			List<WebElement> cols = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
			System.out.println(i +" Row's column size: "+cols.size());
		
			
			for(int j=1;j<=cols.size();j++) {
				
		driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				//System.out.println("cell value  "+cell);				
			}	
		}
	
//		///fin
		for(int i=2;i<rows.size();i++) {
			String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]").getText();
			if(text.equalsIgnoreCase("Learn to interact with Elements")) {
				String text2 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]").getText();
				System.out.println(text2);
			}
		}
		
		
	}

}
