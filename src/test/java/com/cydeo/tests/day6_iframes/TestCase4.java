package com.cydeo.tests.day6_iframes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase4  {


    WebDriver driver;




    @BeforeMethod
    public void setupMethod(){

        WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void iframe(){



        driver.get("https://practice.cydeo.com/iframe");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());
    }
}
