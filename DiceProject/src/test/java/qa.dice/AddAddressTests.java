package qa.dice;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class AddAddressTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability("marionette", false);
        wd = new FirefoxDriver(d);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        login("iurii.merviak@yahoo.com", "3018640UmU");
    }

    private void login(String emailAddress, String password) {
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys(emailAddress);
        wd.findElement(By.id("passwd")).click();
        wd.findElement(By.id("passwd")).clear();
        wd.findElement(By.id("passwd")).sendKeys(password);
        wd.findElement(By.id("SubmitLogin")).click();
    }

    @Test
    public void testAddAddress() {
        goToMyAddressesPage();
        initNewAddress();
        fillAddressForm(new AddressData("Yurii", "Merviak", "300 N chester ave", "Chicago", "60656", "7089165656", "My address0"));
        submitNewAddress();
    }

    private void submitNewAddress() {
        wd.findElement(By.id("submitAddress")).click();
    }

    private void fillAddressForm(AddressData addressData) {
        wd.findElement(By.id("firstname")).click();
        wd.findElement(By.id("firstname")).clear();
        wd.findElement(By.id("firstname")).sendKeys(addressData.getFirstName());
        wd.findElement(By.id("lastname")).click();
        wd.findElement(By.id("lastname")).clear();
        wd.findElement(By.id("lastname")).sendKeys(addressData.getLastName());
        wd.findElement(By.id("address1")).click();
        wd.findElement(By.id("address1")).clear();
        wd.findElement(By.id("address1")).sendKeys(addressData.getAddress());
        wd.findElement(By.id("city")).click();
        wd.findElement(By.id("city")).clear();
        wd.findElement(By.id("city")).sendKeys(addressData.getCity());
        if (!wd.findElement(By.xpath("//select[@id='id_state']//option[1]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='id_state']//option[1]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='id_state']//option[15]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='id_state']//option[15]")).click();
        }
        wd.findElement(By.id("postcode")).click();
        wd.findElement(By.id("postcode")).clear();
        wd.findElement(By.id("postcode")).sendKeys(addressData.getPostCode());
        wd.findElement(By.id("phone_mobile")).sendKeys(addressData.getPhoneMobile());
        wd.findElement(By.id("alias")).sendKeys(addressData.getAddressTitle());
    }

    private void initNewAddress() {
        wd.findElement(By.xpath(".//div[@id='center_column']/div[2]/a/span")).click();
    }

    private void goToMyAddressesPage() {
        wd.findElement(By.linkText("MY ADDRESSES")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
