package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.CommonUtility;
import Resources.Constant;
import Resources.baseClass;

public class VerifySignUp extends baseClass{
	@Test
	public void SignUp() throws IOException, InterruptedException {
	
	LoginPageObjects LPO=new LoginPageObjects(driver);
		LPO.ClickOntryForFree().click();
	
		SignUpPageObjects SPO=new SignUpPageObjects(driver);
		
		SPO.firstName().sendKeys(Constant.firstName);// Sending the keys from the another class i.e., Constant where value are being stored.
		SPO.lastName().sendKeys(Constant.lastName);
		
	
		SPO.JobTitle().sendKeys(Constant.jobTitle);
		SPO.emailID().sendKeys(Constant.emailID);
		SPO.phoneNumber().sendKeys(Constant.phoneNumber);
		
		
		CommonUtility.handelStaticDropDown(SPO.SelectEmployees(), 1);// accessing dropdown of employee using the CommonUtility Class.
	
		/*WebElement e=SPO.SelectEmployees();// for selecting the element from the dropdown icon
		
		Select s=new Select(e);
		
		s.selectByIndex(1);*/
		
		SPO.companyName().sendKeys(Constant.comapanyName);
		
		
		CommonUtility.handelStaticDropDown(SPO.countryRegion(), 1);// accessing dropdown of employee using the CommonUtility Class.
		
		/*WebElement a=SPO.countryRegion();// for selecting the countries from the drop down list
		Select b=new Select(a);
		b.selectByVisibleText("India");*/
		
		Thread.sleep(5000);
		SPO.acceptAgreement().click();
		
		
	}

}
