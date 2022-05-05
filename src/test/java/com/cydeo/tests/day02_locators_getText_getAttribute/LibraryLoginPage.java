package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryLoginPage {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        Thread.sleep(4000);

        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("username@email.com");


        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect");

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

    }
}
