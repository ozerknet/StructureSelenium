package com.cydeo.tests;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void T1(){
        Driver.getDriver().get("https://www.google.com");

    }
}
