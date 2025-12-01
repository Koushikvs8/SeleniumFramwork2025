package tests;
	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.DriverManeger;
import utilities.Waits;
import utilities.ActionsUtil;

	public class Locaters extends BaseTest {
		
		 @Test
			public void findElementBy()
			{   
			    Waits wait=new Waits(driver);
			    ActionsUtil action=new ActionsUtil(driver);
			    //By id
				driver.findElement(By.id("email")).sendKeys("koushik@gmail.com");
				Waits.pause();
				//By Tag name
				System.out.println(driver.findElement(By.tagName("body")).getSize());
				//By Linktext
				Waits.pause();
				Waits.pause();
				action.ScrollToView(driver.findElement(By.linkText("merrymoonmary")));
				System.out.println(driver.findElement(By.linkText("merrymoonmary")));
				
				//By Xpath
				List<WebElement> element=wait.waitForVisibilityOfAllElements(driver.findElements(By.xpath("//div[@class='form-check form-check-inline']/input[@type='checkbox']")));
				for(int i=0; i<element.size(); i++)
				{
					action.ScrollToView(element.get(i));
					if(i==0)
				{
					continue;
				}
					Waits.pause();
				element.get(i).click();
				}
				//Xpath parent to child elements vs CSS parent to child elements
				System.out.println(driver.findElements(By.xpath("//select[@id='colors']/option")).get(3).getText());
		
				//Xpath find element by text
				System.out.println(driver.findElement(By.xpath("//p[text()='Date Picker 1 (mm/dd/yyyy): ']")).getText().equals("Date Picker 1 (mm/dd/yyyy): ") );
		
			}
		    
		 
		 @Test
			public void SearchTheProduct()
			{    ActionsUtil actions=new ActionsUtil(driver);
			    Waits wait=new Waits(driver);
			   Actions action=new Actions(driver);//a[text()='Cameras & Accessories']
			   wait.pause();
			   action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
			   action.moveToElement(driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"))).build().perform();
			   action.moveToElement(driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"))).click().build().perform();
			   actions.ScrollToView(driver.findElements(By.xpath("//div[@class='QSCKDh dLgFEE']/div[@class='lvJbLV col-12-12'][2]//img")).get(1));
			  int size=Waits.waitForVisibilityOfAllElements(driver.findElements(By.xpath("//div[@class='QSCKDh dLgFEE']/div[@class='lvJbLV col-12-12'][2]//img"))).size();
			  System.out.println("the number of images are :" + size);
			  
			   
			}
		  
	 
		
	}

