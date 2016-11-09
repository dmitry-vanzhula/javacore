package com.dvanzhula.app.homework.Lesson6;

import com.dvanzhula.app.classwork.lesson3.WideningCasting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Dmitry Vanzhula on 10/21/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class WideningCastingDataDrivenTest {

    public static final double DELTA = 1e-15;
    public WideningCasting wideningCasting;

    @Before
    public void createObject(){
        wideningCasting = new WideningCasting();
    }

    @Test
    @FileParameters(value = "src/test/resources/wideningTestData.csv",
    mapper = CsvWithHeaderMapper.class)

    public void wideningTest(int argA, long argB, float argC, double argD, double expOut ){
        Assert.assertEquals(expOut, wideningCasting.widening(argA,argB,argC,argD),DELTA);
    }
}
