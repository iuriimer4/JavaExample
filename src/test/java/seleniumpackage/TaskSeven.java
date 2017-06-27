package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.*;

public class TaskSeven {
	private WebDriver driver;
	private WebDriverWait wait;

	private boolean isElementPresent(By locator) {
		try {
			driver.findElement(locator);
			return (true);
		} catch (NoSuchElementException ex) {
			return false;
		}
	}

	@Before
	public void start() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);

	}

	@After
	public void stop() {
		driver.quit();
		driver = null;

	}

	@Test
	public void taskSeven() {
		driver.get("http://localhost/litecart/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		wait = new WebDriverWait(driver, 10);

		List<WebElement> mainmenu = driver.findElements(By.id("box-apps-menu li"));
		System.out.println("Total numbers of elements " + mainmenu.size());
		WebElement b;
		for (int i = 1; i <= mainmenu.size(); i++) {

			b = driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-of-type(" + i + ")"));
			b.click();
			assertTrue(isElementPresent(By.tagName("h1")));


			// submenu
			   if (isElementPresent(By.xpath("//ul[@class = 'docs']")));
			List<WebElement> submenu = driver.findElements(By.xpath("\\ul[@class = 'docs']/li"));
			WebElement d;
			   for (int c = 1; c <= submenu.size(); c++) {
            d = driver.findElement(By.cssSelector("#ul.docs > li: nth-of-type("+ c +")"));
            d.click();
			assertTrue(isElementPresent(By.tagName("h1")));

			if (driver.findElement(By.tagName("h1")) != null) {
				System.out.println("Element h1  is Present");
			} else {
				System.out.println("Element h1 is Absent");
			}

		}
	}

}
}