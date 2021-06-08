package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderButtonTest extends com.ilCarro.qa14.TestBase {
    @Test
    public void findSearchButtonTest() {
        findSearchButtonInHeader();
    }

    @Test
    public void findLetTheCatWorkButtonTest() {
        findLetTheCatWorkButtonInHeader();
    }

    @Test
    public void findTermOfUseButtonTest() {
        findTermOfUseButtonInHeader();
    }

    @Test
    public void findLoginButtonTest(){
        findLoginButtonInHeader();
    }

}
