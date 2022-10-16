package com.cydeo.tests.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWorkDay6 {
    /*
    TC #1: Information alert practice
    1. Open browser
    2. Go to website: http://practice.cydeo.com/javascript_alerts
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Verify “You successfully clicked an alert” text is displayed.
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @Test
    public void informationAlert(){

        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");

        WebElement informationButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationButton.click();


        Alert hitOk = driver.switchTo().alert();
        hitOk.accept();




    //5. Verify “You successfully clicked an alert” text is displayed.

        WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));
        String actualText = msg.getText();
        String expectedMsg = "You successfully clicked an alert";


        Assert.assertEquals(actualText, expectedMsg, "REVIEW CODE, DOES NOT MATCH!!!");






    }






}
