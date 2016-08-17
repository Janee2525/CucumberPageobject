package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Step_definitions.DriverFactory;

public class Loginpage {
	
    private WebDriver driver;
	
	@FindBy(how=How.NAME, using="email_address")
	private WebElement EMAIL_ADDRESS;
	
	@FindBy(how=How.NAME, using="password")
	private WebElement PASSWORD;
	
	@FindBy(how=How.ID, using="tdb5")
	private WebElement SIGNIN_BUTT;
	
	public Loginpage(WebDriver driver){
		    this.driver = driver;
		    PageFactory.initElements(driver, this);
	}
   
	public void enter_valid_username_and_password() throws Throwable {
		  EMAIL_ADDRESS.sendKeys("jackma@test.com");
          PASSWORD.sendKeys("test123");
        
    }
	
	public void click_sign_in_button() throws Throwable {
		  SIGNIN_BUTT.click();

	}
}