package tests.AllInteraction;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class FileUpload extends BaseTest{
	@Test
public static void fileUplaod()
{
	Waits wait= new Waits(driver);
	wait.WaitByVisibility(driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")));
	wait.ScrollToView(driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")));
	driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
	boolean status =wait.WaitByVisibility(driver.findElement(By.xpath("//p[@id='singleFileStatus']"))).isDisplayed();
	if(status)
	{
		wait.WaitByVisibility(driver.findElement(By.xpath("(//input[@id='singleFileInput'])[1]"))).sendKeys("C:\\KoushikEclipsWorkspace\\selnium-automation\\src\\test\\resources\\ScreenShots\\windowhandler_1764575623347.png");
		driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
		wait.pause();
		wait.pause();
	}
	else
	{
		System.out.println("the meaasge suggesting to upload file is not displayed");
	}
	Assert.assertTrue(status);
	
	String[] files= { "C:\\KoushikEclipsWorkspace\\selnium-automation\\src\\test\\resources\\ScreenShots\\windowhandler_1764575623347.png",
	        "C:\\KoushikEclipsWorkspace\\selnium-automation\\src\\test\\resources\\ScreenShots\\windowhandler_1764575623347.png",
	        };
	
	for(String file:files)
	{
	
	wait.WaitByVisibility(driver.findElement(By.xpath("//input[@id='multipleFilesInput']"))).sendKeys(file);
	wait.pause();
	
	}

}

}
