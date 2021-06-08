package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends com.ilCarro.qa14.TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!isSignUpFormPresent()) {
            logout();

        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {
        //go to login page
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(5)"));
        //fill login form
        fillLoginForm("nils@mail.ru", "Nitu12345");
        submit();
        isLogoutTabPresent();

        //submit login
        //assert user logged in
    }

    private void fillLoginForm(String email, String password) {
        type(By.cssSelector("[name='email']"), email);
        type(By.name("password"), password);
    }

}
