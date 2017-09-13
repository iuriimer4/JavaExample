package seleniumpackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
	WebDriver driver;
	public static final Logger log = Logger.getLogger(FirstTest.class.getName());


	@Test
	public void firstTestMethod() {
        PropertyConfigurator.configure("Log4j.properties1");
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/cssref/sel_first-of-type.asp");
		log.info("opened w3 school");
	}
}





