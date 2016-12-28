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
 * Created by Dmitry Vanzhula on 12/27/2016.
 */
public class ValidAuthorizationTest extends FirefoxWebDriver {

    String actualRegisterUrl;
    String expectedRegisterUrl = "https://dev.equerest.com/register#/";
    By email = By.xpath(".//*[@id='email']");
    By password = By.xpath(".//*[@id='password']");
    By submitButton = By.xpath(".//*[@id='submit-block']/button[1]");
    By uniqueFieldAmountOfInvestment = By.xpath(".//*[@id='dashboard']/div[1]/project-edit/div/div/section[1]/div[2]/div/div[3]/div/div[2]/div[12]/label");
    By amountOfInvestment = By.xpath(".//*[@id='anchor-full_description']/h3");
    String actualEmailId = "";
    String expectedEmailId = "email";
    String actualPasswordId = "";
    String expectedPasswordId = "password";
    String actualUrl = "";
    String expectedUrl = "https://dev.equerest.com/dashboard#/projects/edit";
    String actualUniqueFieldTitle = "";
    String expectedUniqueFieldTitle = "Сумма инвестиций";

    @Before
    public void goToUrlTest() {
        driver.get(baseUrl + "register#/");
        Assert.assertEquals(expectedRegisterUrl,actualRegisterUrl = driver.getCurrentUrl());
    }

    @Description("Проверка авторизации с валидными тест данными")
    @Test
    public void validSignInTest() throws Exception{
        WebElement fieldEmail = driver.findElement(email);
        fieldEmail.click();
        fieldEmail.clear();
        fieldEmail.sendKeys("link@gmail.com");
        Assert.assertEquals(expectedEmailId,actualEmailId = driver.findElement(email).getAttribute("id"));
        WebElement fieldPass = driver.findElement(password);
        fieldPass.clear();
        fieldPass.click();
        fieldPass.sendKeys("Link7777");
        Assert.assertEquals(expectedPasswordId,actualPasswordId = driver.findElement(password).getAttribute("id"));
        WebElement button = driver.findElement(submitButton);
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(amountOfInvestment));
        Assert.assertEquals(expectedUrl,actualUrl = driver.getCurrentUrl());
        Assert.assertEquals(expectedUniqueFieldTitle,actualUniqueFieldTitle = driver.findElement(uniqueFieldAmountOfInvestment).getText());
    }
}
