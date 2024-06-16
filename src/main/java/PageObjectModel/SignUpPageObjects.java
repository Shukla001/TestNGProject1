package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects{
	 
	public WebDriver driver;
			
		By firstName=By.xpath(" //input[@name='UserFirstName']");
		By lastName=By.xpath(" //input[@name='UserLastName']");
		By JobTitle=By.xpath("//input[@name='UserTitle']");
		By emailID=By.xpath("//input[@type='email']");
		By phonenumber=By.xpath("//input[@name='UserPhone']");
		By EmployeeNameDropDown=By.xpath(" //select[@name='CompanyEmployees']");
		By companyName=By.xpath("//input[@name='CompanyName']");
		By countryRegion=By.xpath("//select[@name='CompanyCountry']");
		By acceptAgreement=By.xpath("(//div[@class='checkbox-ui'])[2]");
		
	public SignUpPageObjects(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		
		this.driver=driver2;
		}
	public WebElement firstName() {
		
		return driver.findElement(firstName);
		
	}
	public WebElement lastName() {
		
		return driver.findElement(lastName);
		
	}
	public WebElement JobTitle() {
		
		return driver.findElement(JobTitle);
		
	}
	public WebElement emailID() {
		
		return driver.findElement(emailID);
		
	}
	public WebElement phoneNumber() {
		
		return driver.findElement(phonenumber);
		
	}
	public WebElement SelectEmployees() {
		
		return driver.findElement(EmployeeNameDropDown);
		
	}
	public WebElement companyName() {
		
		return driver.findElement(companyName);
		
	}
	public WebElement countryRegion() {
		
		return driver.findElement(countryRegion);
		
	}
	
	public WebElement acceptAgreement() {
		
		return driver.findElement(acceptAgreement);
		
	}

//this is the user1signup page opbject
}
