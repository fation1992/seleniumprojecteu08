package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://practice.cybertekschool.com");

        String expectedURL = "cydeo";

        String actrualURL = driver.getCurrentUrl();

        if (actrualURL.contains(expectedURL)){
            System.out.println("Url passed");
        }else
            System.out.println("Url failed");

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title passed");
        }else
            System.out.println("Title failed");

        driver.close();
    }
}
