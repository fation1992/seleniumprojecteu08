package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC5 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkBox1= driver.findElement(By.xpath("//input[@id='box1']"));

        System.out.println(checkBox1.isSelected());

        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println(checkBox2.isSelected());

        checkBox1.click();

        checkBox2.click();


        System.out.println(checkBox1.isSelected()+" should be true");

        System.out.println(checkBox2.isSelected() +" should be false");


    }
}
/*
Practice: Checkboxes
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */