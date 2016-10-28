package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.Lesson7.LoopsAndArrays;

import java.util.Scanner;

/**
 * Created by Dmitriy on 10/24/2016.
 */
public class Lesson7LoopsArraysRunner {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number 1-7:");
            System.out.println("Number 1 - Task a");
            System.out.println("Number 2 - Task b");
            System.out.println("Number 3 - Task c");
            System.out.println("Number 4 - Task d");
            System.out.println("Number 5 - Task e");
            System.out.println("Number 6 - Task g");
            System.out.println("Number 7 - Exit");
            try {
                int arrayLength;
                int arrayLength2;
                int min;
                int max;
                int inputNumber = scanner.nextInt();
                switch (inputNumber) {
                    case 1:
                        System.out.println("Input array length");
                        arrayLength = scanner.nextInt();
                        LoopsAndArrays.showAnArrayOfEvenNumbers(arrayLength);
                        break;
                    case 2:
                        System.out.println("Input array length");
                        arrayLength = scanner.nextInt();
                        LoopsAndArrays.showAnArrayOfOddNumbers(arrayLength);
                        break;
                    case 3:
                        System.out.println("Input array length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Input min");
                        min = scanner.nextInt();
                        System.out.println("Input max");
                        max = scanner.nextInt();
                        LoopsAndArrays.showAnArrayOfRandomNumbersAndCalculateHowManyEven(arrayLength, min, max);
                        break;
                    case 4:
                        System.out.println("Input array length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Input min");
                        min = scanner.nextInt();
                        System.out.println("Input max");
                        max = scanner.nextInt();
                        LoopsAndArrays.showAnArrayOfRandomNumbersAndDefineMinNumber(arrayLength,min,max);
                        break;
                    case 5:
                        System.out.println("Input array length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Input min");
                        min = scanner.nextInt();
                        System.out.println("Input max");
                        max = scanner.nextInt();
                        LoopsAndArrays.showAnArrayOfRandomNumbersAndDefineMaxNumber(arrayLength, min, max);
                        break;
                    case 6:
                        System.out.println("Input array length");
                        arrayLength = scanner.nextInt();
                        System.out.println("Input array length");
                        arrayLength2 = scanner.nextInt();
                        System.out.println("Input min");
                        min = scanner.nextInt();
                        System.out.println("Input max");
                        max = scanner.nextInt();
                        LoopsAndArrays.showMultidimensionalArrayOfRandomNumbers(arrayLength, arrayLength2, min, max);
                    case 7:
                        break;
                    default:
                        System.out.println("Error, wrong input. Please enter a valid number!");
                        break;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        }
    }
}


   /* public static void showAnArrayOfEvenNumbers() {

        int[] array = new int[11];
        for (int i = 1; i < array.length; i++) {
            array[i] = i * 2;
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " "); //  массив в строку
        }
        System.out.println(" ");
        System.out.println("");
        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i] + " "); // массив в столбик
        }
    } */

   /* public static void showAnArrayOfOddNumbers() {

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //  массив в строку
        }
        System.out.println(" ");
        System.out.println("");
        for (int i = 49; i >= 0; i--) {
            System.out.println(array[i] + " "); // массив в столбик
        }
    } */

   /* public static void showAnArrayOfNumbers() {

        int evenNumbers = 0;

        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10); // генерация случайных чисел
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //  массив в строку
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("There are " + evenNumbers + " even numbers"); // вывести на экран количество четных чисел
    } */

    /*public static void showAnArrayOfNumbers2() {

        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000); // генерация случайных чисел
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //  массив в строку
        }

        System.out.println(" ");
        System.out.println(" ");

        int min = array[0]; // пусть минимум у нас будет 1-элемент в массиве
        int max = array[0]; // пусть максимум у нас будет 1-элемент в массиве

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
    } */

   /* public static void showAnArrayOfMultidimensionalNumbers() {

        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (int) (Math.random() * 100); // генерация случайных чисел
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k] + " ");  //  массив в строку
            }
        }
    } */

   /* public static void showAnArrayOfMultidimensionalNumbers2() {

        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (int) (Math.random() * 1000); // генерация случайных чисел
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d%s", i + 1, ":"); // %s - отобразить, как String; %d отобразить, как int;
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%5d", array[i][k]); // отступ в 5 символов между числами в столбцах
            }
            System.out.println(""); // отступ между строк
        }
    } */
