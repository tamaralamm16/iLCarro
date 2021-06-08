package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JumpToFooterTest extends com.ilCarro.qa14.TestBase {
    @Test
    public void jumpToFooter(){
        jumpToFooter();
        Assert.assertTrue(isElementPresent(By.cssSelector("[class='footer__red_text'] ")));
    }

}