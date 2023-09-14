package tests;


import java.time.Duration;

import pages.CraterLoginPage;
import utilis.BrowserUtilis;
import utilis.Driver;
import utilis.TestDataReader;

public class UserManagmentTest {
   public static void main(String[] args) {
	
	   InvaildEmailLoginTest();
	   invalidPasswordLoginTest();
}
	 static BrowserUtilis utilis;
	 static CraterLoginPage craterLoginPage1;
	
	
	
		 public static  void InvaildEmailLoginTest() {
			 utilis = new BrowserUtilis();
			 craterLoginPage1= new CraterLoginPage();
					 
			 

		// invalid  email login test
		// go to crater
        Driver.getDriver().get(TestDataReader.getProperty("CraterUrl"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
        utilis.waitforElementToBeVisiable(craterLoginPage1.login_page_email_label);
         
		// click on the login button without filling out the creditential fields.
        craterLoginPage1.Crater_login_BTN.click();
		// Then verify there are 2 required messages display.
       utilis.waitForAllElementsToBeVisible( craterLoginPage1.login_page_fieldRequired_Messages);
        if( craterLoginPage1.login_page_fieldRequired_Messages.size()==2){
        	System.out.println("There are two required fields messages  displpyed");
        }else {
        	System.out.println("There aren't  two required fields messages  displayed ");
        }
		// enter invaild email yummy@primetech.com and vaild  password primetech@school
       utilis.sendKeysWithActionsClass( craterLoginPage1.emailField,"yummy@primetech.com" );
         // vaild password
       utilis.sendKeysWithActionsClass(craterLoginPage1.PasswordField ,TestDataReader.getProperty("Craterpassword"));
      
		// click login button
        craterLoginPage1.Crater_login_BTN.click();
        
		// then verify that an error messages "Theses credentials dont match our
		// records."display.
        utilis.waitforElementToBeVisiable(craterLoginPage1.login_page_invaildlogin_message);
        
        if(craterLoginPage1.login_page_invaildlogin_message.isDisplayed()) {
        	System.out.println("Credential Error Message  is displayed ");
        }else {
        	System.out.println("Credential Error Message is not Diplayed");
        }
        
        }
      
		
		
		// invalid password login test
         public  static void invalidPasswordLoginTest() {
        	// go to crater
        	 Driver.getDriver().get(TestDataReader.getProperty("CraterUrl"));
        	 Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        	 Driver.getDriver().manage().window().maximize();
        	 utilis.waitforElementToBeVisiable(craterLoginPage1.login_page_email_label);
        	// click on the login button without filling out the creditential fields.
             craterLoginPage1.Crater_login_BTN.click();
        	// Then verify there are 2 required messages display.
        	 utilis.waitForAllElementsToBeVisible(craterLoginPage1.login_page_fieldRequired_Messages);
        	 if(craterLoginPage1.login_page_fieldRequired_Messages.size()==2) {
        		 System.out.println(" There are two required fields messages are displayed ");
        	 }else {
        		 System.out.println("There arent  two required fields messages are displayed");
        	 }
        	 
        	// enter  vaild email dummy@primetech.com and  invaild password primetech@school
        	 
        	 utilis.sendKeysWithActionsClass(craterLoginPage1.emailField,TestDataReader.getProperty("CraterEmail"));
        	 utilis.sendKeysWithActionsClass(craterLoginPage1.PasswordField, "primetech@schoo");
        	// click login button
        	 craterLoginPage1.Crater_login_BTN.click();
        	 
        	// then verify that an error messages "Theses credentials dont match our
     		// records."display.
        	 utilis.waitforElementToBeVisiable(craterLoginPage1.login_page_invaildlogin_message);
             
        	 if(craterLoginPage1.login_page_invaildlogin_message.isDisplayed()) {
        	 System.out.println("Credential Error Message  is Dispklayed");
        	 
        	 }else {
        		 System.out.println("Credential Error Message  isnt Displayed");
        	 }
        		 }
        	 }
        	 
         