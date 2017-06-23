package seleniumpackage;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task8 {
    private WebDriver driver;
    private WebDriverWait wait;
	
    @Test
	public void task8() {
			driver.get("http://localhost/litecart");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("login")).click();
			wait = new WebDriverWait(driver, 10);
			
			assertTrue(isElementPresent(By.xpath("//div[@class = 'sticker new']")));
}

}