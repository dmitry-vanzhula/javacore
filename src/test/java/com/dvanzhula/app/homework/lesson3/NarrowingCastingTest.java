package com.dvanzhula.app.homework.lesson3;

import com.dvanzhula.app.classwork.lesson3.NarrowingCasting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 19.10.16.
 */
public class NarrowingCastingTest {

    NarrowingCasting narrowingCasting;

    @Before
    public void createObjectTest(){
        narrowingCasting = new NarrowingCasting();
    }
    @Test
    public void narrowingTest() {
        int expRes = 3;
        int int1 = 0;
        float float1 = 3.14159f;
        Assert.assertEquals(expRes, narrowingCasting.narrowing(int1, float1));
    }
}
