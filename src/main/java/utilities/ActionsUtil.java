package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsUtil {
   public static WebDriver driver;
   
   public ActionsUtil(WebDriver driver)
   {
	   this.driver=driver;
   }
	
   public void ScrollToView(WebElement elements) 
   {
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", elements);
       	 
   }
	
}
