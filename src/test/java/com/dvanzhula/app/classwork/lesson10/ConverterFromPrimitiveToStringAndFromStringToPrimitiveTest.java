package com.dvanzhula.app.classwork.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.dvanzhula.app.homework.lesson4.MathFunctionsTest.DELTA;

/**
 * Created by Dmitry Vanzhula on 11/4/2016.
 */
public class ConverterFromPrimitiveToStringAndFromStringToPrimitiveTest {

    public ConverterFromPrimitiveToStringAndFromStringToPrimitive converter;

    @Before
    public void createObject() {
        converter = new ConverterFromPrimitiveToStringAndFromStringToPrimitive();
    }

    @Test
    public void convertIntToStringTest() {
        int int1 = 10;
        String expRes = "10";
        Assert.assertEquals(expRes, converter.convertIntToString(int1));
    }

    @Test
    public void convertFloatToStringTest() {
        float float1 = 15.5f;
        String expRes = "15.5";
        Assert.assertEquals(expRes, converter.convertFloatToString(float1));
    }

    @Test
    public void convertDoubleToStringTest() {
        double double1 = 16.6d;
        String expRes = "16.6";
        Assert.assertEquals(expRes, converter.convertDoubleToString(double1));
    }

    @Test
    public void convertBooleanToStringTest() {
        boolean boolean1 = true;
        String expRes = "true";
        Assert.assertEquals(expRes, converter.convertBooleanToString(boolean1));
    }

    @Test
    public void convertStringToIntTest() {
        String string1 = "1";
        int expRes = 1;
        Assert.assertEquals(expRes, converter.convertStringToInt(string1));
    }

    @Test
    public void convertStringToFloatTest() {
        String string1 = "1.11";
        float expRes = 1.11f;
        Assert.assertEquals(expRes, converter.convertStringToFloat(string1), DELTA);
    }

    @Test
    public void convertStringToDoubleTest() {
        String string1 = "1.441";
        double expRes = 1.441d;
        Assert.assertEquals(expRes, converter.convertStringToDouble(string1), DELTA);
    }

    @Test
    public void convertStringToBooleanTest() {
        String string1 = "true";
        boolean expRes = true;
        Assert.assertEquals(expRes, converter.convertStringToBoolean(string1));

    }
}