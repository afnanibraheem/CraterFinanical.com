package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Driver;

public class CraterLoginPage {

	public CraterLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy(xpath="//div[text()='Email ']")
	public WebElement login_page_email_label;
	
	@FindBy(name="email")
	public WebElement emailField;
	
	@FindBy (xpath ="//div[text()='Password ']")
	public WebElement password_label;
	
	@FindBy(name="password")
	public WebElement PasswordField;
	
	@FindBy(linkText="Forgot Password?")
	public WebElement forgotPasswordLink;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement Crater_login_BTN;
	
	@FindBy(xpath="//p[contains(text(),'Copyright @')]")
	public WebElement copyright_Text;
	
	@FindBy(xpath="//h1[contains(text(),'Simple Invoicing')]")
	public WebElement Page_Invoicing_Text;
	
	@FindBy(linkText="//p[contains(text(),'Crater helps you ')]")
	public WebElement Crater_Text_Track_Expenses;
	
	// how to have multiple elements as a page objects
	@FindBy(xpath="//span[text()='Field is required']")
	public List <WebElement> login_page_fieldRequired_Messages;
	
	@FindBy(xpath="//p[text()='These credentials do not match our records.']")
	public WebElement login_page_invaildlogin_message;
	
	
	
}
