package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5 {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        driver.findElement(By.xpath("//button[.='Reset password']")).click();

        String expectedErrorLabel= "Login or E-mail not found";

        WebElement errorLabel = driver.findElement(By.xpath("//div[@class='errortext']"));

        String actualErrorLabel = errorLabel.getText();

        if (actualErrorLabel.equals(expectedErrorLabel)){

            System.out.println("passed");
        }else
            System.out.println("failed");


        System.out.println("actualErrorLabel = " + actualErrorLabel);
        System.out.println("expectedErrorLabel = " + expectedErrorLabel);

    }
}
/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */