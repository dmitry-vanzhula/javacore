package com.dvanzhula.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by dmitry on 15.10.16.
 */
public class Lesson5Calculator {


    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of program:");
        System.out.println("Number 1 - Right-angled triangle");
        System.out.println("Number 2 - Calculate circle area");
        System.out.println("Number 3 - Define if number is odd or even");
        System.out.println("Number 4 - What an number is bigger/smaller");
        int inputNumber = scanner.nextInt();
        if (inputNumber == 1) {
            Lesson5Calculator.rightAngledTriangleChecker();
        } else if (inputNumber == 2) {
            Lesson5Calculator.calculate();
        } else if (inputNumber == 3) {
            Lesson5Calculator.IsOdd();
        } else if (inputNumber == 4) {
            Lesson5Calculator.calculateBigger();
        } else {
            System.out.println("Error! Incorrect number");
        }
    }
    public static boolean rightAngledTriangleChecker() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        double b = scanner.nextDouble();
        System.out.println("Enter third number");
        double c = scanner.nextDouble();
        if (c * c == a * a + b * b) {
            System.out.println("This is right angled triangle");
            return true;
        } else {
            System.out.println("This is not right angled triangle");
            return false;
        }
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius ");
        double PI = Math.PI;
        double radius = scanner.nextDouble();
        double circleArea = PI * radius * radius;
        System.out.println("Area is " + circleArea);
    }

    public static boolean IsOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        boolean result = false;
        if (number % 2 > 0) {
            System.out.println("Number is odd");
            result = true;
        } else {
            System.out.println("Number is even");
        }
        return result;
    }

    public static final double PI = 3.14d;

    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter area1");
        double area1 = scanner.nextDouble();
        System.out.println("Enter area2");
        double area2 = scanner.nextDouble();

        if (area1 > area2) {
            System.out.println("Area1 is bigger");
        } else
            System.out.println("Area2 is bigger");
    }
}