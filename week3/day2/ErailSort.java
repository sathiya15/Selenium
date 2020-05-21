package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
	//	Launch the browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
//		Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
//		Uncheck the check box - sort on date		
		boolean selected = driver.findElementByXPath("//input[@id='chkSelectDateOnly']").isSelected();
		if(selected) {
			driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		}

//		clear and type in the source station 
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MDU",Keys.ENTER);
				
//		clear and type in the destination station
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("MSB",Keys.ENTER);
		
		Thread.sleep(5000);
		
//		Find all the train names using xpath and store it in a list
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		List<String> trainName = new ArrayList<String>();
		
		for(int i=1;i<=rows.size();i++) {
			
			String train = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			trainName.add(train);
		}
		
//		Use Java Collections sort to sort it and then print it
		Collections.sort(trainName);
		
		for (String string : trainName) {
			System.out.println(string);
			
		}


		
	}

}















