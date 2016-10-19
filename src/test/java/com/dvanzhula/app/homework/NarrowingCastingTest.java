package com.dvanzhula.app.homework;

import com.dvanzhula.app.classwork.lesson3.NarrowingCasting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dmitry on 19.10.16.
 */
public class NarrowingCastingTest {
    @Test
    public void narrowingTest(){
        int expRes = 3;
        int int1 = 0;
        float float1 = 3.14159f;
        NarrowingCasting narrowingCasting = new NarrowingCasting();
        Assert.assertEquals(expRes,narrowingCasting.narrowing(int1,float1));
    }
}
