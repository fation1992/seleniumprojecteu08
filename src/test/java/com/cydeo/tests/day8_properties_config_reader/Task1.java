package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1 {

    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void Testing(){

        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        String expectedBobMartinCell = "Bob Martin";

        Assert.assertEquals(bobMartinCell.getText(),expectedBobMartinCell);

        System.out.println(bobMartinCell.getText());
        System.out.println(expectedBobMartinCell);

        WebElement bobMartinDateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String actualDateBobMartin = bobMartinDateCell.getText();
        String expectedDateBobMartin = "12/31/2021";


        Assert.assertEquals(actualDateBobMartin,expectedDateBobMartin);


    }
    @Test
    public void Testing2(){

        String dateOfNedStark = WebTableUtils.returnOrderDate(driver,"Ned Stark");
        System.out.println(dateOfNedStark);
    }

    @Test
    public void Testing3(){

        WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");
    }
}
/*
TC #1: Web table practice
1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021
 */