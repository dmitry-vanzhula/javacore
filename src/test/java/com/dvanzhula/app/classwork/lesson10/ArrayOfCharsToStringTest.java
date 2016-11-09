package com.dvanzhula.app.classwork.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class ArrayOfCharsToStringTest {

    public ArrayOfCharsToString arrayOfCharsToString = new ArrayOfCharsToString();

    @Before
        public void createObjectTest(){
        arrayOfCharsToString = new ArrayOfCharsToString();
    }
    @Test
    public void convertCharToStringTest(){
        char[]array = {'k','o','i','l'};
        String expRes = "k,o,i,l";
        Assert.assertEquals(expRes,arrayOfCharsToString.convertCharToString(array));
    }

}