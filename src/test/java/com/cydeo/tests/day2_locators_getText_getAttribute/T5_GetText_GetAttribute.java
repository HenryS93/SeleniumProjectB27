package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) {

        /*
        TASK:
        1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");


        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();


        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header text Verification PASSED!");
        }else {
            System.out.println("Header text Verification FAILED!");
        }



















    }
}
