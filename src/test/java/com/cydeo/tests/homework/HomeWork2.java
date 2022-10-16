package com.cydeo.tests.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeWork2 {
    public static void main(String[] args) {

     /*   TC #4: FindElements Task
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/abtest
        3- Locate all the links in the page.
        4- Print out the number of the links on the page.
        5- Print out the texts of the links.
        6- Print out the HREF attribute values of the links
*/

       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();

       driver.navigate().to("https://practice.cydeo.com/abtest");

       List<WebElement> list1 =  driver.findElements(By.tagName("a"));
        System.out.println(list1.size());

        for (WebElement eachLink : list1){

            System.out.println(eachLink.getText());
            System.out.println(eachLink.getAttribute("href"));

        }

















    }
}
