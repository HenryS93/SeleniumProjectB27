package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {
    WebDriver driver;



    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
//        driver.quit();

    }

    /*
    TC#4
    1. Create a new class called: T4_iFrames
    2. Create new test and make setUps
    3. Go to: https://practice.cydeo.com/iframe
    4. Assert: "Your content goes here." Text is displayed
    5. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor"
     */


    @Test
    public void iFrameTask(){
driver.navigate().to("https://practice.cydeo.com/iframe");

//Switch to iframe using frame with index
//driver.switchTo().frame(0);

        // locating with id
//    driver.switchTo().frame("mce_0_ifr");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


    WebElement textArea = driver.findElement(By.xpath("//p"));
    String actualText= textArea.getText();
    String expectedText = "Your content goes here.";

        Assert.assertEquals(actualText,expectedText, "CHECK CODE NOT MATCHING!!");


        driver.switchTo().defaultContent();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //
        String actualHeaderText = headerText.getText();
                                 // An iFrame containing the TinyMCE WYSIWYG Editor
        String expectedHeaderText = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actualHeaderText,expectedHeaderText, "NOT MATCHING, CHECK CODE!!");



    }











}
