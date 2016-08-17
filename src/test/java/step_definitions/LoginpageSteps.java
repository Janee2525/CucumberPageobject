package Step_definitions;

import Pages.Loginpage;
import cucumber.api.java.en.When;

public class LoginpageSteps  extends DriverFactory{
	

	@When("^enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
	       new Loginpage(driver).enter_valid_username_and_password();

	}

	@When("^click sign in button$")
	public void click_sign_in_button() throws Throwable {
	       new Loginpage(driver).click_sign_in_button();

	}


}
