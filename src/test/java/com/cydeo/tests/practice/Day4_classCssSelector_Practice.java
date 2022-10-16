package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4_classCssSelector_Practice {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.navigate().to("https://practice.cydeo.com/forgot_password");


//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)


        //Finding Home Link with CssSelector:
        WebElement cssSelHomeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
//        System.out.println(cssSelHomeLink);
//       cssSelHomeLink.click();
        System.out.println("cssSelHomeLink = " + cssSelHomeLink.isDisplayed());




        //b. “Forgot password” header using CssSelector:

        WebElement cssForgotPassHead = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println("cssForgotPassHead = " + cssForgotPassHead.isDisplayed());
        System.out.println("cssForgotPassHead = " + cssForgotPassHead.isDisplayed());

////        System.out.println(cssForgotPassHeadText); -> working

//        String cssForgotPassHeadText = cssForgotPassHead.getText();
//

//        String expectedForgotPassHeader = "Forgot password";

//        if (cssForgotPassHeadText.equals(expectedForgotPassHeader)){
//            System.out.println("Forgot Password Header verification PASSED!");
//        }else {
//            System.out.println("Forgot Password Header verification FAILED!");
//        }



        //c. “E-mail” text

//        //b. “E-mail” header using CssSelector:
        WebElement cssEmailHeader = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("cssEmailHeader = " + cssEmailHeader.isDisplayed());
////        System.out.println(cssEmailHeaderText); -> Working
//        String cssEmailHeaderText = cssEmailHeader.getText();
//        String expectedCssEmailHeader = "E-mail";

//        if (expectedCssEmailHeader.equals(cssEmailHeaderText)){
//            System.out.println("Email Header Verification PASSED!");
//        }else {
//            System.out.println("Email Header Verification FAILED!");
//        }



        //d. E-mail input box Using CssSelector:
        WebElement cssEmailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("cssEmailInputBox = " + cssEmailInputBox.isDisplayed());




        //e. “Retrieve password” button Using cssSelector:

       WebElement cssRetrivePass = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        System.out.println("cssRetrivePass = " + cssRetrivePass.isDisplayed());
//       cssRetrivePass.click();





        //f. “Powered by Cydeo text Using cssSelector:
        WebElement cssPoweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        String cssPoweredByCydeoText = cssPoweredByCydeo.getText();
//        System.out.println(cssPoweredByCydeoText); -> Working




//    driver.quit();
    }
}
