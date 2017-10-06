package testBase;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TestBase {
    public static final Logger log = Logger.getLogger(TestBase.class.getName());

    public WebDriver driver;

    // public EventFiringWebDriver driver;

    public Properties OR = new Properties();
    public static ExtentReports extent;
    public static ExtentTest test;
    public ITestResult result;

    public WebDriver getDriver() {
        return driver;
    }

    static {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        ExtentReports extend = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/com/test/automation/uiAutomation/report/test" + formater.format(calendar.getTime()) + ".html", false);
    }

    public void loadData() throws IOException {
        File file = new File(System.getProperty("user.dir") + "/src/main/java/com/test/automation/uiAutomation/config/config.properties");
        FileInputStream f = new FileInputStream(file);
        OR.load(f);
    }

    public void setDriver(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void init() throws IOException {
        loadData();
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        System.out.println(OR.getProperty("browser"));


    }

    public void selectBrowser(String browser) {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").contains("Window")) {
            if (browser.equals("chrome")) {
                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equals("forefox")) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
                DesiredCapabilities d = new DesiredCapabilities();
                d.setCapability("marionette", false);
                driver = new FirefoxDriver(d);
            }
        }
    }

    public void getUrl(String url) {
        log.info("navigating to: " + url);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void waitForElement(WebDriver driver, int timeOutInSeconds, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void getScreenShot(String name) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


    }
}
