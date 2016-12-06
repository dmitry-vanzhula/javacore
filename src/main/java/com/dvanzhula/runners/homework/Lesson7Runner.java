package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson16.EnumMenuForHomeworkRunners;
import com.dvanzhula.app.homework.lesson7.LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 10/24/2016.
 */
public class Lesson7Runner {
    public static void main(String[] args) {
        boolean exit = false;
        do {
            System.out.println("");
            System.out.println("Enter a letter:");
            EnumMenuForHomeworkRunners.A.setDescription("Letter A - Create a new array of even numbers");
            EnumMenuForHomeworkRunners.B.setDescription("Letter B - Create a new array of odd numbers");
            EnumMenuForHomeworkRunners.C.setDescription("Letter C - Count the number of even numbers in an array (array filled with random numbers)");
            EnumMenuForHomeworkRunners.D.setDescription("Letter D - Determine the minimum number of array (array filled with random numbers)");
            EnumMenuForHomeworkRunners.E.setDescription("Letter E - Determine the maximum number of array (array filled with random numbers)");
            EnumMenuForHomeworkRunners.F.setDescription("Letter F - Create a new multidimensional array (array filled with random numbers)");
            EnumMenuForHomeworkRunners.G.setDescription("Letter G - Exit");
            for(EnumMenuForHomeworkRunners enumMenu : EnumMenuForHomeworkRunners.values()){
                System.out.println(enumMenu.getDescription());
            }
            try {
                int arrayLength;
                int arrayLength2;
                int min;
                int max;
                int [] array;
                int [] arrayOfRandomNumbers;
                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();
                LoopsAndArrays loopsAndArrays = new LoopsAndArrays();
                EnumMenuForHomeworkRunners enumMenu = EnumMenuForHomeworkRunners.valueOf(choice);
                switch (enumMenu) {
                    case A:
                        System.out.println("Enter array length");
                        arrayLength = scanner.nextInt();
                        array = loopsAndArrays.createArray(arrayLength);
                        System.out.println("Even numbers are:");
                        OutputPrint.showOutputResultForArrays(loopsAndArrays.showAnArrayOfEvenNumbers(array));
                        break;
                    case B:
                        System.out.println("Enter array length");
                        arrayLength = scanner.nextInt();
                        array = loopsAndArrays.createArray(arrayLength);
                        System.out.println("Odd numbers are:");
                        OutputPrint.showOutputResultForArrays2(loopsAndArrays.showAnArrayOfOddNumbers(array));
                        break;
                    case C:
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
                        break;
                    case D:
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
                    case E:
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
                    case F:
                        System.out.println("Enter length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Enter length 2");
                        arrayLength2 = scanner.nextInt();
                        System.out.println("Enter minimum boundary");
                        min = scanner.nextInt();
                        System.out.println("Enter maximum boundary");
                        max = scanner.nextInt();
                        System.out.println("Array:");
                        OutputPrint.showOutputResultForMultidimensionalArray(loopsAndArrays.showMultidimensionalArrayOfRandomNumbers(arrayLength, arrayLength2, min, max));
                    case G:
                        exit = true;
                        break;
                    default:
                        System.out.println("Error, wrong input! Please enter a valid letter!");
                        break;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        }while (exit != true);
    }
}