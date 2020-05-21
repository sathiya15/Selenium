package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
//		Set the system property and Launch the URL
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://erail.in/");	
		driver.manage().window().maximize();
	
//		Click the 'sort on date' checkbox
		boolean selected = driver.findElementByXPath("//input[@id='chkSelectDateOnly']").isSelected();
		if(selected) {
			driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		}
		
//		clear and type in the from station text field
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("BNC",Keys.ENTER);			
		
//		clear and type in the to station text field
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("MSB",Keys.ENTER);		
		
//		Add a java sleep for 2 seconds
		Thread.sleep(3000);
//		Store all the train names in a list
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		List<String> trainName = new ArrayList<String>();
		
		for(int i=1;i<=rows.size();i++) {			
			String train = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			trainName.add(train);
		}
		
//		Get the size of list
		int listsize = trainName.size();
		System.out.println("list Size "+listsize);
		
//		Add the list into a new Set
		 Set<String> set = new LinkedHashSet<String>();
		 
		 for (String string : trainName) {
			 if(!set.add(string)) {
				 System.out.println("Duplicate train names are: "+string);
			 }
			
		}
		 

////		Get the size of set
		 int setsize = set.size();
		 System.out.println("set size "+setsize);

//		Compare the Size of list and Set to verify the names are unique
		 
		 if(listsize!=setsize) {
			 System.out.println("No.of Duplicate names are: "+ (listsize-setsize));
		 }
		 
	}

}
