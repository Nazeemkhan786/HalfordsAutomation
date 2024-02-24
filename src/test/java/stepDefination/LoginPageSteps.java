package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
	   
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   
	}

	@Then("Validate user logged in successfully")
	public void validate_user_logged_in_successfully() {
	  
	}

	@Then("Validate login error message")
	public void validate_login_error_message() {
	}

}
