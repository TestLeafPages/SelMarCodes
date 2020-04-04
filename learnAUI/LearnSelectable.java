package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/selectable.html");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		Actions builder = new Actions(driver);
		
	//	builder.keyDown(Keys.CONTROL) for window users
		builder.keyDown(Keys.COMMAND).click(item1).click(item3).click(item5).click(item7).perform();
		
		
		
		
		
	}

}
