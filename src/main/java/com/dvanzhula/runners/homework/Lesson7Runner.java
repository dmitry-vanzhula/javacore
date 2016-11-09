package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.Lesson7.LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 10/24/2016.
 */
public class Lesson7Runner {
    public static void main(String[] args) {
        boolean exit = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Enter a number 1-7:");
            System.out.println(" ");
            System.out.println("Number 1 - Show all even numbers in an array");
            System.out.println("Number 2 - Show all odd numbers in an array");
            System.out.println("Number 3 - Count the number of even numbers in an array (array filled with random numbers)");
            System.out.println("Number 4 - Determine the minimum number of array (array filled with random numbers)");
            System.out.println("Number 5 - Determine the maximum number of array (array filled with random numbers)");
            System.out.println("Number 6 - Show multidimensional array (array filled with random numbers)");
            System.out.println("Number 7 - Exit");
            try {
                int arrayLength;
                int arrayLength2;
                int min;
                int max;
                int [] array;
                int [] arrayOfRandomNumbers;
                int inputNumber = scanner.nextInt();
                LoopsAndArrays loopsAndArrays = new LoopsAndArrays();
                switch (inputNumber) {
                    case 1:
                        System.out.println("Enter array length");
                        arrayLength = scanner.nextInt();
                        array = loopsAndArrays.createArray(arrayLength);
                        System.out.println("Even numbers are:");
                        OutputPrint.showOutputResultForArrays(loopsAndArrays.showAnArrayOfEvenNumbers(array));
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Enter array length");
                        arrayLength = scanner.nextInt();
                        array = loopsAndArrays.createArray(arrayLength);
                        System.out.println("Odd numbers are:");
                        OutputPrint.showOutputResultForArrays2(loopsAndArrays.showAnArrayOfOddNumbers(array));
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Enter array length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Enter the minimum boundary");
                        min = scanner.nextInt();
                        System.out.println("Enter the maximum boundary");
                        max = scanner.nextInt();
                        System.out.print("Random array: ");
                        OutputPrint.showOutputResultForArrays(arrayOfRandomNumbers = loopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,min,max));
                        System.out.print("Even numbers are:");
                        System.out.print(" ");
                        OutputPrint.showOutputResultForHowManyEvenNumbers(loopsAndArrays.calculateHowManyEvenNumbers(arrayOfRandomNumbers));
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 4:
                        System.out.println("Enter array length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Enter the minimum boundary");
                        min = scanner.nextInt();
                        System.out.println("Enter the maximum boundary");
                        max = scanner.nextInt();
                        System.out.print("Random array: ");
                        OutputPrint.showOutputResultForArrays(arrayOfRandomNumbers = loopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,min,max));
                        System.out.print("Minimum number is:");
                        System.out.print(" ");
                        OutputPrint.showOutputResultForMinAndMaxNumber((loopsAndArrays.showMinNumber(arrayOfRandomNumbers)));
                        break;
                    case 5:
                        System.out.println("Enter array length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Enter minimum boundary");
                        min = scanner.nextInt();
                        System.out.println("Enter maximum boundary");
                        max = scanner.nextInt();
                        System.out.print("Random array: ");
                        OutputPrint.showOutputResultForArrays(arrayOfRandomNumbers = loopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,min,max));
                        System.out.print("Maximum number is:");
                        System.out.print(" ");
                        OutputPrint.showOutputResultForMinAndMaxNumber(loopsAndArrays.showMaxNumber(arrayOfRandomNumbers));
                        break;
                    case 6:
                        System.out.println("Enter length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Enter length 2");
                        arrayLength2 = scanner.nextInt();
                        System.out.println("Enter minimum boundary");
                        min = scanner.nextInt();
                        System.out.println("Enter maximum boundary");
                        max = scanner.nextInt();
                        //LoopsAndArrays.showMultidimensionalArrayOfRandomNumbers(arrayLength, arrayLength2, min, max);
                        System.out.println("Array:");
                        OutputPrint.showOutputResultForMultidimensionalArray(loopsAndArrays.showMultidimensionalArrayOfRandomNumbers(arrayLength, arrayLength2, min, max));
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Error, wrong input. Please enter a valid number!");
                        break;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        }while (exit != true);
    }
}