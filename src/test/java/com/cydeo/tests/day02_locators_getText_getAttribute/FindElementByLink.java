package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLink {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/");

        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String expectedTitle = "No A/B Test";

        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Passed");

        }else
            throw new RuntimeException("Title is not same");

        driver.navigate().back();

        String expectedHomeTitle = "Practice";
        String actualHomeTitle = driver.getTitle();

        if (actualHomeTitle.equals(expectedHomeTitle)){
            System.out.println("Passed");
        }else
            throw new RuntimeException("Home title is different");

        Thread.sleep(2000);
        driver.close();
    }
}
