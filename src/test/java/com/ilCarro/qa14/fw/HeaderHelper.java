package com.ilCarro.qa14.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HeaderHelper extends HelperBase {
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void isLogoutTabPresent() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(.,'logOut')]")));
    }

    public void clickOnSignUpTab() {
        click(By.cssSelector("[href='/signup']"));
    }

    public void checkSearchPageLounch() {
        click(By.xpath("//ul[@class='header__nav desktop']/li[1]"));
        Assert.assertTrue(isElementPresent1(By.cssSelector(".search-sidebar__content")));
    }

    public void findSearchButtonInHeader() {
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(1)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(1)")));
    }

    public void findLetTheCatWorkButtonInHeader() {
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(2)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(2)")));
    }

    public void findTermOfUseButtonInHeader() {
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(3)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class='container-full']")));
    }

    public void findLoginButtonInHeader() {
        click(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(5)"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[class=\"header__nav desktop\"] li:nth-of-type(5)")));
    }
}
