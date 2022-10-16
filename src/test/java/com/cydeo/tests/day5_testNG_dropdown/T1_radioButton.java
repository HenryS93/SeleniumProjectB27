package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_radioButton {
    public static void main(String[] args) {

        /*
        http://practice.cydeo.com/radio_buttons
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/radio_buttons
        3. Click to “Hockey” radio button
        4. Verify “Hockey” radio button is selected after clicking.
            day5_testNG_dropdown
         */

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.navigate().to("https://practice.cydeo.com/radio_buttons");


        //3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadioButton.click();

       // Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockeyRadioButton is Selected: " + hockeyRadioButton.isSelected());

        // now  test All radio buttons

       List<WebElement> sportListButtons = driver.findElements(By.xpath("//input[@name='sport']"));

      for (WebElement eachSport : sportListButtons){

          eachSport.click();
          System.out.println(eachSport.getAttribute("id") + " is Selected: " + eachSport.isSelected());

      }








    driver.quit();


    }
}
