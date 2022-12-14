package com.cydeo.tests.day3_locators_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {
        /*
        1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password

         */

        // 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //  2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com/");



        // 3- Enter incorrect username: “incorrect”
        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect"); -> is correct way to use, but we need this code to be reusable

        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN")); // to make this code reusable, we must store it in a WebElement variable
        inputUserName.sendKeys("incorrect");



        // 4.Enter incorrect password: “incorrect”

        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");




        //5- Click to login button.
        driver.findElement(By.className("login-btn")).click();


        //6- Verify error message text is as expected:
            WebElement LoginErrorMsg = driver.findElement(By.className("errortext"));

            String expectedErrorMessage = "Incorrect login or password";
            String actualErrorMessage = LoginErrorMsg.getText();



            if (actualErrorMessage.equals(expectedErrorMessage)){
                System.out.println("Error verification message PASSED!");
            }else {
                System.out.println("Error verification message FAILED!");
            }


            driver.quit();
















    }
}
