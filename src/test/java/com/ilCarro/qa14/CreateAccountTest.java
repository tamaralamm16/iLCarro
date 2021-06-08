package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends com.ilCarro.qa14.TestBase {
    //preconditions: user should be logged out
    @BeforeMethod
    public void ensurePrecondition(){
        if(!isSignUpFormPresent()){
            logout();

        }
    }

    @Test
    public void signUpTest(){
        click(By.cssSelector("[href='/signup']"));
        isLoginFormPresent();


        fillRegistrationForm(new User().setFirstName("Tuka").setSecondName("Nils").setPassword("nils@mail.ru").setPassword("Nitu12345"));

        click(By.cssSelector("#check_policy"));
        submit();
        Assert.assertTrue(isElementPresent(By.cssSelector(".")));

    }

    private void fillRegistrationForm(User user) {
        type(By.cssSelector("#first_name"), user.getFirstName());

        type(By.cssSelector("#second_name"), user.getSecondName());

        type(By.cssSelector("#email"), user.getEmail());

        type(By.cssSelector("#password"), user.getPassword());
    }

}
