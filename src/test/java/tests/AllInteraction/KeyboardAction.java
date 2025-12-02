package tests.AllInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class KeyboardAction extends BaseTest {
   @Test
	public static void KeyboardAction()
	{  Waits waits=new Waits(driver);
	   Actions action =new Actions(driver);
	     driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("koushik vittal shet");
	     action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	     action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	     waits.pause();
	     driver.findElement(By.xpath("//input[@id='name']")).click();
	     waits.pause();
	     action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	     
	     
	}

}
