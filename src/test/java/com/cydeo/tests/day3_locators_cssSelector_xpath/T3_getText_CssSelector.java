package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T3_getText_CssSelector {
    public static void main(String[] args) {
        /*
        1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
         */



        // 1- Open a chrome browser
        WebDriver driver  = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //  2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com/");




//        //Locate with Using cssSelector by type attribute:
//        WebElement LogInBtn = driver.findElement(By.cssSelector("input[value='login-btn']"));


        //Locate with using cssSelector by type attribute:
//        WebElement LogInBtn = driver.findElement(By.cssSelector("input.login-btn"));






        //3- Verify “Log in” button text is as expected:
        //Expected: Log In














    }
}
