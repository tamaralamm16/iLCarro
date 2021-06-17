package com.ilCarro.qa14.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FooterHelper extends HelperBase {
    public FooterHelper(WebDriver wd) {
        super(wd);
    }

    public void jumpToFooter() {
        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void isFutterBunnerPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("[class='footer__red_text'] ")));
    }
}
