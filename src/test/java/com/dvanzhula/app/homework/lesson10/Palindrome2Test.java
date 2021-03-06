package com.dvanzhula.app.homework.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class Palindrome2Test {

    public Palindrome2 palindrome;

    @Before
    public void createObjectTest(){
        palindrome = new Palindrome2();
    }
    @Test
    public void isPolindromeTrueTest(){
        String inputData = "noon";
        Assert.assertTrue("true",palindrome.isPolindrome(inputData));
    }
    @Test
    public void isPolindromeFalseTest(){
        String inputData = "noons";
        Assert.assertFalse("false",palindrome.isPolindrome(inputData));
    }
    @Test
    public void checkPolindromeTrueTest() {
        String inputData = "moom";
        Assert.assertTrue("true", palindrome.checkPolindrome(inputData));
    }
    @Test
    public void checkPolindromeFalseTest(){
        String inputData = "mooms";
        Assert.assertFalse("false",palindrome.checkPolindrome(inputData));
    }
    @Test
    public void determinePolindromeTrueTest() {
        String inputData = "dood";
        Assert.assertTrue("true", palindrome.determinePalindrome(inputData));
    }
    @Test
    public void determinePolindromeFalseTest() {
        String inputData = "dog";
        Assert.assertFalse("false", palindrome.determinePalindrome(inputData));
    }
}