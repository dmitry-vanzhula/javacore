package com.dvanzhula.app.homework.Lesson3;

import com.dvanzhula.app.classwork.lesson3.WideningCasting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 10/17/2016.
 */
public class WideningCastingTest {

    public static final double DELTA = 1e-15;

    @Test
    public void wideningTest() {
        double expRes = 127.0;
        float float1 = 0.0f;
        long long1 = 0L;
        int int1 = 127;
        double double1 = 0.0d;
        WideningCasting wideningCasting = new WideningCasting();
        Assert.assertEquals(expRes, wideningCasting.widening(int1, long1, float1, double1), DELTA);
    }
}
