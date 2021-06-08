package com.ilCarro.qa14;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!isSignUpButtonPresent()) {
            logout();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {

        clickOnLoginTab();

        fillLoginForm(new User().withEmail("nummels@gmail.com")
                .withPassword("Nummels098765"));

        submit();

        isLogoutTabPresent();

    }

    @Test
    public void loginRegisteredUserWithWrongPasswordNegativeTest() {

        clickOnLoginTab();

        fillLoginForm(new User().withEmail("nummels@gmail.com")
                .withPassword("hummel098765"));

        submit();

    }

}