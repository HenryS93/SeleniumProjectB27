package com.cydeo.tests.webtable_utilities;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Practice {



    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

/*
1- Go to : https://practice.cydeo.com/web-tables
2- Verify Bob's name is Listed as expected
-> expected: "Bob Martin"
3- Verify Bob Martin's order date is as expected
-> Expected: "12/31/2021"

 */

    @Test
    public void order_name_verify_test(){

        driver.navigate().to("https://practice.cydeo.com/web-tables");
        WebElement clientBobMartin = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        String actualBMartinName = clientBobMartin.getText();
        String expectedBMartinName = "Bob Martin";

        Assert.assertEquals(actualBMartinName, expectedBMartinName , "Names Not MATCHING!");

        //Verify Bob Martins Order date:

        WebElement bMartinOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='12/31/2021']"));
        String actualOrderDate4Bob = bMartinOrderDate.getText();
        String expectedOderDate = "12/31/2021";

        Assert.assertEquals(actualOrderDate4Bob, expectedOderDate, "Date Does Not MATCH - FAILED!");

    }

    @Test
    public void test2(){
        driver.navigate().to("https://practice.cydeo.com/web-tables");
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate = " + customerOrderDate1);
    }

    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver, "Ned Stark", "05/12/2021");

    }




}
