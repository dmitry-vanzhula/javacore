package com.dvanzhula.app.homework.Lesson6;

import com.dvanzhula.app.classwork.lesson3.NarrowingCasting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Dmitriy on 10/21/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class NarrowingCastingDataDrivenTest {

    @Test
    @FileParameters(value = "src/test/resources/narrowingTestData.csv",
    mapper = CsvWithHeaderMapper.class)

    public void narrowingTest(int argA, float argB, int expOut){
        Assert.assertEquals(expOut,NarrowingCasting.narrowing(argA,argB));
    }

}