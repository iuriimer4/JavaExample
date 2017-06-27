package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
	WebDriver driver;


	@Before
	public void methodSetUp() {
		driver = new FirefoxDriver();
	}


	@After
	public void methodTearDown() {
		driver.quit();
	}

	@Test
	public void firstTestMethod() {
		// Open Dice.com
		driver.get("http://www.dice.com");
		System.out.println("Dice Opened. Test is Passed!");

	}

	@Test
	public void secondTestMethod() {
		// Open Linkedin.com
		driver.get("http://www.linkedin.com");
		System.out.println("Linkedin Opened. Test is Passed!");

	}

}