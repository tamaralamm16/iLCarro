package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderButtonTest extends com.ilCarro.qa14.TestBase {
    @Test
    public void findSearchButtonTest() {
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(1)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(1)")));
    }
    @Test
    public void findLetTheCatWorkButtonTest() {
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(2)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(2)")));
    }
    @Test
    public void findTermOfUseButtonTest() {
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(3)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class='container-full']")));
    }
    @Test
    public void findLoginButtonTest(){
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(5)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(5)")));
    }

}
