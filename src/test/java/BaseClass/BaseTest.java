package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.DriverManeger;
import utilities.Waits;

public class BaseTest {
	public static WebDriver driver ;
	@Parameters("appURL")
	@BeforeMethod
	public void setUp(@Optional String appURL)
	{
		 
		  driver=DriverManeger.driverFactory("chrome");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  driver.get("https://testautomationpractice.blogspot.com/");
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	  
	@AfterMethod
	public void tearDown()
	{   
		if (driver!= null) {
	           driver.quit();
	       }
	        
		
	}
	
	
	
	
}
