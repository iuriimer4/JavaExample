package appmanager;

import model.AddressData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddressHelper extends HelperBase {

  public AddressHelper(FirefoxDriver wd) {
    super(wd);

  }

  public void submitNewAddress() {
    click(By.id("submitAddress"));
  }

  public void fillAddressForm(AddressData addressData) {
    type(By.id("firstname"), addressData.getFirstName());
    type(By.id("lastname"), addressData.getLastName());
    type(By.id("address1"), addressData.getAddress());
    type(By.id("city"), addressData.getCity());

    if (!wd.findElement(By.xpath("//select[@id='id_state']//option[15]")).isSelected()) {
      click(By.xpath("//select[@id='id_state']//option[15]"));
    }
    type(By.id("postcode"), addressData.getPostCode());
    wd.findElement(By.id("phone_mobile")).sendKeys(addressData.getPhoneMobile());
    wd.findElement(By.id("alias")).sendKeys(addressData.getAddressTitle());
  }

  public void initNewAddress() {
    click(By.xpath(".//div[@id='center_column']/div[2]/a/span"));
  }

  public void deleteAddress() {
    click(By.xpath("//div[@id='center_column']/div[1]/div[1]/div[2]/ul/li[9]/a[2]/span"));
  }
}
