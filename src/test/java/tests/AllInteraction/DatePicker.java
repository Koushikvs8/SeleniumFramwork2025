package tests.AllInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class DatePicker extends BaseTest{

	@Test
	public void PickTheDate()
	{   
	    String[] dateMonthYear= "12/12/2025".split("/");
	    String  date=dateMonthYear[0];
	    String month=dateMonthYear[1];
	    String year=dateMonthYear[2];
	    
	    WebElement dateInput=driver.findElement(By.xpath("//input[@id='txtDate']"));
	    Waits.WaitByVisibility(dateInput).click();
	    Waits.pause();
	    
	    
	    
		
	}
	
   

}
