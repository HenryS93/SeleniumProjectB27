package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_StaleElementReferenceException {
    public static void main(String[] args) {


        /*
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/add_remove_elements/
        3. Click to “Add Element” button
        4. Verify “Delete” button is displayed after clicking.
        5. Click to “Delete” button.
        6. Verify “Delete” button is NOT displayed after clicking. USE

         */


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.navigate().to("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

        //4. Verify “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteButton.isDisplayed()){
            System.out.println("Verification PASSED! DELETE BUTTON is displayed : " + deleteButton.isDisplayed());
        }else {
            System.out.println("Verification FAILED! DELETE BUTTON is Not: " + deleteButton.isDisplayed());
        }

        //5. Click to “Delete” button.
        deleteButton.click();

        try {
            if (!deleteButton.isDisplayed()){
                System.out.println("Is DELETE BUTTON Displayed: " + deleteButton.isDisplayed());
            }else {
                System.out.println(deleteButton.isDisplayed());
            }
        }catch (StaleElementReferenceException e){
            System.out.println("Stale Element Reference Exception is thrown and this is Already as EXPECTED!");
        }







        driver.quit();

    }
}
