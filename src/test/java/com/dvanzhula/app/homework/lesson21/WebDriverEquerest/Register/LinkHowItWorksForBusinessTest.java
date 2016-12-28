package com.dvanzhula.app.homework.lesson21.WebDriverEquerest.Register;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Dmitry Vanzhula on 12/27/2016.
 */
public class LinkHowItWorksForBusinessTest extends FirefoxWebDriver {

    By howItWorks = By.xpath(".//*[@id='registerBlock']/div/div[1]/span/a");
    By bannerTitle = By.xpath(".//*[@id='banner']/div/div[1]/div/h1");
    String expectedUrl = "https://dev.equerest.com/register#/";
    String actualUrl = "";
    String expectedHeaderBannerTitle = "Найдем инвестора для вашего бизнеса";
    String actualHeaderBannerTitle = "";

    @Before
    public void goToUrlTest() {
        driver.get(baseUrl + "register#/");
        Assert.assertEquals(expectedUrl,actualUrl = driver.getCurrentUrl());
    }

    @Description("Проверка работоспособности ссылки 'Как это работает?'")
    @Test
    public void checkLinkHowItWorksTest(){
        WebElement link = driver.findElement(howItWorks);
        link.click();
        Assert.assertEquals(expectedHeaderBannerTitle,actualHeaderBannerTitle = driver.findElement(bannerTitle).getText());
    }
}