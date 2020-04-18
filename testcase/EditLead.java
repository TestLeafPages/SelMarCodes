package testcase;

import org.testng.annotations.Test;

import leaftaps.api.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods{
	
	

	@Test
	public void runEditLead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("95");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Google");
		driver.findElementByName("submitButton").click();
		
	}
	
	

	

}






