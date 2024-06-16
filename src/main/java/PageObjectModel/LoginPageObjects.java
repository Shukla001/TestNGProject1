package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By Login=By.xpath("//input[@id='Login']");
	
	By tryForFree=By.xpath("//a[@id='signup_link']");
	
	By LoginError=By.xpath("(//div[@class='loginError'])[2]");
	
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement EnterUsername() {
		
		return driver.findElement(username);
		// internally-> driver.findelements(By.xpath("//input[@id='username']"));
	}
	
	public WebElement EnterPassword() {
		
		return driver.findElement(password);
		// internally-> driver.findelements(By.xpath("//input[@id='password']"));
	}
	
	public WebElement ClickOnLogin() {
		
		return driver.findElement(Login);
		// internally-> driver.findelements(By.xpath("//input[@id='Login']"));
		
	}
	public WebElement ClickOntryForFree() {
		
		return driver.findElement(tryForFree);
		// internally-> driver.findelements(By.xpath("//input[@id='tryForFree']"));
		
	}
	public WebElement LoginError() {
		
		return driver.findElement(LoginError);
		// internally-> driver.findelements(By.xpath("//input[@id='tryForFree']"));
		
	}

	
}
