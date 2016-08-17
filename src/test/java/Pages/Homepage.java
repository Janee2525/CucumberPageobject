package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Step_definitions.DriverFactory;
import junit.framework.Assert;



public class Homepage {
	
	private WebDriver driver;
	           
@FindBy(how=How.XPATH, using =".//*[@id='bodyContent']/div/div[1]/a[1]/u")
private WebElement LOGYOURSELFIN_LINK;
	           
	           
	   public Homepage(WebDriver driver){
		            this.driver = driver;
		            PageFactory.initElements(driver, this);
	   }
	   
		public void click_on_log_yourself_in_link() throws Throwable {
			LOGYOURSELFIN_LINK.click();

		}
		
		public void message_is_displayed(String arg1) throws Throwable {
		        String expectedText ="Welcome to iBusiness";
		        String actualText= driver.findElement(By.xpath("//*[contains(text(),'"+ expectedText.trim() +"')]")).getText();
		        Assert.assertEquals(expectedText, actualText);
		        driver.quit();

		}

}
