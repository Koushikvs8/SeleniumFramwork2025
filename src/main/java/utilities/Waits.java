package utilities;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	static WebDriver driver;
	public Waits(WebDriver driver)
	{
		this.driver=driver;
	}
	
  public static final int TIMEOUT_SECONDS =1;
  public static final int WAIT_TIMEOUT_SECONDS =10;
	
	
 public static void pause()
 {
	 try {
		Thread.sleep(1000*TIMEOUT_SECONDS );
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 
 public static WebElement WaitByVisibility(WebElement element)
 {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS));
	WebElement waitedElement=wait.until(ExpectedConditions.visibilityOf(element));
	return waitedElement;
 }
 
 public static List<WebElement> waitForVisibilityOfAllElements(List<WebElement> elements) 
 {
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS));
     return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
 }

 public static void ScrollToView(WebElement elements) 
 {
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView(true)", elements);
     	 
 }
 public static void ScrollToHalfCreen() 
 {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");
     	 
 }
 public static void scrollElementToMiddle( WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(
	        "const viewHeight = Math.max(document.documentElement.clientHeight, window.innerHeight);" +
	        "const elementTop = arguments[0].getBoundingClientRect().top;" +
	        "window.scrollBy(0, elementTop - (viewHeight/2));", 
	        element
	    );
	}


}
