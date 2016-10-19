package com.dvanzhula.app.homework;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 10/18/2016.
 */
public class Lesson3PrimitiveConvertorTests {
    @Test
    public void floatToCharTest(){
       char expRes = 11;
       Lesson3PrimitiveConvertor convertor = new Lesson3PrimitiveConvertor();
       Assert.assertEquals(expRes,convertor.floatToChar(11.999f));
    }

    @Test
    public void intToCharTest(){
        char expRes = '*';
        Lesson3PrimitiveConvertor convertor = new Lesson3PrimitiveConvertor();
        Assert.assertEquals(expRes,convertor.intToChar(42));
    }
    @Test
    public void charToIntTest(){
        int expRes = 42;
        Lesson3PrimitiveConvertor convertor = new Lesson3PrimitiveConvertor();
        Assert.assertEquals(expRes,convertor.charToInt('*'));
    }
}
