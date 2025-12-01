package tests.AllInteraction;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class NavigationTest extends BaseTest {
    @Test
	public void navigate()
	{
    	
    	Waits wait=new Waits(driver);
    	wait.WaitByVisibility(driver.findElement(By.xpath("//a[contains(text(), 'merrymoonm')]")));
		driver.findElement(By.xpath("//a[contains(text(), 'merrymoonm')]")).click();
		wait.pause();
		driver .navigate().to("https://www.blogger.com/about/?bpli=1");
		driver .navigate().back();
		wait.pause();
		driver.navigate().forward();
		wait.pause();
		//Assert.assertTrue(false);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.blogger.com/about/?bpli=1");
		
		
	}

}
