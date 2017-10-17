package customListener;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;
import testBase.TestBase;


public class WebEventListener extends TestBase implements WebDriverEventListener
{

    public static final Logger log = Logger.getLogger(WebDriverEventListener.class.getName());

    public void beforeNavigateTo(String s, WebDriver webDriver) {
        //log("Before navigating to: '" + url + "'");
    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        //log("Navigated to:'" + url + "'");
    }

    public void beforeNavigateBack(WebDriver webDriver) {
        log("Navigating back to previous page");
    }

    public void afterNavigateBack(WebDriver webDriver) {
        log("Navigated back to previous page");
    }


    public void beforeNavigateForward(WebDriver webDriver) {
        log("Navigating forward to next page");

    }

    public void afterNavigateForward(WebDriver webDriver) {
        log("Navigated forward to next page");

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {
        // TODO Auto-generated method stub

    }

    public void afterNavigateRefresh(WebDriver webDriver) {
    // TODO Auto-generated method stub

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        log("Trying to find Element By : " + by.toString());
    }


    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        log("Found Element By : " + by.toString());
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
      log("Trying to click on: " + element.toString());
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        log("Clicked on: " + element.toString());
    }


    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        // TODO Auto-generated method stub

    }
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
      // TODO Auto-generated method stub

    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
        log("Value of the:" + element.toString()
                + " before any changes made");
    }

    public void afterChangeValueOf(WebElement element, WebDriver driver) {
        log("Element value changed to: " + element.toString());
    }

    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("Just before beforeScript " + driver);

    }

    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("Just after afterScript " + driver);

    }

    public void onException(Throwable error, WebDriver driver) {
        log("Exception occured: " + error);
        Reporter.log("Exception occured:" , false);
    }

    public void log(String data) {
        log.info(data);
        Reporter.log(data);
        test.log(LogStatus.INFO, data);
    }


}

