package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import leaftaps.api.ProjectSpecificMethods;


public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFile = "TC001_CreateLead";
	}

	
	@Test(dataProvider = "getData")
	public void runCreateLead(String cName, String fName, String lName, String phn) {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(phn);
		driver.findElementByName("submitButton").click();
	}
}






