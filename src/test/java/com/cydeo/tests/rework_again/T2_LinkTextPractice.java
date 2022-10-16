package com.cydeo.tests.rework_again;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        /*
        1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
﻿
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.navigate().to("https://practice.cydeo.com/");

        Thread.sleep(3000); // slows down browser for visual

        //3- Click to A/B Testing from top of the list. this is locating only!!
//        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));
        //        abTestingLink.click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B"));
        abTestLink.click();
        //find element is returning web element and store into abTestingLink variable


        // use variable containing our webElement and us
    }
}