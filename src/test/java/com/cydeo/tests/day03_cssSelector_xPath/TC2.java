package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC2 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        String actualLabelMessage = driver.findElement(By.cssSelector("label[class='login-item-checkbox-label']")).getText();



        String expectedLabelMessage = "remember me on this computer";

        if (actualLabelMessage.equals(expectedLabelMessage)){
            System.out.println("passed"+ "\n"+  actualLabelMessage + "\n"+expectedLabelMessage);
        }else
            System.out.println("failed"+ "\n"+  actualLabelMessage + "\n"+expectedLabelMessage);

        String actualForgotPasswordMessage = driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']")).getText();

        String expectedForgotPasswordMessage = "Forgot your password?";

        if (actualForgotPasswordMessage.equals(expectedForgotPasswordMessage)){
            System.out.println("passed"+"\n"+ expectedForgotPasswordMessage+"\n" + actualForgotPasswordMessage);
        }else
            System.out.println("failed"+"\n"+ expectedForgotPasswordMessage+"\n" + actualForgotPasswordMessage);

        String actualAttribute = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");

        String expectedAttribute = "forgot_password=yes";

        if (actualAttribute.equals(expectedAttribute)){
            System.out.println("passed attribute value"+"\n"+ actualAttribute+"\n" + expectedAttribute);
        }else
            System.out.println("failed attribute value" +"\n"+ actualAttribute+"\n" + expectedAttribute);
    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
PS: Inspect and decide which locator you should be using to locate web
elements.
 */