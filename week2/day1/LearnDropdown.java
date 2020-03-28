package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {

		// To Open the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // ClassName obj = new ClassName();

		// To Load the URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// To maximize the window(browser)
		driver.manage().window().maximize();

		// fetch title
		String title = driver.getTitle();
		System.out.println(title);

		// Select the dropdown

		// Step 1: Locate the element
		WebElement ele = driver.findElementById("dropdown1");
		
		// Deal with dropdown - Select
		
		// Convert the webelement to dropdown (select)
		Select dd = new Select(ele);		
		
		
		// List -> Collection (store duplicate data)
		// List index 0 to size-1
		// size -> method (1) -> how many list items are available
		// get -> method (2) -> pick one item from the list
		
		// If you want to interact or print all options
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			WebElement eachOption = options.get(i);
			System.out.println(eachOption.getText());
		}
		
		// Select one of the option
		// 1) select one of the dropdown by 3 ways
			 // using text  (black color) -> selectByVisibleText
			 // using value (blue color)
			 // using index (your own number -> start with 0) 
		
		//dd.selectByVisibleText("Appium");
		/*dd.selectByValue("4");
		dd.selectByIndex(1);*/
		
		// using text  (black color) -> static/dynamic -> Only language (English)
		// using value (blue color) -> Multiple languages (18) -> value
		// using index (your own number -> start with 0) -> random
		
		/*
		// 1) Inspect the element and find it
		WebElement multiple = driver.findElementByXPath("(//select)[6]");
		
		// convert this to dropdown
		Select ddm = new Select(multiple);
		
		ddm.selectByVisibleText("Selenium");		
		ddm.selectByVisibleText("Loadrunner");
		ddm.deselectAll();
		
		
		
		WebElement ele = driver.findElementById("dropdown1");
		ele.sendKeys("UFT/QTP");
		
*/
		
		// 1) Jog -> 5 rounds -> 1 x 5 times (same code -> executed multiple times 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
