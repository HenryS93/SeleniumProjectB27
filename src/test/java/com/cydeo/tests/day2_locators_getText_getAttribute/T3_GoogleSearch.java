package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        /*
        1- Open a chrome browser
2- Go to: https://google.com/
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
         */

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();


        driver.get("https://google.com/");

        /** locating element with name attribute **/
        WebElement searchBox = driver.findElement(By.name("q"));


        //.sendKeys = Allows us to send String Text + Keys.Enter we concatenate to hit search at the sametime of execution
        searchBox.sendKeys("apple" + Keys.ENTER);





        String expectedTitle = "apple";
        String actual = driver.getTitle();

        if (actual.startsWith(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

    driver.quit();


    }
}
