package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson5.Calculator;
import com.dvanzhula.runners.homework.OutputPrint;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 15.10.16.
 */


public class Lesson5Runner {

    public static void main(String[] args) {
        boolean exit = false;
        do {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose your program, enter a number 1-4:");
            System.out.println();
            System.out.println("Number 1 - Right-angled triangle");
            System.out.println("Number 2 - Calculate circle area");
            System.out.println("Number 3 - Define if number is odd or even");
            System.out.println("Number 4 - What an number is bigger/smaller");
            System.out.println("Number 5 - Exit");
            try {
                Calculator calculator = new Calculator();
                int inputNumber = scanner.nextInt();

                switch (inputNumber) {
                    case 1:
                        System.out.println("Enter first length");
                        double a = scanner.nextDouble();
                        System.out.println("Enter second length");
                        double b = scanner.nextDouble();
                        System.out.println("Enter third length");
                        double c = scanner.nextDouble();
                        if(calculator.rightAngledTriangleChecker(a, b, c)){
                            System.out.println("This is right angled triangle");
                        }else {
                            System.out.println("This is not right angled triangle");
                        }
                        break;
                    case 2:
                        System.out.println("Enter circle radius ");
                        double radius = scanner.nextDouble();
                        OutputPrint.showOutputResultForCircleRadius(calculator.calculateCircleRadius(radius));
                        break;
                    case 3:
                        System.out.println("Enter number");
                        int number = scanner.nextInt();
                        if(calculator.isOddOrEven(number)){
                            System.out.println("Number is odd");
                        }else {
                            System.out.println("Number is even");
                        }
                        break;
                    case 4:
                        System.out.println("Enter area1");
                        double area1 = scanner.nextDouble();
                        System.out.println("Enter area2");
                        double area2 = scanner.nextDouble();
                        if(calculator.calculateBigger(area1, area2)){
                            System.out.println("Area1 is bigger");
                        }else {
                            System.out.println("Area2 is bigger");
                        }
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Error! Incorrect number");
                        break;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number");
            }
        } while (exit != true);
    }
}
