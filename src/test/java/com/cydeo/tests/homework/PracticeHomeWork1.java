package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeHomeWork1 {
    /*
    TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to
https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
     */


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com");


        String expectedURL = "cydeo";
        String actualURl = driver.getCurrentUrl();


        if (actualURl.contains(expectedURL)){
            System.out.println("Verification PASsed!");
        }else {
            System.out.println("FAILED!");
        }



        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title PAssed");
        }else {
            System.out.println("FAILED!");
        }


        driver.quit();














    }










}
