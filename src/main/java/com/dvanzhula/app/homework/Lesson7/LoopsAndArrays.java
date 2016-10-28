package com.dvanzhula.app.homework.Lesson7;


import java.util.Arrays;

/**
 * Created by Dmitriy on 10/27/2016.
 */
public class LoopsAndArrays {

    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public static int[][] createMultidimensionalArray(int arrayLength, int arrayLength2) {
        int[][] array = new int[arrayLength][arrayLength2];
        return array;
    }

    public static int[] fillAnArrayWithRandomNumb(int arrayLength, int min, int max) {

        int[] array = LoopsAndArrays.createArray(arrayLength);
        for (int i = 0; i < arrayLength; i++) {
            array[i] = generatorOfRandomNumbers(min, max);
        }
        return array;
    }

    public static int[][] fillMultidimensionalArrayWithRandomNumb(int arrayLength, int arrayLength2, int min, int max) {
        int[][] array = LoopsAndArrays.createMultidimensionalArray(arrayLength, arrayLength2);
        for (int i = 0; i < arrayLength; i++) {
            for (int k = 0; k < arrayLength2; k++) {
                array[i][k] = generatorOfRandomNumbers(min, max);
            }
        }
        return array;
    }

    public static int[] showAnArrayOfEvenNumbers(int arrayLength) {
        int[] array = LoopsAndArrays.createArray(arrayLength);
        for (int i = 1; i < arrayLength; i++) {
            array[i] = i * 2;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        return array;
    }

    public static int[] showAnArrayOfOddNumbers(int arrayLength) {
        int[] array = LoopsAndArrays.createArray(arrayLength);
        for (int i = 1; i < arrayLength; i++) {
            array[i] = i * 2 + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        return array;
    }

    public static int generatorOfRandomNumbers(int min, int max) {
        int result = min + (int) (Math.random() * ((max - min) + 1));
        return result;
    }

    public static int showHowManyEvenNumbers(int arrayLength, int min, int max) {
        int evenNumbers = 0;
        int[] array = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength, min, max);
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.print("Even numbers are " + evenNumbers + " ");
        System.out.println(" ");
        System.out.println(Arrays.toString(array));
        System.out.println("  ");
        return evenNumbers;
    }

    public static int showMinNumber(int arrayLength, int min, int max) {
        int[] array = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength, min, max);
        int minimum = array[0]; // пусть минимум у нас будет 1-элемент в массиве
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println(" Minimum number is " + " " + minimum);
        System.out.println("  ");
        System.out.println(Arrays.toString(array));
        System.out.println("  ");
        return minimum;
    }

    public static int showMaxNumber(int arrayLength, int min, int max) {
        int[] array = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength, min, max);
        int maximum = array[0]; // пусть максимум у нас будет 1-элемент в массиве
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println(" Maximum number is " + " " + maximum);
        System.out.println("  ");
        System.out.println(Arrays.toString(array));
        System.out.println("  ");
        return maximum;
    }

    public static int[][] showMultidimensionalArrayOfRandomNumbers(int arrayLength, int arrayLength2, int min, int max) {
        int[][] array = LoopsAndArrays.fillMultidimensionalArrayWithRandomNumb(arrayLength, arrayLength2, min, max);
        for (int i = 0; i < arrayLength; i++) {
            for (int k = 0; k < arrayLength2; k++) {
                array[i][k] = generatorOfRandomNumbers(min, max);
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("  ");
        System.out.println("  ");
        return array;
    }
}