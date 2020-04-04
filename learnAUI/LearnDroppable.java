package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDroppable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement draggrable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		
		Thread.sleep(3000);
		
		Actions builder =  new Actions(driver);
		builder.dragAndDrop(draggrable, droppable).perform();
	
		
		
	}

}
