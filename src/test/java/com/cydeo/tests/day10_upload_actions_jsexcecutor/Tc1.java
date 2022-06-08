package com.cydeo.tests.day10_upload_actions_jsexcecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc1 {

    @Test
    public void task1_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("URL1"));

        Faker faker = new Faker();

        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys( faker.name().firstName());

        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String usernameEmail= faker.numerify("user####");
        userName.sendKeys(usernameEmail);

        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(usernameEmail+ "@gmail.com");

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.bothify("??##??##??##"));

        WebElement phone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(faker.numerify("571-###-####"));

        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        gender.click();

        WebElement birthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys(faker.numerify("12/12/19##"));

        WebElement dropdownButton = Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        Select select=new Select(dropdownButton);
        select.selectByIndex(faker.number().numberBetween(1,9));

        WebElement dropdownJobTitle = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        Select selectJobTitle = new Select(dropdownJobTitle);
        selectJobTitle.selectByIndex(faker.number().numberBetween(1,8));

        WebElement checkBoxJava = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        checkBoxJava.click();

        System.out.println(checkBoxJava.isSelected());

        WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        signUpButton.click();

        WebElement message= Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));

        System.out.println(message.getText());
        message.isDisplayed();
    }

}
/*
TC#1: Registration form confirmation
        Note: Use JavaFaker OR read from configuration.properties file when possible.
        1. Open browser
        2. Go to website: https://practice.cydeo.com/registration_form
        3. Enter first name
        4. Enter last name
        5. Enter username
        6. Enter email address
        7. Enter password
        8. Enter phone number
        9. Select a gender from radio buttons
        10. Enter date of birth
        11. Select Department/Office
        12. Select Job Title
        13. Select programming language from checkboxes
        14. Click to sign up button
        15. Verify success message “You’ve successfully completed registration.” is
        displayed.
        Note:
        1. Use new Driver utility class and method
2. User JavaFaker when possible
        3. User ConfigurationReader when it makes sense
        */
