package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();//sets up the browser driver

        WebDriver driver = new ChromeDriver(); // opens a new empty browser

        driver.manage().window().maximize(); // maximizes the window

        driver.get("https://www.tesla.com"); //navigates to tesla.com

        Thread.sleep(3000); //pauses the program for 3 seconds

        driver.navigate().back(); //goes back in browser

        Thread.sleep(3000);

        driver.navigate().forward(); // goes forward

        Thread.sleep(3000);

        driver.navigate().refresh(); // refreshes the page

        driver.navigate().to("https://www.google.com");

        //System.out.println(driver.getTitle());

        String currentTitle = driver.getTitle(); // gets the title and saves it in a variable called currentTitle

        String currentURL = driver.getCurrentUrl(); // gets the current url

        System.out.println(currentURL);


    }


}
