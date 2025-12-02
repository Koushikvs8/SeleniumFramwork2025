package tests.AllInteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class mouseAction extends BaseTest {
	

@Test
	public static void Mouseactions()
	{  Waits waits=new Waits(driver);
      Actions action=new Actions(driver);
      waits.pause();
      WebElement first=driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
      WebElement second=driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
      action.dragAndDrop(driver.findElement(By.xpath("(//div[@id='draggable'])")), driver.findElement(By.xpath("//div[@id='droppable']"))).perform();
      action.moveToElement(first).pause(Duration.ofSeconds(2)).moveToElement(second).build().perform();
      waits.pause();
      action.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
      waits.pause();
      action.contextClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
      waits.pause();
 
      action.moveToElement(first).pause(Duration.ofSeconds(2));
	}


}
