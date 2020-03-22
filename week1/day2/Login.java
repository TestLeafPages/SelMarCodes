package week1.day2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		// To Open the Chrome Browser		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //ClassName obj = new ClassName();
		
		// To Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		// To maximize the window(browser)
		driver.manage().window().maximize();
		
		// fetch title
		String title = driver.getTitle();
		System.out.println(title);
		
		// Enter the Username
		WebElement uName = driver.findElementById("username");
		uName.sendKeys("DemoSalesManager");
		
		
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		// click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click crm/sfa
		driver.findElementByLinkText("CRM/SFA").click();
		
		// click Leads
		driver.findElementByLinkText("Leads").click();
		
		// Click Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopinath");
		
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayakumar");
		
		// Click Create Lead button
		driver.findElementByName("submitButton").click();		
		
		//Close Browser
	    driver.close();
		
		
		
		
		
		
	}

}
