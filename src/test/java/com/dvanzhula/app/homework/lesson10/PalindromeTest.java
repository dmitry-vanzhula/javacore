package com.dvanzhula.app.homework.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class PalindromeTest {

    public Palindrome palindrome;

    @Before
    public void createObjectTest(){
        Palindrome palindrome = new Palindrome();
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
        Assert.assertTrue("false", palindrome.determinePalindrome(inputData));
    }
}
