package tests.AllInteraction;

import java.awt.Dimension;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.TakeScreenShot;
import utilities.Waits;

public class WindowHandlerTest extends BaseTest {

@Test
public void  WindowHandle()
{    
	Waits waits=new Waits(driver);
	waits.WaitByVisibility(driver.findElement(By.xpath("(//button[normalize-space()='Popup Windows'])[1]")));
	driver.findElement(By.xpath("(//button[normalize-space()='Popup Windows'])[1]")).click();
	//waits.pause();
	String parent = driver.getWindowHandle();
	System.out.println("the parent window handle :"+ parent);
	Set<String>window =driver.getWindowHandles();
	for(String windows:window) {
		if(!windows.equals(parent))
	{    System.out.println("the driver focus ins on :"+ driver.getTitle());
	
		driver.switchTo().window(windows);
		System.out.println("swiching to:"+ driver.getTitle());
		waits.pause();
		driver.manage().window().maximize();
		waits.pause();
		driver.close();
		driver.switchTo().window(parent);
	
	}
	
}
	TakeScreenShot.takeScreenshot(driver, "windowhandler");
}



}
