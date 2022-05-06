package com.cydeo.tests.day02_locators_getText_getAttribute.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement clickGmail = driver.findElement(By.className("gb_d"));

        clickGmail.click();

        String expectedTitle = "Gmail";

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Gmail")){
            System.out.println("passed");
        }else
            System.out.println("fail");

        driver.navigate().back();

        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)){

            System.out.println("passed");
        }else
            System.out.println("failed");



    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */