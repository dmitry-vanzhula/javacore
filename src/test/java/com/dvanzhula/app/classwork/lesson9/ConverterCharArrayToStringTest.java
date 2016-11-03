package com.dvanzhula.app.classwork.lesson9;

import com.dvanzhula.app.classwork.Lesson9.ConverterCharArrayToString;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 11/2/2016.
 */
public class ConverterCharArrayToStringTest {
    @Test
    public void fillArrayOfAsciiCharactersLengthTest(){
        char[] arrayLength = new char[10];
        Assert.assertEquals(arrayLength,ConverterCharArrayToString.fillArrayOfAsciiCharacters(arrayLength));
    }

    @Test
    public void fillArrayOfAsciiCharactersTest(){
        char[] arrayLength = new char[10];
        char[] expRes = {'0','1','2','3','4','5','6','7','8','9'};
        Assert.assertArrayEquals(expRes,ConverterCharArrayToString.fillArrayOfAsciiCharacters(arrayLength));
    }
}
