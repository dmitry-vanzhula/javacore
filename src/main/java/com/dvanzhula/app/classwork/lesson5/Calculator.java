package com.dvanzhula.app.classwork.lesson5;

/**
 * Created by Dmitry Vanzhula on 15.10.16.
 */
public class Calculator {

    private static final double PI = 3.14d;

    public boolean rightAngledTriangleChecker(double a, double b, double c) {
        boolean result;
        if (c * c == a * a + b * b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public double calculateCircleRadius(double radius) {
        double PI = Math.PI;
        double circleArea = PI * radius * radius;
        return circleArea;
    }

    public boolean isOddOrEven(int number) {
        boolean result;
        if (number % 2 > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean calculateBigger(double area1, double area2) {
        boolean result;
        if (area1 > area2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}