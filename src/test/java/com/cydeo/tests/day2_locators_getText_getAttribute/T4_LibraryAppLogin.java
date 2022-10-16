package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {
    public static void main(String[] args) {

        /*
        1. Open Chrome browser
2. Go to http://library2.cydeo.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed (edited)
Login - Library
You do not have permission to send messages in this channel.

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cydeo.com/login.html");

       WebElement userNameInput = driver.findElement(By.id("inputEmail"));

       userNameInput.sendKeys("incorrect@email.com");

       WebElement userPasswordInput = driver.findElement(By.id("inputPassword"));

       // ANOTHER WAY -> userPasswordInput.sendKeys("incorrect password" + Keys.ENTER);
       userPasswordInput.sendKeys("incorrect password");

       // locate sign in button
        WebElement signinButton = driver.findElement(By.tagName("button"));

        signinButton.click();














    }


}
