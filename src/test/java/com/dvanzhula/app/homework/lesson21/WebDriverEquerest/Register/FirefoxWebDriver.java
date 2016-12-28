package com.dvanzhula.app.homework.lesson21.WebDriverEquerest.Register;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Dmitry Vanzhula on 12/21/2016.
 */
public  abstract class FirefoxWebDriver {

    WebDriver driver;
    String baseUrl = "https://dev.equerest.com/";

    @Before
    public void setUpFirefoxDriver (){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    public void closeDriver(){
        driver.close();
    }

}
