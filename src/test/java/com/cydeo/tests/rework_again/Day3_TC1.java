package com.cydeo.tests.rework_again;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_TC1 {
    public static void main(String[] args) {

        /*
        Requirements:

            1. Open chrome browser
            2. Go to https://login1.nextbasecrm.com
            3. Enter incorrect username : "incorrect"
            4. Enter incorrect password: "incorrect"
            5. Click login button
            6. Verify error message text is as expected:
                -> Expected: Incorrect login or password

            PS: Inspect and decide which locator you should be using to locate web elements.
          */


        //1. Open chrome browser

        WebDriver driver = WebDriverFactory.getDriver("firefox");

        driver.manage().window().maximize();

        //2. Go to https://login1.nextbasecrm.com
        driver.navigate().to("https://login1.nextbasecrm.com");



        //3. Enter incorrect username : "incorrect"
       WebElement userInputName = driver.findElement(By.name("USER_LOGIN"));
       userInputName.sendKeys("incorrect");


        //4. Enter incorrect password: "incorrect"
        WebElement userInputPassword = driver.findElement(By.name("USER_PASSWORD"));
        userInputPassword.sendKeys("incorrect");


       //5. Click login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();



        /* - Verify error message text is as expected:
                -> Expected: Incorrect login or password -*/

        //Incorrect login or password
        String expectedMsg ="Incorrect login or password";
        String actualMsg = driver.findElement(By.className("errortext")).getText();

        if (actualMsg.equals(expectedMsg)){
            System.out.println("Verification PASSED!");
        }else {
            System.out.println("Verification FAILED!");
        }



//        driver.quit();




    }
}
