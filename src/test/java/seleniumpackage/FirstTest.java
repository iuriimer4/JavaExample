package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	WebDriver driver;

	public void methodSetUp() {
		driver = new FirefoxDriver();
	}

	public void methodSetup() {
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