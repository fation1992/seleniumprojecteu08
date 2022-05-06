package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/registration_form");

        WebElement header = driver.findElement(By.tagName("h2"));

        String currentHeader = "Registration form";

        if (currentHeader.equals(header.getText())){
            System.out.println("passed");
        }else
            throw new RuntimeException("fail");

    }
}
