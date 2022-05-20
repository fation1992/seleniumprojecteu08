package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC6 {

    WebDriver driver;

    @BeforeMethod
    public  void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void newTest(){

        driver.get("https://practice.cydeo.com/dropdown");
        Select yearDropdownButton = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdownButton.selectByVisibleText("1923");

        Select monthDropdownButton = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdownButton.selectByVisibleText("December");

        Select dayDropdownButton = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdownButton.selectByIndex(0);

       String expectedYear = "1923";
       String expectedMonth = "December";
       String expectedDay = "1";

       String actualYear = yearDropdownButton.getFirstSelectedOption().getText();
       String actualMonth = monthDropdownButton.getFirstSelectedOption().getText();
       String actualDay = dayDropdownButton.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedYear,actualYear);
        Assert.assertEquals(expectedMonth,actualMonth);
        Assert.assertEquals(expectedDay,actualDay);


    }

    @AfterMethod
    public void closeSetupMethod(){
        driver.quit();
    }

}
/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */