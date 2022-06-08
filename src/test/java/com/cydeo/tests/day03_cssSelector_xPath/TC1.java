package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://login1.nextbasecrm.com/");

        driver.findElement(By.cssSelector("input[class='login-inp']")).sendKeys("incorrect");


        driver.findElement(By.cssSelector("input[name='USER_PASSWORD']")).sendKeys("incorrect");

        driver.findElement(By.cssSelector("input[class='login-btn']")).click();

        String actualErrorTitle = driver.findElement(By.cssSelector("div[class='errortext']")).getText();
        System.out.println(actualErrorTitle);

        String expectedErrorTitle ="Incorrect login or password";

        if (expectedErrorTitle.equals(actualErrorTitle)) {

            System.out.println("passed");



        }else
            throw new RuntimeException("failed");

    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 */