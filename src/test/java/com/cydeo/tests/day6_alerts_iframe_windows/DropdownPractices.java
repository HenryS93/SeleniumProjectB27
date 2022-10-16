package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {



    /*
    TC#4
    1. Open Chrome Browser
    2. Go to https://practice.cybertekschool.com/dropdown
    3. Select Illinois
    4. Select Virginia
    5. Select California
    6. Verify final selected option is California.
        Use all Select options. (Visible text, value, index)

     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void dropdownTask4(){

        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //select by index
        stateDropdown.selectByIndex(14);

        //select by visible text
        stateDropdown.selectByVisibleText("Virginia");

        //select by value
        stateDropdown.selectByValue("CA");


        String actualSelected = stateDropdown.getFirstSelectedOption().getText();

        String expectedState = "California";


        Assert.assertEquals(actualSelected, expectedState, "CHECK CODE, ELEMENTS NOT MATCHING!");


        int index = -1;

        for (WebElement eachState : stateDropdown.getOptions()){

           index++;

           if (eachState.getText().equals("California")){
               System.out.println(index);
           }

        }



    }

    /*

    TC#5
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Select "December 1st, 1923" and verify it is selected.
        select Year using = visible text
        select month using = value attribute
        select day using = index number

     */


    @Test
    public void setUpSelectDate(){

       driver.navigate().to("https://practice.cydeo.com/dropdown");


       Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
       Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
       Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));


       selectMonth.selectByValue("11");
       selectDay.selectByIndex(1);
       selectYear.selectByVisibleText("1923");

       String actualYear = selectYear.getFirstSelectedOption().getText();
       String actualMonth = selectMonth.getFirstSelectedOption().getText();
       String actualDay = selectDay.getFirstSelectedOption().getText();

       String expectedYear = "1923";
       String expectedMonth = "December";
       String expectedDay = "1";


    Assert.assertEquals(actualYear,expectedYear, "CHECK CODE NOT MATCHING!!!!");
    Assert.assertEquals(actualMonth, expectedMonth , "CHECK CODE NOT MATCHING!!!!");
    Assert.assertEquals(actualDay, expectedDay , "CHECK CODE NOT MATCHING!!!!");


    }


    /*
    TC#7
    1.Open Chrome browser
    2.Go to https://practice.cydeo.com/dropdown
    3.select all the options from multiple select dropdown
    4.printout all the selected values
    5.Deselect all values

     */



    @Test
    public void T7SelectMultipleDropdown(){

     driver.navigate().to("https://practice.cydeo.com/dropdown");

     Select selectMultipleDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));



     for (WebElement allOptions : selectMultipleDropdown.getOptions()){
        allOptions.click();

     }

     selectMultipleDropdown.deselectAll();

    }

    /*
    Day 6
    TC#1
    1. Open browser
    2. Go to website: http://practice.cydeo.com/javascript_alerts
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Verify “You successfully clicked an alert” text is displayed.
     */

    @Test
    public void javaScriptInfoAlert(){

        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");
      WebElement jSAlertButton =  driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jSAlertButton.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement alertMsg = driver.findElement(By.xpath("//p[@id='result']"));
        String actualAlertMsg = alertMsg.getText();
        String expectedAlertMsg = "You successfully clicked an alert";

        Assert.assertEquals(actualAlertMsg, expectedAlertMsg, "CHECK CODE, MSG NOT MATCHING!!!!");


    }

    /*
    TC#2
    Confirmation Alert Practice:
    1. Open browser
    2.Go to Website: http://practice.cydeo.com/javascript_alerts
    3.click to "Click for JS confirm" button
    4.Click to OK button from the alert
    5.Verify "You clicked: Ok" text is displayed.
     */

    @Test
    public void confirmationAlertPractice() throws InterruptedException {

        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");

       WebElement confirmationButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
       confirmationButton.click();

       Alert hitOk = driver.switchTo().alert();
       hitOk.accept();

       WebElement hitOkMsg = driver.findElement(By.xpath("//p[@id='result']"));

       String actualMsg = hitOkMsg.getText();
       String expectedMsg = "You clicked: Ok";

       Assert.assertEquals(actualMsg,expectedMsg, "CHECK YOUR CODE, DOES NOT MATCH!!");



    }

    @Test
    public void promptAlert(){

        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");

        WebElement promptButton  = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        promptButton.click();

         Alert sendText = driver.switchTo().alert();

         sendText.sendKeys(" hello");
         sendText.accept();




    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }








}
