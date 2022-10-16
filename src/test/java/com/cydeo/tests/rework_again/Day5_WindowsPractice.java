package com.cydeo.tests.rework_again;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5_WindowsPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    /*
    Requirements:
    1- create a new class called: T5_WindowsPractice
    2- Create a new test and make setups
    3- Go to :  https://practice.cydeo.com/windows
    4- assert: title is "Windows"
    5- click to "Click Here" link
    6- Switch to new Window
    7- Assert: title is "New Window"
     */

    @Test
    public void windowsPractice(){

        driver.navigate().to("https://practice.cydeo.com/windows");

        String actualWindowTitle = driver.getTitle();
        String expectedWindowTitle = "Windows";
        Assert.assertEquals(actualWindowTitle, expectedWindowTitle, "Title Verification FAILED!, Please check your CODE");


        WebElement windowHyperLink = driver.findElement(By.xpath("//a[.='Click Here']"));
        windowHyperLink.click();



            String actualSecondWindowTitle = "";

        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
//            System.out.println("Each Window: " + eachWindow);
//            System.out.println("Title: " + driver.getTitle());
            actualSecondWindowTitle = driver.getTitle();

        }

        String expectedSecondWindowTitle = "New Window";
        Assert.assertEquals(actualSecondWindowTitle, expectedSecondWindowTitle, "Actual First window: " + actualSecondWindowTitle + " Second Window Expected: " + expectedSecondWindowTitle  );


    }










}
