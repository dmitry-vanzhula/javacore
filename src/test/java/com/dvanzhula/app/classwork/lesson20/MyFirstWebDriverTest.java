package com.dvanzhula.app.classwork.lesson20;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Dmitry Vanzhula on 12/7/16.
 */
public class MyFirstWebDriverTest {

    By searchField = By.name("q");
    //By serchResultElementsLink = By.xpath("//*[@class='g']//a");


    @Test
    public void myFirstDriverTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        WebElement serchInput = driver.findElement(searchField);
        serchInput.sendKeys("Monkey");
        serchInput.submit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> linkList = driver.findElements(By.xpath("//*[@class='g']//a"));
        System.out.println(linkList.size());
        Assert.assertTrue(linkList.get(0).getText().contains("Monkey"));

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // driver.close();
    }
}