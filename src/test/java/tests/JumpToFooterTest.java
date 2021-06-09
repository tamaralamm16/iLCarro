package tests;

import org.testng.annotations.Test;

public class JumpToFooterTest extends TestBase {
    @Test
    public void jumpToFooter(){
        jumpToFooter();
        app.footer.isFutterBunnerPresent();
    }

}