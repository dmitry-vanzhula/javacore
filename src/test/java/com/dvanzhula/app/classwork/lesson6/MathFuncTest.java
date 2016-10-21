package com.dvanzhula.app.classwork.lesson6;

import com.dvanzhula.app.classwork.lesson4.MathFunctions;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by dmitry on 19.10.16.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFuncTest {

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void test_add(int argA, int argB, int expOut) {
        MathFunctions mathFunc = new MathFunctions();
        Assert.assertEquals(expOut, mathFunc.multiply(argA, argB));
    }
}