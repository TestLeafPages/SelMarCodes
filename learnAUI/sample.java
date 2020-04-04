package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement item2 = driver.findElementByXPath("//ul[@id='sortable']/li[2]");
		WebElement item3 = driver.findElementByXPath("//ul[@id='sortable']/li[3]");
		WebElement item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		int x = item1.getLocation().getX();
		int y = item4.getLocation().getY();
		
		int c = x - y;
		System.out.println(x+"  "+y+"  "+c);
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).moveByOffset(0, (x-y)-10).release().perform();
		
	}

}
