package javaexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

abstract class POM implements StartPage {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://wmsqa.sekoww.com");

        LoginPage.txtbx_UserName(driver).sendKeys("helpdesk@sekologistics.com");

        LoginPage.txtbx_Password(driver).sendKeys("sekoHD1");

        LoginPage.btn_Login(driver).click();

        System.out.println("Succesfully Login");

        HomePage.lnk_LogOut(driver).click();

        driver.quit();
    }
}


