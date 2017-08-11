package javaexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement element ;

    public static WebElement txtbx_UserName(WebDriver driver) {
        element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_aspLogin_UserName"));
        return element;
    }
    public static WebElement txtbx_Password (WebDriver driver) {
       element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_aspLogin_Password"));
       return element;
    }
    public static WebElement btn_Login(WebDriver driver) {
        element =  driver.findElement(By.id("ctl00_ContentPlaceHolder1_aspLogin_LoginButton"));
        return element;
    }

}