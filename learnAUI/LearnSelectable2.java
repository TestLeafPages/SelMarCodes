package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectable2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/selectable.html");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).release(item4).perform();
		
		
		
		
	}

}
