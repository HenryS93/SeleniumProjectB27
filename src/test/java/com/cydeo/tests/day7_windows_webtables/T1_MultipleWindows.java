package com.cydeo.tests.day7_windows_webtables;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {

    WebDriver driver;

    @BeforeMethod
   public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /*
    Requirements:
    3- Assert: Title is "Windows"
    4- Click to "Click Here" Link
    5- Click to "CYDEO" Link
    6- switch to cydeo page
    7- Assert: Title is "Cydeo"

     */

    @Test
    public void multipleWindowsTest(){
    driver.navigate().to("https://practice.cydeo.com/windows");

    WebElement clickHereHyperLink = driver.findElement(By.xpath("//a[.='Click Here']"));
    clickHereHyperLink.click();

    WebElement cydeoHyperLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
    cydeoHyperLink.click();


        Set<String> allWindows = driver.getWindowHandles();


    for (String eachWindow : allWindows){
        driver.switchTo().window(eachWindow);
        if (driver.getTitle().equals("Cydeo")){
            break;
        }

    }







    }

}
