package tests.AllInteraction;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import utilities.Waits;

public class DatePicking extends BaseTest {
	
	@Test
	public static void testSelectDateDuringBooking()
	{
		//from div[class='inputAndSwapWrapper___e7dc96'] div[class='labelCityWrapper___fd5744']
		////div[contains(text() ,'To')]
		//div[@aria-label='Search suggestions list']//div[@role='option']
		driver.navigate().to("https://www.redbus.in/");
		Waits wait=new Waits(driver);
	    WebElement fromBtn=driver.findElement(By.cssSelector("div[class='inputAndSwapWrapper___e7dc96'] div[class='labelCityWrapper___fd5744']"));
		Waits.WaitByVisibility(fromBtn);
		Waits.WaitByVisibility(fromBtn).click();
		Waits.pause();
		List<WebElement> autoSuggestionsFrom=driver.findElements(By.xpath("//div[@aria-label='Search suggestions list']//div[@role='option']"));
		Waits.waitForVisibilityOfAllElements(autoSuggestionsFrom);
		for(int i=0; i<autoSuggestionsFrom.size(); i++) {
			if(autoSuggestionsFrom.get(i).getText().equals("Delhi"))
			{
				autoSuggestionsFrom.get(i).click();
				break;
			}
		}
		Waits.pause();
		List<WebElement> autoSuggestionsTo=driver.findElements(By.xpath("//div[@aria-label='Search suggestions list']//div[@role='option']"));
		Waits.waitForVisibilityOfAllElements(autoSuggestionsTo);
		for(int i=0; i<autoSuggestionsTo.size(); i++) {
			if(autoSuggestionsTo.get(i).getText().equals("Manali"))
			{
				autoSuggestionsTo.get(i).click();
				break;
			}
		}
		Waits.pause();
		Waits.pause();
		
		driver.findElement(By.xpath("//div[@class='dojWrapper___1f3d15']//span[@class='doj___e69938']")).click();
		Waits.pause();

		// Full month → number map
		Map<String, Integer> month = new HashMap<>();
		month.put("January",   1);
		month.put("February",  2);
		month.put("March",     3);
		month.put("April",     4);
		month.put("May",       5);
		month.put("June",      6);
		month.put("July",      7);
		month.put("August",    8);
		month.put("September", 9);
		month.put("October",   10);
		month.put("November",  11);
		month.put("December",  12);

		// ---- INPUT DATE ----
		String givenDate = "25 August 2029";

		String[] parts = givenDate.split(" ");
		int day   = Integer.parseInt(parts[0]);
		String givenMonthName = parts[1];
		int givenYear = Integer.parseInt(parts[2]);

		int targetMonth = month.get(givenMonthName);

		boolean flag = true;

		By nextBtn = By.xpath("//i[contains(@aria-label, 'Next month')]");
		By prevBtn = By.xpath("//i[contains(@aria-label, 'Previous month')]");

		while(flag)
		{
		    WebElement monthYearElement = driver.findElement(By.xpath("//p[@class='monthYear___2b924f']"));
		    String[] my = monthYearElement.getText().split(" ");

		    String currentMonthName = my[0];
		    int currentMonth = month.get(currentMonthName);
		    int currentYear = Integer.parseInt(my[1]);

		    // ✔ If month & year match → select day
		    if(currentMonth == targetMonth && currentYear == givenYear)
		    {
		        System.out.println("Month & year matched!");
		        
		        WebElement givenday = driver.findElement(
		            By.xpath("//ul[@class='datesWrap___add8bb']//span[normalize-space()='"+day+"']"));
		        givenday.click();
		        
		        flag = false;
		        break;
		    }

		    // ✔ Move forward if target is in future
		    if(givenYear > currentYear ||
		       (givenYear == currentYear && targetMonth > currentMonth))
		    {
		        driver.findElement(nextBtn).click();
		    }
		    else
		    {
		        driver.findElement(prevBtn).click();
		    }

		    Waits.pause(); // small wait for calendar update
		}

			
			
		}
		
		
		
		
	}
	//div[@class='dojWrapper___1f3d15']//span[@class='doj___e69938']
	//02 Dec, 2025
	
	
	


