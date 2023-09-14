package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilis.Driver;
import utilis.TestDataReader;

public class UserManagment_Steps {
	


	// vaild credential login test- Start
	
	
	@Given("As a user I am o the login page")
	public void as_a_user_i_am_o_the_login_page() {
	    Driver.getDriver().get(TestDataReader.getProperty("CraterUrl"));
	}

	@When("I enter vaild useremail and vaild password")
	public void i_enter_vaild_useremail_and_vaild_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
