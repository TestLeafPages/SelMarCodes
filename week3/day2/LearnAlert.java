package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // ClassName obj = new ClassName();

		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		// Way 1
		/*String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();*/
		
		// Way 2
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		

		
	}
	
	

}
