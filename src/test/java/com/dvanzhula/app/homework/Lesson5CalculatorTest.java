package com.dvanzhula.app.homework;

import com.dvanzhula.app.classwork.lesson5.Lesson5Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 10/17/2016.
 */
public class Lesson5CalculatorTest {
    @Test
    public void rightAngledTriangleCheckerTrueTest() {
        boolean expRes = true;
        Lesson5Calculator calculator = new Lesson5Calculator();
        Assert.assertEquals(expRes, calculator.rightAngledTriangleChecker(6.0, 8.0, 10.0));
    }

    @Test
    public void rightAngledTriangleCheckerFalseTest() {
        boolean expRes = false;
        Lesson5Calculator calculator = new Lesson5Calculator();
        Assert.assertEquals(expRes, calculator.rightAngledTriangleChecker(4.0, 6.0, 10.0));
    }

    @Test
    public void isOddOrEvenTrueTest() {
        boolean expRes = true;
        Lesson5Calculator calculator = new Lesson5Calculator();
        Assert.assertEquals(expRes, calculator.isOddOrEven(7));
    }

    @Test
    public void isOddOrEvenFalseTest() {
        boolean expRes = false;
        Lesson5Calculator calculator = new Lesson5Calculator();
        Assert.assertEquals(expRes, calculator.isOddOrEven(6));

    }

    static final double DELTA = 1e-15;

    @Test
    public void calculateCircleRadiusTest() {
        double expRes = 201.06192982974676d;
        Lesson5Calculator calculator = new Lesson5Calculator();
        Assert.assertEquals(expRes, calculator.calculateCircleRadius(8.0d), DELTA);
    }

    @Test
    public void calculateBiggerTrueTest() {
        boolean expRes = true;
        Lesson5Calculator calculator = new Lesson5Calculator();
        Assert.assertEquals(expRes, calculator.calculateBigger(8.5d, 7.5d));
    }

    @Test
    public void calculateBiggerFalseTest() {
        boolean expRes = false;
        Lesson5Calculator calculator = new Lesson5Calculator();
        Assert.assertEquals(expRes, calculator.calculateBigger(7.5d, 8.5d));
    }

    }
