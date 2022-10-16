package com.cydeo.tests.rework_again;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_TC2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Open a chrome browser
        2. Go to: https://login1.nextbasecrm.com
        3. verify "remember me" label text is as expected:
               -> Expected: Remember me on this computer
        4. verify "forgot password" link text is as expected:
               -> Expected: Forgot your password?
        5. verify "forgot password" href attribute's value contains expected:
                -> Expected: forgot_password=yes

                PS: Inspect and decide which locator you should be using to locate we  Elements
         */



        //  1. Open a chrome browser
       WebDriver driver = WebDriverFactory.getDriver("chrome");

       driver.manage().window().maximize();

        //        2. Go to: https://login1.nextbasecrm.com
       driver.navigate().to("https://login1.nextbasecrm.com");

        //3. verify "remember me" label text is as expected:
          //     -> Expected: Remember me on this computer

        String actualLabel = driver.findElement(By.tagName("label")).getText();
        String expectedLabel = "Remember me on this computer";

        if (actualLabel.equals(expectedLabel)){
            System.out.println("Remember me label verification PASSED!");
        }else {
            System.out.println("Remember me Label Verification FAILED!");
        }


        //4. verify "forgot password" link text is as expected:
        //               -> Expected: Forgot your password?


        WebElement forgotPass = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPass = "Forgot your password?";
        String actualForgotPass = forgotPass.getText();

        if (expectedForgotPass.equals(actualForgotPass)){
            System.out.println("Forgot password msg Verification PASSED!");
        }else {
            System.out.println("actual Forgot Pass Link: " + actualForgotPass );
            System.out.println("Expected: " + expectedForgotPass);
            System.out.println("Forgot password msg Verification FAILED!!");
        }


        //verify "forgot password" href attribute's value contains expected:
        //                -> Expected: forgot_password=yes



        String actualAttributeVal = forgotPass.getAttribute("href");
        String expectedAttributeVal = "forgot_password=yes";

        if (actualAttributeVal.contains(expectedAttributeVal)){
            System.out.println("Contains Attribute Value Verification PASSED!");
        }else {
            System.out.println("Actual: " + actualAttributeVal);
            System.out.println("Expected: " + expectedAttributeVal);
            System.out.println("Contains Attribute Value Verification FAILED!");
        }












    }
}
