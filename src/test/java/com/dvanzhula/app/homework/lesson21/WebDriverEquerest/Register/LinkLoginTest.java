package com.dvanzhula.app.homework.lesson21.WebDriverEquerest.Register;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Dmitry Vanzhula on 12/21/2016.
 */
public class LinkLoginTest extends FirefoxWebDriver {

    By login = By.xpath(".//*[@id='header']/div/nav/div[2]/p/a");
    By blockLogin = By.xpath(".//*[@id='login-block']/h3");
    String actualBlockLogin = "";
    String expectedBlockLogin = "Войти";
    String actualURL;
    String expectedURL = "https://dev.equerest.com/";

    @Before
    public void goToUrlTest() {
        driver.get(baseUrl);
        Assert.assertEquals(expectedURL,actualURL = driver.getCurrentUrl());
    }

    @Description("Проверка работоспособности кнопки 'Войти'")
    @Test
    public void checkLoginTest(){
        WebElement button = driver.findElement(login);
        button.click();
        Assert.assertEquals(expectedBlockLogin,actualBlockLogin = driver.findElement(blockLogin).getText());
        }
    }