package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnFlipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		
		
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Apple").click();
		
		
		
		
		
	}

}
