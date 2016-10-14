package com.dvanzhula.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dmitry on 12.10.16.
 */
public class MathFuncTest {
    @Test
    public void  multiplyTest(){
        int a = 1, b = 2, expRes =2;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(expRes, mathFunc.multiply (a, b));
    }
}
