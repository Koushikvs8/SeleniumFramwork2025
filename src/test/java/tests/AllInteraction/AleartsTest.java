package tests.AllInteraction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class AleartsTest extends BaseTest{
static 
{
	Waits waits=new Waits(driver);
}
	
	@Test
	public static void alearts()
	{  
		
		driver.findElement(By.xpath("//button[normalize-space() ='Simple Alert']")).click();
		Alert myalert=driver.switchTo().alert();
		Waits.pause();
		myalert.accept();
	
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Waits.pause();
		myalert.accept();
		 
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert myalert1=driver.switchTo().alert();
		Waits.pause();
		myalert1.sendKeys("koushik ");
		Waits.pause();
		myalert1.accept();
		Waits.pause();
	}

}
