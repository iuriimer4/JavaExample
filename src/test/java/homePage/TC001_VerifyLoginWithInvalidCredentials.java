package homePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.TestBase;
import uiActions.HomePage;

import java.io.IOException;
import java.util.logging.Logger;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase {

    public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
    HomePage homePage;

    @BeforeClass
    public void setup() throws IOException {
        init();
    }

    @Test
    public void verifyLoginWithInvalidCredentials() {
        log.info("Starting verifyLoginWirhInvalidCredentials");
        homePage = new HomePage(driver);
        homePage.loginToApplication("qateam@sekologistics.com", "$3K0qa2016");
        Assert.assertEquals(homePage.getInvalidLoginTest(), "invalid Login ");
        log.info("Finish verifyLoginWithInvalidCredentials");
    }

   // @AfterClass
    //public void endTest() {
        //driver.close();
  //  }
}
