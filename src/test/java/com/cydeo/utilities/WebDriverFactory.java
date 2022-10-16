package com.cydeo.utilities;

/*
Task: New METHOD CREATION
method name: getDriver
Static method
Accepts String arg: browser type
        -> This arg will determine what type of browser is opened
        -> if "chrome" passed --> it will open chrome browser
        -> if "firefox" passed --> it will open firefox browser
        returnType: WebDriver
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {


    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();


        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();


        } else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();


        } else if (browserType.equalsIgnoreCase("safari")){
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();

        }else {
            System.out.println("Given Browser is not Supported!");
            return null;
            }
        }

    }





