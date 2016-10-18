package com.dvanzhula.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by dmitry on 15.10.16.
 */
public class Lesson5Calculator {


    public static boolean rightAngledTriangleChecker(double a, double b, double c) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        double b = scanner.nextDouble();
        System.out.println("Enter third number");
        double c = scanner.nextDouble(); */ // changed logic of method without scanner
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
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius ");
        double radius = scanner.nextDouble(); */ // changed logic of method without scanner
        double PI = Math.PI;
        double circleArea = PI * radius * radius;
        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public static boolean isOddOrEven(int number) {
        /*Scanner scanner = new Scanner(System.in);
          System.out.println("Enter number");
          int number = scanner.nextInt();*/ // changed logic of method without scanner
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
        /*Scanner scanner = new Scanner(System.in);
          System.out.println("Enter area1");
          double area1 = scanner.nextDouble();
          System.out.println("Enter area2");
          double area2 = scanner.nextDouble();*/ // changed logic of method without scanner
        boolean result = false;
        if (area1 > area2) {
            System.out.println("Area1 is bigger");
            result = true;
        } else
            System.out.println("Area2 is bigger");
        return result;
    }
}