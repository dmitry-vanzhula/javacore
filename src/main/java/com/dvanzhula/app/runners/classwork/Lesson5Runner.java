package com.dvanzhula.app.runners.classwork;

import com.dvanzhula.app.classwork.lesson5.Lesson5Calculator;

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
                Lesson5Calculator.rightAngledTriangleChecker(6, 8, 10);


            } else if (inputNumber == 2) {
                Lesson5Calculator.calculateCircleRadius(8.0);

            } else if (inputNumber == 3) {
                Lesson5Calculator.isOddOrEven(3);

            } else if (inputNumber == 4) {
                Lesson5Calculator.calculateBigger(5.5d, 6.6d);

            } else {
                System.out.println("Error! Incorrect number");

            }
        } catch (java.util.InputMismatchException e1){
            System.out.println("Error, wrong input. Please enter a valid number");
        }
    }
}

