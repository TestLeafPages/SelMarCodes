package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTalbe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://erail.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("SBC", Keys.TAB );

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MAS", Keys.TAB);
		
		
		WebElement chk = driver.findElementById("chkSelectDateOnly");
		
		if(chk.isSelected()) {
			chk.click();
		}
		
		// Step 1: find table webElement
		WebElement table = driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
		

		// Step 2:  find all the rows in the specific table element
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		
		// Step 3: get count of rows
		int rows_count = allRows.size();
		System.out.println(rows_count);
		
		// Step 4: Pick first tr in list(allRows)
		WebElement firstRow = allRows.get(0);
		
		// Step 5: find all the columns of given webElement(firstRow)
		List<WebElement> allColumn = firstRow.findElements(By.tagName("td"));
		
		// Step 6: get count of Columns
		int columns_count = allColumn.size();
		System.out.println(columns_count);
		
		// Step 7: Pick second column of given Webelement(allColumns)
		WebElement sec_column = allColumn.get(1);
		
		
		// Step 8: fetch the Train Name
		String trainName = sec_column.getText();
		System.out.println(trainName);
	




	}

}
