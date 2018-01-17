package tests;

import org.testng.annotations.Test;
import model.AddressData;


public class AddAddressTests extends TestBase {

  @Test
  public void testAddAddress() {
    app.getNavigationHelper().goToMyAddressesPage();
    app.getAddressHelper().initNewAddress();
    app.getAddressHelper().fillAddressForm(new AddressData("Yurii", "Merviak", "300 N chester ave", "Chicago", "60656", "7089165656", "My address0"));
    app.getAddressHelper().submitNewAddress();
  }

}
