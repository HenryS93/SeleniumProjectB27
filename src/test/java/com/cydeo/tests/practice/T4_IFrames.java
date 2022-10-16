package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T4_IFrames {
    /*
    TC #4: Iframe practice
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
     */

    WebDriver driver;

@BeforeMethod
    public void setUp(){

    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}

@Test
    public void iFrameTest(){

    driver.navigate().to("https://practice.cydeo.com/iframe");
    WebElement iframe = driver.findElement(By.xpath("//iframe"));

    driver.switchTo().frame(iframe);
    WebElement PTagMsg = driver.findElement(By.xpath("//p"));

    String actualMsg = PTagMsg.getText();
    String expectedMsg = "Your content goes here.";

    Assert.assertEquals(actualMsg, expectedMsg , "NOT matching!");

    driver.switchTo().defaultContent();

    WebElement actualHeader = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
    String actualHeaderMsg = actualHeader.getText();
    String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

    Assert.assertEquals(actualHeaderMsg,expectedHeader);
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
    public void window_practice(){

        driver.navigate().to("https://practice.cydeo.com/windows");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle, expectedTitle, "Check code FAILED!");

        WebElement clickHereLink = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereLink.click();


        Set<String> allWindows = driver.getWindowHandles();

        for (String eachWindow : allWindows){
            driver.switchTo().window(eachWindow);
        }

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "New Window";

        Assert.assertEquals(actualTitle1, expectedTitle1);

    }



}
