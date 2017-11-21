package javafortestersproject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {
	WebDriver driver;
	public static final Logger log = Logger.getLogger(FirstTest.class.getName());


	@Test
	public void firstTestMethod() {
        PropertyConfigurator.configure("Log4j.properties1");
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/cssref/sel_first-of-type.asp");
		log.info("opened w3 school");
	}
}





