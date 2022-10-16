package com.cydeo.tests.rework_again;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5_TC1_InformationAlert {
    /*
    TC#1:
    1- Open browser
    2- Go to Website: http://practice.cydeo.com/javascript_alerts
    3- Click to "Click for JS Alert" button
    4- Click to OK button from the alert
    5- Verify "You successfully clicked an alert" text is displayed.
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

        WebElement JSIrmationButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JSIrmationButton.click();

        Alert okButton = driver.switchTo().alert();
        okButton.accept();

        String actualTextMsg = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedTextMsg = "You successfully clicked an alert";

        Assert.assertEquals(actualTextMsg, expectedTextMsg, "Msg MisMatch! Check your CODE!");

    }



    /*
    TC#2 Confirmation Alert Practice
    1- Open Browser
    2- Go to Website: http://practice.cydeo.com/javascript_alerts
    3- Click to "Click for JS Confirm" Button
    4- Click to OK button from the alert
    5- Verify "You clicked: Ok" text is displayed
     */

    @Test
public void confirmationAlert(){

        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");
        WebElement JSConfirmationButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        JSConfirmationButton.click();

        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.accept();

        String actualTextMsg = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedTextMsg = "You clicked: Ok";


    Assert.assertEquals(actualTextMsg, expectedTextMsg, "Msg MisMatch! Check your CODE!");

    }


    /*
    TC#3
    Requirements:
    1- Open Browser
    2- Go to Website: http://practice.cydeo.com/javascript_alerts
    3- Click to "Click for JS Prompt" button
    4- Send "hello" text to alert
    5- Verify "You entered: hello" text is displayed

     */

    @Test
    public void promptAlert(){
        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");

        WebElement clickPromptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickPromptButton.click();


        driver.switchTo().alert();
        Alert sendText = driver.switchTo().alert();
        sendText.sendKeys("hello");
        sendText.accept();

       String actualTextMsg = driver.findElement(By.xpath("//p[@id='result']")).getText();
       String expectedTextMsg = "You entered: hello";


       Assert.assertEquals(actualTextMsg, expectedTextMsg, "Msg MisMatch! Check your CODE!");

    }











}
