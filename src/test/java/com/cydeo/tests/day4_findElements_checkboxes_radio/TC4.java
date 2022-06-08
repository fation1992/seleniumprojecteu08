package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC4 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/multiple_buttons");

        driver.findElement(By.xpath("//button[@onclick='button1()']")).click();

        String expectedTextMessage = "Clicked on button one!";

        WebElement clickedMessage = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));

        String actualTextMessage = clickedMessage.getText();

        if (actualTextMessage.equals(expectedTextMessage)){
            System.out.println("passed");
        }else
            System.out.println("failed");

        System.out.println("actualTextMessage = " + actualTextMessage);
        System.out.println("expectedTextMessage = " + expectedTextMessage);

    }
}
/*
XPATH Practice
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #6: XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cydeo.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */