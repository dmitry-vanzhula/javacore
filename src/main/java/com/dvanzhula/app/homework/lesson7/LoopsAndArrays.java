package com.dvanzhula.app.homework.lesson7;


/**
 * Created by Dmitry Vanzhula on 10/27/2016.
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

    public static int[] showAnArrayOfEvenNumbers(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = i * 2;
        }
        return array;
    }

    public static int[] showAnArrayOfOddNumbers(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }

        return array;
    }

    public static int generatorOfRandomNumbers(int min, int max) {
        int result = min + (int) (Math.random() * ((max - min) + 1));
        return result;
    }

    public static int calculateHowManyEvenNumbers(int[] arrayOfRandomNumbers) {
        int evenNumbers = 0;
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }

    public static int showMinNumber(int[] arrayOfRandomNumbers) {
        int minimum = arrayOfRandomNumbers[0]; // пусть минимум у нас будет 1-элемент в массиве
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] < minimum) {
                minimum = arrayOfRandomNumbers[i];
            }
        }
        return minimum;
    }

    public static int showMaxNumber(int[] arrayOfRandomNumbers) {
        int maximum = arrayOfRandomNumbers[0]; // пусть максимум у нас будет 1-элемент в массиве
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] > maximum) {
                maximum = arrayOfRandomNumbers[i];
            }
        }
        return maximum;
    }

    public static int[][] showMultidimensionalArrayOfRandomNumbers(int arrayLength, int arrayLength2, int min, int max) {
        int[][] array = LoopsAndArrays.fillMultidimensionalArrayWithRandomNumb(arrayLength, arrayLength2, min, max);
        for (int i = 0; i < arrayLength; i++) {
            for (int k = 0; k < arrayLength2; k++) {
                array[i][k] = generatorOfRandomNumbers(min, max);
            }
        }
        return array;
    }
}