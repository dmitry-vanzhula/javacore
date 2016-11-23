package com.dvanzhula.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 10/18/2016.
 */
public class PrimitiveConvertorTest {
    @Test
    public void floatToCharTest() {
        char expRes = 11;
        PrimitiveConverter convertor = new PrimitiveConverter();
        Assert.assertEquals(expRes, convertor.floatToChar(11.999f));
    }

    @Test
    public void intToCharTest() {
        char expRes = '*';
        PrimitiveConverter convertor = new PrimitiveConverter();
        Assert.assertEquals(expRes, convertor.intToChar(42));
    }

    @Test
    public void charToIntTest() {
        int expRes = 42;
        PrimitiveConverter convertor = new PrimitiveConverter();
        Assert.assertEquals(expRes, convertor.charToInt('*'));
    }
}
