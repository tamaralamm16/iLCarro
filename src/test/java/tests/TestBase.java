package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import fw.ApplicationManager;

public class TestBase {

    public static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        app.init();
    }

    @AfterSuite(enabled = false)
    public void tearDown() {
        app.stop();
    }

}

