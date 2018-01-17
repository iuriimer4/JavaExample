package tests;

import org.testng.annotations.Test;

public class DeleteAddressTests extends TestBase {


  @Test
  public void DeleteAddressTests() {
    app.getNavigationHelper().goToMyAddressesPage();
    app.getAddressHelper().deleteAddress();
  }


}
