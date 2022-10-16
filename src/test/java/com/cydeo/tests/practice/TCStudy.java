package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TCStudy {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    /*
    TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
     */

    @Test
    public void windowHandlePrac(){

        driver.navigate().to("https://practice.cydeo.com/windows");

       String actualTitle = driver.getTitle();
       String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle,expectedTitle, "Actual Title : " + actualTitle + "ecpected Title: " + expectedTitle );


        WebElement clickHereHyperLink = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereHyperLink.click();

        for (String eachWindow : driver.getWindowHandles()){
            driver.switchTo().window(eachWindow);

        }
       String actualTitleSecondWindow = driver.getTitle();
        String expectedTitleSecondWindow = "New Window";

        Assert.assertEquals(actualTitleSecondWindow, expectedTitleSecondWindow, "Title NOT Matching!");

    }




}
