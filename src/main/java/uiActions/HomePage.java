package uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import testBase.TestBase;

import java.util.logging.Logger;

public class HomePage extends TestBase {
    public static final Logger log = Logger.getLogger(HomePage.class.getName());

    WebDriver driver;

    @FindBy(id = "UserName")
    WebElement loginUserName;

    @FindBy(id = "Password")
    WebElement loginPassword;

    @FindBy(xpath = "//input[@class = 'button order nice radius']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class = 'LoginSpacer']/div")
    WebElement invalidLogin;

    @FindBy(xpath = "a[href*='/Home/Logoff']")
    WebElement signOut;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        //testBase = new testBase();
        PageFactory.initElements(driver, this);
    }

    public void loginToApplication(String userName, String password) {
        loginUserName.sendKeys(userName);
        log("Entered Username:-" + userName + "and object is: " + loginUserName.toString());
        loginPassword.sendKeys(password);
        log("Entered password :-" + password + "and password is: " + password.toString());
        loginButton.click();
        log("Clicked on login button:-" + loginButton.toString());
    }

    public String getInvalidLoginTest() {
        log("error message is:- " + invalidLogin.getText());
        return invalidLogin.getText();
    }

    public boolean verifySignOutDisplay() {
        try {
            signOut.isDisplayed();
            log("logout is displayed and object is :-" + signOut.toString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void log(String data) {
        log.info(data);
        Reporter.log(data);
    }
}
