package com.ilCarro.qa14;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isSignUpButtonPresent()) {
            logout();
        }
    }

    @Test
    public void signUpTest() {
        clickOnSignUpTab();
        isSignUpFormPresent();

        fillRegistrationForm(new User()
                .withFirstName("Nils")
                .withSecondName("Nummels")
                .withEmail("nummels@gmail.com")
                .withPassword("Nummels098765"));

        clickCheckPolicy();
        submit();
        isLogInFormPresent();

    }

}
