package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public WebDriver driver;
	public Properties prop;
	
	public void initializeBrowser() throws IOException {
		//to read the file in data.properties		
		                                         // this will automatically take the path of the users file location
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\Resources\\\\data.properties");
		//to access the file i.e., data.properties.-> we create the object of the properties and load the data from "fis".
		 prop=new Properties();
		//to load the file which has been read
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();// we have replaced to call the chrome driver with this WebDriverManager code
			
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			//firefox
		}
		
        else if(browserName.equalsIgnoreCase("edge")) {
			
			//edge
		}
        else {
        	System.out.println("enter proper browser data");
        }
		
	}
	@BeforeMethod
	public void LaunchURL() throws IOException {
		
		initializeBrowser();
		
		String url=prop.getProperty("url");// to access  the url stored in the data.properties file
		
		driver.get(url);// to get the url from the data.properties.
	}

}
