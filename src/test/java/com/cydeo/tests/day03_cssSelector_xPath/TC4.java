package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordButton = driver.findElement(By.xpath("//button[@class='login-btn']"));

        String actualButtonText = resetPasswordButton.getText();

        String expectedButtonText = "Reset password";

        if (actualButtonText.equals(expectedButtonText)){

            System.out.println("passed");

        }else
            System.out.println("fail");


    }
}
/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a Chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */