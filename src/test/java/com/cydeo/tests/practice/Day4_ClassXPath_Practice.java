package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4_ClassXPath_Practice {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.navigate().to("https://practice.cydeo.com/forgot_password");


//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)



        //Finding Home Link with Relative Xpath:
        WebElement xPathHomeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));




        //b. “Forgot password” header using Relative Xpath:
        WebElement xPathForgotPassHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
        String xPathForgotPassHeadText = xPathForgotPassHeader.getText();
//        System.out.println(xPathForgotPassHeadText); -> working





//b. “E-mail” header using Xpath:

        WebElement xPathEmailHeader = driver.findElement(By.xpath("//label[@for='email']"));
        String xPathHeaderText = xPathEmailHeader.getText();
//        System.out.println(xPathHeaderText); -> Working





        //d. E-mail input box Using Xpath:
        WebElement xPathEmailInputBox = driver.findElement(By.xpath("//input[@type='text']"));
//        xPathEmailInputBox.sendKeys("Hello");




        //e. “Retrieve password” button Using xPath:
        WebElement xPathRetrivePassButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));





        //f. “Powered by Cydeo text Using Relative XPath:
        WebElement xPathPoweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        String xPathPoweredByCydeoText = xPathPoweredByCydeo.getText();
//        System.out.println(xPathPoweredByCydeoText); -> working


//    driver.quit();
    }
}
