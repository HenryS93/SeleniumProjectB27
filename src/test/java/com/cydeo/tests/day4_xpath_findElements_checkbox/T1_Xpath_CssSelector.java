package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Xpath_CssSelector {
    /*

XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible



     */

    public static void main(String[] args) {
        //1. Open Chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    //2. Go to https://practice.cydeo.com/forgot_password
    driver.navigate().to("https://practice.cydeo.com/forgot_password");




//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)


        //Finding Home Link with CssSelector:
//        WebElement cssSelHomeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
//        System.out.println(cssSelHomeLink);
//       cssSelHomeLink.click();

        //Finding Home Link with Relative Xpath:
        WebElement xPathHomeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));


        //b. “Forgot password” header using CssSelector:

//        WebElement cssForgotPassHead = driver.findElement(By.cssSelector("div[class='example']>h2"));
//        String cssForgotPassHeadText = cssForgotPassHead.getText();
////        System.out.println(cssForgotPassHeadText); -> working

        //b. “Forgot password” header using Relative Xpath:
       WebElement xPathForgotPassHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
       String xPathForgotPassHeadText = xPathForgotPassHeader.getText();
//        System.out.println(xPathForgotPassHeadText); -> working


        //c. “E-mail” text

//        //b. “E-mail” header using CssSelector:
//        WebElement cssEmailHeader = driver.findElement(By.cssSelector("label[for='email']"));
//        String cssEmailHeaderText = cssEmailHeader.getText();
////        System.out.println(cssEmailHeaderText); -> Working




//b. “E-mail” header using Xpath:

       WebElement xPathEmailHeader = driver.findElement(By.xpath("//label[@for='email']"));
       String xPathHeaderText = xPathEmailHeader.getText();
//        System.out.println(xPathHeaderText); -> Working


        //d. E-mail input box Using CssSelector:
//        WebElement cssEmailInputBox = driver.findElement(By.cssSelector("input[type='text']"));



        //d. E-mail input box Using Xpath:
       WebElement xPathEmailInputBox = driver.findElement(By.xpath("//input[@type='text']"));
//        xPathEmailInputBox.sendKeys("Hello");



        //e. “Retrieve password” button Using cssSelector:

//       WebElement cssRetrivePass = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
//       cssRetrivePass.click();


        //e. “Retrieve password” button Using xPath:
        WebElement xPathRetrivePassButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));


        //f. “Powered by Cydeo text Using cssSelector:
//        WebElement cssPoweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
//        String cssPoweredByCydeoText = cssPoweredByCydeo.getText();
//        System.out.println(cssPoweredByCydeoText); -> Working


        //f. “Powered by Cydeo text Using Relative XPath:
        WebElement xPathPoweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        String xPathPoweredByCydeoText =xPathPoweredByCydeo.getText();
//        System.out.println(xPathPoweredByCydeoText); -> working








//    driver.quit();
    }
}
