package Resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtility {
	
	public static WebDriver driver;
	
	public static void handelStaticDropDown(WebElement element, int index) {
		
		WebElement e=element;// for selecting the element from the dropdown icon
		
		Select s=new Select(e);
		
		s.selectByIndex(index);
	}
	// Thos methpd is used for handling the assertion
	public static void handleAssertion(String expected, String actual) {
		
		SoftAssert sa=new SoftAssert();
		
		String Expectedstring=expected;
		String ActualString=actual;
		
		sa.assertEquals(Expectedstring, ActualString);// inorder to check weather the login is successfull or not.
		
		sa.assertAll();
		
	}
	
	public static void explicitWaits(int duration, WebElement element) {
		
		WebDriverWait wb =new WebDriverWait(driver, Duration.ofSeconds(duration));
		wb.until(ExpectedConditions.visibilityOf(element));
	}

}
