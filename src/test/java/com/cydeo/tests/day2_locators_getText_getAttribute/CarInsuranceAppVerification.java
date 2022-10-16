package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {
    public static void main(String[] args) {



        //1 - open google chrome browser
        WebDriverManager.chromedriver().setup();




        //2.
        WebDriver driver = new ChromeDriver();


        //maximize our window
        driver.manage().window().maximize();



        driver.navigate().to("https://www.qa1.excelsoirinsurance.com/login");


        //verify URL contains Expected:

        String expectedUrl = "excelsoirinsurance"; // -> expected comes from requirement
        String actual = driver.getCurrentUrl();  // -> comes from actual browser we're testing

        if (actual.contains(expectedUrl)){
            System.out.println("URL verification is PASSED!");
        }else {
            System.out.println("URL Verification has Failed!");
        }


        //4. verify title: Expected: "Login | Excelsoir Insurance"

        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else {
            System.out.println("Tittle Verification FAILED!");
        }



        driver.quit();



    }
}
