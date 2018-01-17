package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  FirefoxDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private AddressHelper addressHelper;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
    DesiredCapabilities d = new DesiredCapabilities();
    d.setCapability("marionette", false);
    wd = new FirefoxDriver(d);
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    addressHelper = new AddressHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper=new SessionHelper(wd);
    sessionHelper.login("iurii.merviak@yahoo.com", "3018640UmU");

  }


  public void stop() {
    wd.quit();
  }

  public AddressHelper getAddressHelper() {
    return addressHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
