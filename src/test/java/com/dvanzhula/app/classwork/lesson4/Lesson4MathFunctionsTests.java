package com.dvanzhula.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dmitry on 12.10.16.
 */
public class Lesson4MathFunctionsTests {
    @Test
    public void  multiplyTest(){
        int a = 1, b = 2, expRes =2;
        Lesson4MathFunctions mathFunc = new Lesson4MathFunctions();
        Assert.assertEquals(expRes, mathFunc.multiply (a, b));
    }

    @Test
    public void additionTest(){
        String a = "Hello ", b = "world", expRes = "Hello world";
        Lesson4MathFunctions mathFunc = new Lesson4MathFunctions();
        Assert.assertEquals(expRes,mathFunc.addition(a,b) );
    }

    @Test
    public void subtractionTest(){
        int a = 5, b = 4, expRes = 1;
        Lesson4MathFunctions mathFunc = new Lesson4MathFunctions();
        Assert.assertEquals(expRes,mathFunc.subtraction(a,b));
    }

    public static final double DELTA = 1e-15;
    @Test

    public void chooseMaxNumberTest (){
        double a = 1.1d, b = 2.2d, expRes = 2.2d;
        Lesson4MathFunctions mathFunc = new Lesson4MathFunctions();
        Assert.assertEquals(expRes,mathFunc.chooseMaxNumber(a,b), DELTA);
    }

    @Test
    public void getSquareRoot(){
        double a = 25.0d, expRes = 5.0;
        Lesson4MathFunctions mathFunc = new Lesson4MathFunctions();
        Assert.assertEquals(expRes,mathFunc.getSquareRoot(a), DELTA);
    }

    @Test
    public void powerTest(){
        double a = 2.0, b = 3.0, expRes = 9.0;
        Lesson4MathFunctions mathFunc = new Lesson4MathFunctions();
        Assert.assertNotEquals(expRes, mathFunc.power(a,b), DELTA);
    }

    @Test
    public void isEvenNumberTest(){
        int number = 4;
        Lesson4MathFunctions mathFunc = new Lesson4MathFunctions();
        Assert.assertTrue(mathFunc.isEvenNumber(number));
    }
}