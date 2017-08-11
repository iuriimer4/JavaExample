package javaexample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  {
    private static WebElement element ;

    public static WebElement lnk_Home(WebDriver driver) {
       element = driver.findElement(By.id("ctl00_ucHeader_menun0"));
       return element;
    }
    public static WebElement lnk_LogOut(WebDriver driver) {
        element = driver.findElement(By.className("ctl00_ucHeader_menu_1"));
        return element;
    }

}
