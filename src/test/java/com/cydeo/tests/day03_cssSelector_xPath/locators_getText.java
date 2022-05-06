package com.cydeo.tests.day03_cssSelector_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.tests.utilities.WebDriverFactory.getDriver;

public class locators_getText {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement inputUsername= driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        Thread.sleep(2000);

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        String expectedIncorrectMessage = "Incorrect login or password";
        WebElement incorrectMessage = driver.findElement(By.className("errortext"));

        if (incorrectMessage.getText().equals(expectedIncorrectMessage)){
            System.out.println("passed");
        }else
            System.out.println("failed");
    }
}
