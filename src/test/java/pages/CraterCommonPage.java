package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Driver;

public class CraterCommonPage {
public CraterCommonPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	
	
}

  
  @FindBy(linkText=" Dashboard")
  public WebElement Dashboard_Text;

}
