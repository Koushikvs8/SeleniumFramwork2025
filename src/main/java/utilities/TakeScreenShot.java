package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {


	public static void takeScreenshot(WebDriver driver, String screenshotName) {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File srcFile = ts.getScreenshotAs(OutputType.FILE);

	    // Generate timestamp
	    String timestamp = String.valueOf(System.currentTimeMillis());

	    // Destination folder inside resources
	    String destPath = System.getProperty("user.dir") 
	                      + "/src/test/resources/ScreenShots/" 
	                      + screenshotName + "_" + timestamp + ".png";
	    
	    File destFile = new File(destPath);

	    try {
	        FileUtils.copyFile(srcFile, destFile);
	        System.out.println("Screenshot saved at: " + destPath);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
		
		
		
	}


