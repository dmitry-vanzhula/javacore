package com.dvanzhula.app.homework.Lesson5;

import com.dvanzhula.app.classwork.lesson5.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 10/17/2016.
 */
public class CalculatorTest {

    static final double DELTA = 1e-15;
    Calculator calculator;

    @Before
    public void createObjectTest() {
        calculator = new Calculator();
    }

    @Test
    public void rightAngledTriangleCheckerTrueTest() {
        Assert.assertEquals(true, calculator.rightAngledTriangleChecker(6.0, 8.0, 10.0));
    }

    @Test
    public void rightAngledTriangleCheckerFalseTest() {
        Assert.assertEquals(false, calculator.rightAngledTriangleChecker(4.0, 6.0, 10.0));
    }

    @Test
    public void isOddOrEvenTrueTest() {
        Assert.assertEquals(true, calculator.isOddOrEven(7));
    }

    @Test
    public void isOddOrEvenFalseTest() {
        Assert.assertEquals(false, calculator.isOddOrEven(6));
    }

    @Test
    public void calculateCircleRadiusTest() {
        double expRes = 201.06192982974676d;
        Assert.assertEquals(expRes, calculator.calculateCircleRadius(8.0d), DELTA);
    }

    @Test
    public void calculateBiggerTrueTest() {
        Assert.assertEquals(true, calculator.calculateBigger(8.5d, 7.5d));
    }

    @Test
    public void calculateBiggerFalseTest() {
        Assert.assertEquals(false, calculator.calculateBigger(7.5d, 8.5d));
    }
}
