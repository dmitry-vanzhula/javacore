package com.dvanzhula.app.homework;

import com.dvanzhula.app.classwork.lesson3.Lesson3NarrowingCasting;
import com.dvanzhula.app.classwork.lesson3.Lesson3WideningCasting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 10/17/2016.
 */
public class Lesson3CastingTests {
    @Test
    public void narrowingTest(){
        int expRes = 3;
        int int1 = 0;
        float float1 = 3.14159f;
        Lesson3NarrowingCasting narrowingCasting = new Lesson3NarrowingCasting();
        Assert.assertEquals(expRes,narrowingCasting.narrowing(int1,float1));
    }
    static final double DELTA = 1e-15;
    @Test
    public void wideningTest(){
        double expRes = 127.0;
        float float1 = 0.0f;
        long long1 = 0L;
        int int1 = 127;
        double double1 = 0.0d;
        Lesson3WideningCasting wideningCasting = new Lesson3WideningCasting();
        Assert.assertEquals(expRes,wideningCasting.widening(int1,long1,float1,double1),DELTA);
    }
}
