package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC3 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        // using xpath  //tagName[@attribute='value']

        String actualLogInButton = driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");

        String expectedLogInButton = "Log In";

        System.out.println(actualLogInButton+"\n"+expectedLogInButton);

        if (actualLogInButton.equals(expectedLogInButton)){

            System.out.println("passed");
        }else
            System.out.println("failed");
    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */