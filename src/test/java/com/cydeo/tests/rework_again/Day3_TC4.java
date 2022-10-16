package com.cydeo.tests.rework_again;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_TC4 {
    public static void main(String[] args) {
        /*
        1. Open a chrome browser
        2. Go to: https://login1.nextbase.com/?forgot_password=yes
        3. Verify "Reset password" button text is as expected:
                -> expected: Reset password

        PS: Inspect and decide which locator you should be using to locate web elements
        PS2: Pay attention to where to get the text os this button from
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();

         driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");

         WebElement resetButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

         String expectedResetButtn = "Reset password";
         String actualResetButtn = resetButton.getText();

        if (actualResetButtn.equals(expectedResetButtn)){
            System.out.println("Reset Button text Verification PASSED!");
        }else {
            System.out.println("Reset Button text Verification FAILED!");
        }




    }
}
