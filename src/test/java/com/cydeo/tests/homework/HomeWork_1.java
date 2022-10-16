package com.cydeo.tests.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWork_1 {
    public static void main(String[] args) {

        /*
        TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
         */

       // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com/ ");


        WebElement useLoginInputBox =driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        useLoginInputBox.sendKeys("incorrect");

        WebElement userPasswordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        userPasswordBox.sendKeys("incorrect");

        //Click to login button.
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        WebElement errorMsg = driver.findElement(By.xpath("//div[@class='errortext']"));
        String actualErrorMsg = errorMsg.getText();
        String expectedErrorMsg = "Incorrect login or password";

        if (actualErrorMsg.equals(expectedErrorMsg)){
            System.out.println("expectedErrorMsg = PASSED! " + expectedErrorMsg);
        }else {
            System.out.println("expectedErrorMsg = FAILED! " + expectedErrorMsg);
        }






    }
}
