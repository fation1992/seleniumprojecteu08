package com.cydeo.tests.LiveSaterdays;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement inputEmail = driver.findElement(By.name("email"));
        String expectedEmail = "name@email.com";
        inputEmail.sendKeys(expectedEmail);


        String actualEmailWritten = inputEmail.getAttribute("value");
        System.out.println(actualEmailWritten);

        if (actualEmailWritten.equals(expectedEmail)){

            System.out.println("Verification passed");
            driver.findElement(By.tagName("i")).click();

            String expectedMessage = "Your e-mail's been sent!";
            WebElement message = driver.findElement(By.name("confirmation_message"));
            String actualMessage =message.getText();

            if(actualMessage.equals(expectedMessage)){
                System.out.println("Message Passed");
            }else{
                System.out.println("Message Failed");
            }
        }else
            throw new RuntimeException("Error! Email not same!");




    }
}
/*
Task 1:
 Verify confirmation message
        open chrome browser
        go to https://practice.cydeo.com/forgot_password
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'

 */