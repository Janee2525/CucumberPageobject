package Step_definitions;

import Pages.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps extends DriverFactory {
	
	
	@Given("^click on log yourself in link$")
	public void click_on_log_yourself_in_link() throws Throwable {
	    new Homepage(driver).click_on_log_yourself_in_link();

	}
	

	@Then("^\"([^\"]*)\" message is displayed$")
	public void message_is_displayed(String arg1) throws Throwable {
          new Homepage(driver).message_is_displayed(arg1);

	}

}
