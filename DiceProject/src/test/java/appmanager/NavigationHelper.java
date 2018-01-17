package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{


  public NavigationHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void goToMyAddressesPage() {

    click(By.linkText("MY ADDRESSES"));
  }
}
