package seleniumpackage;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class FirstTest {
	WebDriver driver;


	@Test
	public void firstTestMethod() {
		// Open Dice.com
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", false);
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/cssref/sel_first-of-type.asp");
		System.out.println("Dice Opened. Test is Passed!");
	}
}