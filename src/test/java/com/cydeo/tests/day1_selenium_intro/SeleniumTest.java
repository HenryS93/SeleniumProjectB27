package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    public static void main(String[] args) throws InterruptedException {


        //1-setting up web driver manager
        WebDriverManager.chromedriver().setup();


        //2- create a instance of WebDriver
        //2.a - DO NOT create a different variable name for WebDriver use only - (driver)

        WebDriver driver = new ChromeDriver();


        //3 - Test if driver is working
//        driver.get("https://www.tesla.com");
//

        /** ---  also working the same as driver.get(). ----  **/
        driver.navigate().to("https://www.tesla.com");

/** -------------------------------------------------------------------------------------------------------------------------- **/


        /** --- makes the window screen to fullscreen --- **/
        //PREFERRED METHOD TO USE
        /*
        CODE:     driver.manage().window().maximize();
        WHY MAXIMIZING?
        ANS:        -> BECAUSE IN DIFFERENT SIZES THE CONTENT DISPLAY WILL BE DIFFERENT
                    -> THIS HAPPENS IF THE PAGE IS "RESPONSIVE"
                    "RESPONSIVE": -> IF THE SIZE IS SMALLER, IT WILL DISPLAY LESS CONTENT WHEN OPENED.
                                  -> IT MAY STORE (HIDE) SOME WEB ELEMENTS UNDER SOME HAMBURGER MENU. OR SOME OTHER TYPE OF MENU
         */
        /** --- makes the window screen to fullscreen --- **/
        driver.manage().window().maximize();


/** -------------------------------------------------------------------------------------------------------------------------- **/



        /** it does the same as maximize() method -> BUT DOES NOT WORK FOR ALL TYPES OF MACHINES   **/
        //CAN HAVE SMALL BUGS OR JUST NOT COMPATIBLE WITH BROWSERS OR HARDWARE
        driver.manage().window().fullscreen();





        Thread.sleep(3000);
        // ****  highlight .sleep and -> click addException to fix   ****//
        /** BY CLICKING THIS .SLEEP AND ADD TO EXCEPTIONS IT WILL ADD -> throws InterruptedException { TO MAIN METHOD ***/


        /** --- loads previous page ---- **/
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        /** --- this method slows down the browser to visualize changes --- **/ // comes from java Thread
        Thread.sleep(3000);

        driver.navigate().refresh();

/** -------------------------------------------------------------------------------------------------------------------------- **/

        /**   close() method will close "CURRENT" opened page  **/
        /*
        THIS METHOD: -> WILL CLOSE THE CURRENTLY OPENED BROWSER/PAGE
                     -> IF MORE THAN 1 PAGE OPENED, THIS METHOD WILL CLOSE THE PAGE IT IS FOCUSED ON
         */
        driver.close();


        /** -------------------------------------------------------------------------------------------------------------------------- **/


        /** --- quit() method will close all opened pages -> this acts the same way as .CLOSE() method but will close all TABS -- **/
        /*
        THIS METHOD: ->
         */
        driver.quit();





    }

}
