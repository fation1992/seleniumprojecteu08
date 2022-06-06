package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Task4 {

    WebDriver driver;

    @BeforeMethod
    public void SetUp(){

        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("URL"));
    }

    @Test
    public void Test1(){
        WebElement searchBoxGoogle = driver.findElement(By.xpath("//input[@name='q']"));
        searchBoxGoogle.sendKeys(ConfigurationReader.getProperty("searchKeyword")+ Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchKeyword")+" - Kërko në Google";



        com.cydeo.tests.utilities.BrowserUtils.verifyTitle(driver,expectedTitle);
    }


}
/*
TC #4: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Google Search
Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.
 */