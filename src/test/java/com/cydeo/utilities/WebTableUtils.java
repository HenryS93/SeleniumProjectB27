package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {


    /*
    Method #1 info::
    - Name: returnOrderDate()
    - return type: String
    - Arg1: WebDriver driver
    - Arg2: String costumerName
    -> This method should accept a customer name order date as String

     */

    /**
     *
     * @param driver
     * @param customerName
     * @return
     * This returns customer order date from Web-Table
     */

    public static String returnOrderDate(WebDriver driver, String customerName ){

                            //Aysun USED: "//td[.='Bob Martin']
        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerOrderDate = driver.findElement(By.xpath(locator));

        return customerOrderDate.getText();




    }

    /*
    Method #2 info:
    - Name: orderVerify()
    - Return Type: Void
    - Arg1: WebDriver driver
    - Arg2: String customerName
    - Arg3: String expectedOrderDate
    -> This method should accept above mentioned arguments and internally assert
        expectedOrderDate matching actualOrderDate

     */
    public static void orderVerify(WebDriver driver, String customerName, String expectedOderDate){


        WebElement orderDate = driver.findElement(By.xpath("//td[.='"+ customerName +"']/following-sibling::td[4]"));
        String actualOrderDate = orderDate.getText();



        Assert.assertEquals(actualOrderDate, expectedOderDate, "Does NOT MATCH!");



    }






}
