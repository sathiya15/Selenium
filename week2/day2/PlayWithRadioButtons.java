package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithRadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");		
		driver.manage().window().maximize();
		//Are you enjoying the classes?
		driver.findElementByXPath("//input[@id='yes']").click();
		
		//Find default selected radio button
		boolean checked = driver.findElementByXPath("//label[@for='Unchecked']/following-sibling::label[@for = 'Checked']/input").isSelected();
		boolean unchecked = driver.findElementByXPath("//label[@for='Checked']/preceding-sibling::label[@for = 'Unchecked']/input").isSelected();
		
		if(checked) {
			System.out.println("default selected radio button is CHECKED");
		}
		else if(unchecked) {
			System.out.println("default selected radio button is UNCHECKED");
		}
		
		//Select your age group (Only if choice wasn't selected)
		
		boolean year = driver.findElementByXPath("(//input[@class='myradio'])[4]").isSelected();
		System.out.println(year);
		
		if(!year)
		{
			driver.findElementByXPath("(//input[@class='myradio'])[4]").click();
		}
		
		
	}

}
