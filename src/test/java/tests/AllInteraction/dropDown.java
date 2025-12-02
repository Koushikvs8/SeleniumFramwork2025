package tests.AllInteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class dropDown extends BaseTest{

	@Test
	public static void dropdown()
	{   Waits wait= new Waits(driver);
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='country']"));
        Select  options=new Select(dropDown);
        List<WebElement> option =options.getOptions();
      
        for(int i=0; i<option.size(); i++)
        {   //option.get(i).click();
        	options.selectByIndex(i);
        	wait.pause();
        }
        options.selectByVisibleText("Canada");
        wait.pause();
        options.selectByValue("germany");
        
   
        
	

}}
