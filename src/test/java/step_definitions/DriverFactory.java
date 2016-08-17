package Step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	          
	 protected static WebDriver driver;
	
	 public void getDriver(){
	       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
          driver = new ChromeDriver();
          
}
}