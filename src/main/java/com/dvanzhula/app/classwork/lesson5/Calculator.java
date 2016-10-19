package com.dvanzhula.app.classwork.lesson5;

/**
 * Created by dmitry on 15.10.16.
 */
public class Calculator {

    public static boolean rightAngledTriangleChecker(double a, double b, double c) {
        boolean result = false;
        if (c * c == a * a + b * b) {
            System.out.println("This is right angled triangle");
            result = true;
        } else {
            System.out.println("This is not right angled triangle");
        }
        return result;
    }

    private static final double PI = 3.14d;

    public static double calculateCircleRadius(double radius) {
        double PI = Math.PI;
        double circleArea = PI * radius * radius;
        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public static boolean isOddOrEven(int number) {
        boolean result = false;
        if (number % 2 > 0) {
            System.out.println("Number is odd");
            result = true;
        } else {
            System.out.println("Number is even");
        }
        return result;
    }

    public static boolean calculateBigger(double area1, double area2) {
        boolean result = false;
        if (area1 > area2) {
            System.out.println("Area1 is bigger");
            result = true;
        } else
            System.out.println("Area2 is bigger");
        return result;
    }
}