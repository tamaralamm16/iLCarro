package com.ilCarro.qa14.tests;

import org.testng.annotations.Test;

public class HeaderButtonTest extends TestBase {
    @Test
    public void findSearchButtonTest() {
        app.header().findSearchButtonInHeader();
    }

    @Test
    public void findLetTheCatWorkButtonTest() {
        app.header().findLetTheCatWorkButtonInHeader();
    }

    @Test

    public void findTermOfUseButtonTest() {
        app.header().findTermOfUseButtonInHeader();
    }

    @Test
    public void findLoginButtonTest(){
        app.header().findLoginButtonInHeader();
    }

}
