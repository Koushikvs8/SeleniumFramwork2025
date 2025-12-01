package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManeger {
	public static WebDriver driver ;

	public static WebDriver driverFactory(String browser)
	{     
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Egde"))
		{
			driver =new EdgeDriver();
		}
		else
		{
			throw new IllegalArgumentException("Invalid browser : the browser is not exist");
		}
	
	
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

	
	
	
	
}
