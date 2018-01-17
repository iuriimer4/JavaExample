package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {


  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String emailAddress, String password) {
    type(By.id("email"), emailAddress);
    type(By.id("passwd"), password);
    click(By.id("SubmitLogin"));


  }

}
