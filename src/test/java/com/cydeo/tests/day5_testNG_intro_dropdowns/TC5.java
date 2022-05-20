package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5 {

    WebDriver driver;

    @Test
    public void Test1() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropdown.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);

        String actualSelectedOption = stateDropdown.getFirstSelectedOption().getText();

        String expectedSelectedOption = "California";

        Assert.assertEquals(expectedSelectedOption,actualSelectedOption);

    }



}
/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */