package com.cydeo.tests.rework_again;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_TC3 {
    public static void main(String[] args) {

        /*
        1. Open a chrome browser
        2. Go to : https://login1.nextbasecrm.com/
        3. verify "Log in" button text is as expected:
            -> Expected: Log In


            PS: Inspect and decide which locator you should be using to locate web elements.
            PS2: Pay attention to where to get the text of this button from

         */


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");


        //Locating by Value
//        WebElement LogInButton = driver.findElement(By.cssSelector("input[value='Log In']"));




        //locating by type attribute
//        WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));
//        logInButton.click();




//        WebElement logInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
//        logInButton.click();




        // //locating by onclick attribute -> to make it work we need  to replace the outside single quotes with double quotes

        WebElement logInButton = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');"));

        String expectedLogInBttn = "Log In";
        String actualLogInBttn = logInButton.getAttribute("Value");

        if (actualLogInBttn.equals(expectedLogInBttn)){
            System.out.println("Login button verification PASSED!");
        }else {
            System.out.println("Login button verification FAILED!");
        }










    }
}
