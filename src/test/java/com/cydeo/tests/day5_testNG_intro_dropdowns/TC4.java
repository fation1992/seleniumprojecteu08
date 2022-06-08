package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TC4 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdown");

        Select dropdownButton =new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement element = dropdownButton.getFirstSelectedOption();

        String actualResult = element.getText();

        String  expectedResult = "Please select an option";

        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);

        if(expectedResult.equals(actualResult)){
            System.out.println("passed");
        }else
            System.out.println("failed");


        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

        String expectedStateDropdownText = "Select a State";

        System.out.println("expectedStateDropdownText = " + expectedStateDropdownText);

        System.out.println("actualStateDropdownText = " + actualStateDropdownText);

        if (actualStateDropdownText.equals(expectedStateDropdownText)){
            System.out.println("passed");
        }else
            System.out.println("failed");


    }
}
/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */