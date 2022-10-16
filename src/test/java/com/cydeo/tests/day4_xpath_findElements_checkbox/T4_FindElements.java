package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {
    public static void main(String[] args) {


        /*
        //1- Open a chrome browser


        //2- Go to: https://practice.cydeo.com/abtest


        //3- Locate all the links in the page.


        //4- Print out the number of the links on the page.


        //5- Print out the texts of the links.


        //6- Print out the HREF attribute values of the links

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://practice.cydeo.com/abtest");


         //3- Locate all the links in the page.
        List<WebElement> listAllLinks = driver.findElements(By.tagName("a"));



        //4- Print out the number of the links on the page.

        System.out.println("listAllLinks = " + listAllLinks.size());


        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement eachLLink : listAllLinks){
            System.out.println("EachLink in Page: " + eachLLink.getText());
            System.out.println("HREF Value: " + eachLLink.getAttribute("href"));
        }



    }
}
