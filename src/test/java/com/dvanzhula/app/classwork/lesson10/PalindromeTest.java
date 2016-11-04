package com.dvanzhula.app.classwork.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 11/4/2016.
 */
public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void createObject() {
        Palindrome palindrome = new Palindrome();
    }

    @Test
    public void isPalindromeTrueTest() {
        String inputData = "anna";
        Assert.assertTrue("true", palindrome.isPalindrome(inputData));
        }

    @Test
    public void isPalindromeFalseTest(){
        String inputData = "annas";
        Assert.assertFalse("false", palindrome.isPalindrome(inputData));
        }
    }

