package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_Checkboxes {
    public static void main(String[] args) {

        /*
        1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("checkBox1, (Expected: False) = " + checkBox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='box2']"));
        System.out.println("checkBox2, (Expected true) = " + checkBox2.isSelected());

        //4. Click checkbox #1 to select it.
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        checkBox2.click();


        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1 (Expected: True) = " + checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2. (Expected: False) = " + checkBox2.isSelected());













    }
}
