package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.CommonUtility;
import Resources.Constant;
import Resources.baseClass;

public class VerifyLogin extends baseClass {
	
	@Test
	public void Login() throws IOException {
	
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		obj.EnterUsername().sendKeys("test");
		obj.EnterPassword().sendKeys("1234");
		obj.ClickOnLogin().click();
		
		CommonUtility.handleAssertion(Constant.Expectedstring, obj.LoginError().getText());
		
	}

}
