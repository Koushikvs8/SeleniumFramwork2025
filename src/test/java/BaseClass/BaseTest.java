package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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
	public static Properties prop;
	String browser;
	
	@Parameters("appURL")
	@BeforeMethod
	public void setUp(@Optional String appURL)
	{
		  loadConfig();
		
		  browser =(System.getProperty("browser") == null ||System.getProperty("browser").isEmpty()) ? prop.getProperty("Browser")
	                : System.getProperty("browser");
		  driver=DriverManeger.driverFactory(browser);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  driver.get(prop.getProperty("Url"));
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
	}
	  
	
	@Test
	public void test()
	{
		
	}
	@AfterMethod
	public void tearDown()
	{   
		if (driver!= null) {
	           driver.quit();
	       }
	        
		
	}
	
	
	//C:\KoushikEclipsWorkspace\selnium-automation\src\main\resources\config.properties
	public static void loadConfig() 
	{
		try {
			FileInputStream myFileInputStream =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
			prop=new Properties();
			prop.load(myFileInputStream);
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found :"+e.getMessage());
		}
		catch (IOException e) {
            System.out.println("An error occurred while accessing the file: " + e.getMessage());
        }
	}
	
	
	
	
}
