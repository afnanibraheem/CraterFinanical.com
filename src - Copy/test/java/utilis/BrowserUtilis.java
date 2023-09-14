package utilis;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilis {
	
   WebDriverWait wait;
   Actions act;
   
   
   public void waitforElementToBeVisiable(WebElement element ) {
	   wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.visibilityOf(element));
	   
	   
   }
   
   
   public void waitForAllElementsToBeVisible(List<WebElement>element) {
	   
	   wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.visibilityOfAllElements(element));
   }
   
   
   public void sendKeysWithActionsClass(WebElement element,String input) {
	   act = new Actions(Driver.getDriver());
	   act.sendKeys(element,input).build().perform();
   }
   
}
