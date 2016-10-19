package com.dvanzhula.app.homework;

import com.dvanzhula.app.classwork.lesson5.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 10/17/2016.
 */
public class CalculatorTest {
    @Test
    public void rightAngledTriangleCheckerTrueTest() {
        boolean expRes = true;
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.rightAngledTriangleChecker(6.0, 8.0, 10.0));
    }

    @Test
    public void rightAngledTriangleCheckerFalseTest() {
        boolean expRes = false;
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.rightAngledTriangleChecker(4.0, 6.0, 10.0));
    }

    @Test
    public void isOddOrEvenTrueTest() {
        boolean expRes = true;
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.isOddOrEven(7));
    }

    @Test
    public void isOddOrEvenFalseTest() {
        boolean expRes = false;
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.isOddOrEven(6));

    }

    static final double DELTA = 1e-15;

    @Test
    public void calculateCircleRadiusTest() {
        double expRes = 201.06192982974676d;
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.calculateCircleRadius(8.0d), DELTA);
    }

    @Test
    public void calculateBiggerTrueTest() {
        boolean expRes = true;
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.calculateBigger(8.5d, 7.5d));
    }

    @Test
    public void calculateBiggerFalseTest() {
        boolean expRes = false;
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.calculateBigger(7.5d, 8.5d));
    }

}
