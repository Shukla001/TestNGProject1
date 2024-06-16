package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.CommonUtility;
import Resources.Constant;
import Resources.baseClass;

//this is the change we need to puch on the github

public class VerifyLogin extends baseClass {
	
	@Test
	public void Login() throws IOException {
	
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		obj.EnterUsername().sendKeys("test");
		CommonUtility.explicitWaits(10, obj.EnterPassword());// added explicit wait to wait until other element are visible.
		
		obj.EnterPassword().sendKeys("1234");
		obj.ClickOnLogin().click();
		
		CommonUtility.handleAssertion(Constant.Expectedstring, obj.LoginError().getText());
		
	}

}
