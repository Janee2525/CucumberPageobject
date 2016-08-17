package Step_definitions;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory  {

	  String  Url="http://107.170.213.234/catalog/";
	  
	@Given("^User is on Catalog homepage$")
	public void user_is_on_Catalog_homepage() throws Throwable {
		 this.getDriver();
        driver.get(Url);

	}

}
