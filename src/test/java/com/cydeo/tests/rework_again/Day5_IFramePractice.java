package com.cydeo.tests.rework_again;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5_IFramePractice {
    /*
    Requirements:
    TC#4
    1- Create a new class Called: T4_Iframes
    2- create new test and make setups
    3- Go to https://practice.cydeo.com/iframe
    4- Assert: "Your content goes here." Text is Displayed
    5- Assert "An iFrame containing the TinyMCE WYSIWYG Editor"
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void iFrameTask(){

        driver.navigate().to("https://practice.cydeo.com/iframe");

        WebElement firstChild = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(firstChild);

        String actualTextMsg = driver.findElement(By.xpath("//p[.='Your content goes here.']")).getText();
        String expectedTextMsg = "Your content goes here.";

        Assert.assertEquals(actualTextMsg, expectedTextMsg, "Msg MisMatch! Check your CODE!");

        //switches from child HTML to Parent
        driver.switchTo().parentFrame();

        String actualHeader = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actualHeader, expectedHeader, "Msg MisMatch! Check your CODE!");
        

    }

}
