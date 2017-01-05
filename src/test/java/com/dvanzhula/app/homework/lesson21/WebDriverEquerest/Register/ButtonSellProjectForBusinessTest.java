package com.dvanzhula.app.homework.lesson21.WebDriverEquerest.Register;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dmitry Vanzhula on 12/21/2016.
 */
public class ButtonSellProjectForBusinessTest extends FirefoxWebDriver {

    By headerTitle = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/h1");
    By sellProject = By.xpath(".//*[@id='registerBlock']/div/div[1]/div/div/a");
    String actualUrl ="";
    String expectedUrl = "https://dev.equerest.com/register#/";
    String actualHeaderTitle;
    String expectedHeaderTitle = "Регистрация вашего бизнес-проекта";

    @Before
    public void goToUrlTest() {
        driver.get(baseUrl + "register#/");
        Assert.assertEquals(expectedUrl,actualUrl = driver.getCurrentUrl());
    }

    @Description("Предпринимателю > Проверка работоспособности кнопки 'Подать проект'")
    @Test
    public void checkSellProjectTest(){
        WebElement button = driver.findElement(sellProject);
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerTitle));
        Assert.assertEquals(expectedHeaderTitle,actualHeaderTitle = driver.findElement(headerTitle).getText());
    }
}

