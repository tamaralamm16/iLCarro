package tests;

import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.user().isSignUpButtonPresent()) {
            app.user().logout();
        }
    }

    @Test
    public void signUpTest() {
        app.header().clickOnSignUpTab();
        app.user().isSignUpFormPresent();

        app.user().fillRegistrationForm(new User()
                .withFirstName("Nils")
                .withSecondName("Nummels")
                .withEmail("nummels@gmail.com")
                .withPassword("Nummels098765"));

        app.user().clickCheckPolicy();
        app.user().submit();
        app.user().isLogInFormPresent();

    }

}
