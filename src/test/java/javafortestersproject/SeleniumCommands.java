package javafortestersproject;

import org.apache.xpath.SourceTree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SeleniumCommands {
    public static void main(String[] args) {

        //Path to the driver exe.
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability("marionette", false);

        // Create a new instance of the FireFox driver
        WebDriver driver = new FirefoxDriver(d);

        //Wait for page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Storing the application URl in the String variable
        String url = "http://www.store.demoqa.com";

        //Launch TOOLSQA website
        driver.get(url);

        //Storing Title name in the String variable
        String title = driver.getTitle();
        String expectedTitle = "ONLINE STORE | Toolsqa Dummy Tes site";

        //Storing Title length in the Int variable
        int titleLength = driver.getTitle().length();

        //Printing Title & Title length in the console Window
        System.out.println("Title of the Page is: " + title);
        System.out.println("Length of the title is : " + titleLength);

        //title verification
        try {
            Assert.assertEquals(title, expectedTitle);
        } catch (Throwable t) {
            System.out.println("Actual title: " + title + " but Expected title: " + expectedTitle);

        }

    }
}


