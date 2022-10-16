package com.cydeo.tests.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HWTC5 {

    /*
    TC #4: Selecting state from State dropdown and verifying
result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)

     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

    }



        @Test
    public void selectStateDropdown(){

            Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

            stateDropdown.selectByIndex(14);

            stateDropdown.selectByIndex(47);

            stateDropdown.selectByValue("CA");


            String expactedSeletion = "California";
            String actualSelection = stateDropdown.getFirstSelectedOption().getText();


            Assert.assertEquals(actualSelection,expactedSeletion, " does NOT MATCH, FAILED! ");



        }


        /*
        TC #5: Selecting date on dropdown and verifying
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/dropdown
        3. Select “December 1st, 1923” and verify it is selected.
             Select year using   : visible text
            Select month using    : value attribute Select
            day using : index number
         */








}
