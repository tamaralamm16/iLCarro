package tests;

import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.user().isSignUpButtonPresent()) {
            app.user().logout();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {

        app.user().clickOnLoginTab();

        app.user().fillLoginForm(new User().withEmail("nummels@gmail.com")
                .withPassword("Nummels098765"));

        app.user().submit();

        app.header().isLogoutTabPresent();

    }

    @Test
    public void loginRegisteredUserWithWrongPasswordNegativeTest() {

        app.user().clickOnLoginTab();

        app.user().fillLoginForm(new User().withEmail("nummels@gmail.com")
                .withPassword("hummel098765"));

        app.user().submit();

    }

}