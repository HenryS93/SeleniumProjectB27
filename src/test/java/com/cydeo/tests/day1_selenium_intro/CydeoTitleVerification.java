package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {

    public static void main(String[] args) {

        // setup our driver
        WebDriverManager.chromedriver().setup();

        //create our browser
        WebDriver driver = new ChromeDriver();

        //extend our window to -> maximize to view our fullscreen
        driver.manage().window().maximize();


        // go to site
        driver.navigate().to("https://www.cydeo.com");

        //verify title
        String expectedTitle = "Cydeo";
        String actual = driver.getTitle();

        /** Asyun used -> if(actual.equals(expectedTitle));   **/

        if (expectedTitle.equals(actual)){  // I USED: Still passed
            System.out.println("Title verification is PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }


        //once we're done with our run, we add quit method to close the page after
        driver.quit();









    }


}
