package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3 {

    WebDriver driver;
    @BeforeClass
    public void SetUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Test
    public void loginTest(){

        driver.get("http://login1.nextbasecrm.com/");

        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk1@cybertekschool.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");

        driver.findElement(By.xpath("//input[@class='login-btn']")).click();

        com.cydeo.utilities.BrowserUtils.verifyTitle(driver,"Portal");
    }

}
/*
TC #3: Login scenario
1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal
USERNAME PASSWORD
helpdesk1@cybertekschool.com UserUser
Helpdesk2@cybertekschool.com UserUser
 */