package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    static WebDriver wd;

    @BeforeSuite
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }

    public boolean isElementPresent(By by) {
        return wd.findElements(by).size() > 0;
    }

    public boolean isElementPresent1(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void logout() {
        click(By.xpath("//a[contains(.,'logOut')]"));
    }

    public boolean isSignUpButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void isSignUpFormPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
    }

    public void type(By locator, String text) {
        if (text!=null) {
            click(locator);
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void submit() {
        click(By.cssSelector("[type='submit']"));
    }

    public void isLogoutTabPresent() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(.,'logOut')]")));
    }

    public void jumpToFooter() {
        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public boolean isFindCarFormPresent() {
        return isElementPresent1(By
                .cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

    public void clickOnLoginTab() {
        click(By.xpath("//ul[@class='header__nav desktop']/li[5]"));
    }

    public void fillLoginForm(User user) {
        type(By.cssSelector("[name='email']"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    public void logIn() {
        clickOnLoginTab();
        type(By.cssSelector("[name='email']"),"hummels@gmail.com");
        type(By.name("password"),"Hummels098765");
        submit();
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(.,'logOut')]"));
    }

    public void pause() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void clickOnAddCarTab() {
        click(By.xpath("//ul[@class='header__nav desktop']/li[2]"));
    }

    public void fillCarForm(Car car) {
        type(By.cssSelector(".country"), car.getCountry());
        type(By.cssSelector(".address"), car.getAddress());
        type(By.cssSelector(".distance_included"), car.getDistance());
    }

    public void isLogInFormPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".Login_login__right_block__1niYm")));
    }

    public void clickCheckPolicy() {
        click(By.cssSelector("#check_policy"));
    }

    public void clickOnSignUpTab() {
        click(By.cssSelector("[href='/signup']"));
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("#first_name"), user.getFirstName());
        type(By.cssSelector("#second_name"), user.getSecondName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
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

    public void isFutterBunnerPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector("[class='footer__red_text'] ")));
    }
}

