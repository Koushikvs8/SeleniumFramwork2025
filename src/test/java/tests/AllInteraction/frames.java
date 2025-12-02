package tests.AllInteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames  {

	public static void main(String[] args) throws InterruptedException
	{  WebDriver driver= new ChromeDriver();
	  driver.get("https://practice.expandtesting.com/iframe");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  Thread.sleep(3000);
	  driver.get("https://practice.expandtesting.com/iframe");
	     driver.switchTo().frame("mce_0_ifr");
	     WebElement ddd= driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));
	     ddd.clear();
	   ddd.sendKeys("koushik you can do it");
	   driver.switchTo().defaultContent();

	  driver.findElement(By.id("iframe-youtube"));
	  Thread.sleep(3000);
	  driver.switchTo().frame(driver.findElement(By.id("iframe-youtube")));
		driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
	}

}
