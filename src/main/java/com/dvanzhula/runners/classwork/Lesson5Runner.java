package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson5.Calculator;

import java.util.Scanner;

/**
 * Created by dmitry on 15.10.16.
 */


public class Lesson5Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your program, enter a number 1-4:");
        System.out.println("Number 1 - Right-angled triangle");
        System.out.println("Number 2 - Calculate circle area");
        System.out.println("Number 3 - Define if number is odd or even");
        System.out.println("Number 4 - What an number is bigger/smaller");
        try {
            int inputNumber = scanner.nextInt();

            if (inputNumber == 1) {
                System.out.println("Enter first number");
                double a = scanner.nextDouble();
                System.out.println("Enter second number");
                double b = scanner.nextDouble();
                System.out.println("Enter third number");
                double c = scanner.nextDouble();
                Calculator.rightAngledTriangleChecker(a, b, c);
            } else if (inputNumber == 2) {
                System.out.println("Enter circle radius ");
                double radius = scanner.nextDouble();
                Calculator.calculateCircleRadius(radius);

            } else if (inputNumber == 3) {
                System.out.println("Enter number");
                int number = scanner.nextInt();
                Calculator.isOddOrEven(number);

            } else if (inputNumber == 4) {
                System.out.println("Enter area1");
                double area1 = scanner.nextDouble();
                System.out.println("Enter area2");
                double area2 = scanner.nextDouble();
                Calculator.calculateBigger(area1,area2);

            } else {
                System.out.println("Error! Incorrect number");

            }
        } catch (java.util.InputMismatchException e1) {
            System.out.println("Error, wrong input. Please enter a valid number");
        }
    }
}

