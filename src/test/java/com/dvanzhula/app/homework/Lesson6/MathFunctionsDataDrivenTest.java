package com.dvanzhula.app.homework.lesson6;

import com.dvanzhula.app.classwork.lesson4.MathFunctions;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by Dmitry Vanzhula on 10/20/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFunctionsDataDrivenTest {

    public static final double DELTA = 1e-15;

    @Test
    @FileParameters(value = "src/test/resources/multiplyTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void multiplyTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.multiply(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/additionTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void additionTest(String argA, String argB, String expOut) {
        Assert.assertEquals(expOut, MathFunctions.addition(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/subtractionTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void subtractionTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunctions.subtraction(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/chooseMaxNumberTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void chooseMaxNumberTest(double argA, double argB, double expOut) {
        Assert.assertEquals(expOut, MathFunctions.chooseMaxNumber(argA, argB), DELTA);
    }

    @Test
    @FileParameters(value = "src/test/resources/getSquareRootTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void getSquareRootTest(double argA, double expOut) {
        Assert.assertEquals(expOut, MathFunctions.getSquareRoot(argA), DELTA);
    }

    @Test
    @FileParameters(value = "src/test/resources/powerTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void powerTest(double argA, double argB, double expOut) {
        Assert.assertEquals(expOut, MathFunctions.power(argA, argB), DELTA);
    }

    @Test
    @FileParameters(value = "src/test/resources/isOddNumberTrueTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void isOddNumberTrueTest(int argA) {
        Assert.assertEquals(true, MathFunctions.isOddNumber(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/isOddNumberFalseTestData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void isOddNumberFalseTest(int argA) {
        Assert.assertEquals(false, MathFunctions.isOddNumber(argA));
    }

}