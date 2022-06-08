package com.cydeo.tests.day6_iframes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase5 {

    WebDriver webDriver;

    @BeforeClass
    public void SetUp(){
        webDriver=WebDriverFactory.getDriver("chrome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Test1(){



        webDriver.get("https://practice.cydeo.com/windows");

        String currentTitle = webDriver.getTitle();

        System.out.println(currentTitle);

        webDriver.findElement(By.xpath("//a[.='Click Here']")).click();
        
        String expectedTitle = "Windows";

        Assert.assertEquals(expectedTitle,currentTitle);

        String windowHandle = webDriver.getWindowHandle();

        for (String handle : webDriver.getWindowHandles()) {

            webDriver.switchTo().window(handle);
            System.out.println(handle);
            
        }

        String actualTitleAfterClick = webDriver.getTitle();

        String expectedTitleAfterCLick = "New Window";

        Assert.assertEquals(actualTitleAfterClick,expectedTitleAfterCLick);



    }
}
/*
TC #5: Window Handle practice
1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
*/
