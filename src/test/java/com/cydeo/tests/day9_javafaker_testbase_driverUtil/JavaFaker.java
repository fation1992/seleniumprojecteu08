package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {

    @Test
    public void fakerExample(){

        Faker faker= new Faker();

        System.out.println(faker.name().firstName()+" "+faker.name().lastName());
        System.out.println(faker.numerify("#####-#####-#####-####"));
        System.out.println(faker.letterify("????????"));
        System.out.println(faker.finance().creditCard());
        System.out.println(faker.chuckNorris().fact());

    }
}
