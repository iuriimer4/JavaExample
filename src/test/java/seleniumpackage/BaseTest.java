package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	
    public boolean isElementPresent(By locator) {
		try  {
			driver.findElement(locator);
			return(true);
			} catch(NoSuchElementException ex) {
			return false;
			}
	}
	public boolean areElementsPresent(By locator) {
		return driver.findElements(locator).size() > 0;
		
	}
	
	
	
	@Before
	public void start() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);
		
	    
			//IE Browser
			//driver = new InternetExplorerDriver();
			//File file = new File("D:\\SeleniumWorkSpace\\Automation\\iedriverserver.exe");
			//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			
			//Firefox Driver
			//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			//capabilities.setCapability("marionette", true);
			//driver = new FirefoxDriver();
	        
			//Chrome Driver
		    //driver = new ChromeDriver();
			
	}

		
		@After
		public void stop() {
			driver.quit();
			driver = null;

	}

}
