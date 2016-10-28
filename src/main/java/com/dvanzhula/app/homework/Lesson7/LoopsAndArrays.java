package com.dvanzhula.app.homework.Lesson7;


/**
 * Created by Dmitriy on 10/27/2016.
 */
public class LoopsAndArrays {

    public static int[] showAnArrayOfEvenNumbers(int arrayLength) {

        int[] array = new int[arrayLength];
        for (int i = 1; i < arrayLength; i++) {
            array[i] = i * 2;
            System.out.print(array[i] + " ");
            //System.out.println(Arrays.toString(array));
        }
        System.out.println(" ");
        System.out.println(" ");
        return array;
    }

    public static int[] showAnArrayOfOddNumbers(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 1; i < arrayLength; i++) {
            array[i] = i * 2 + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        return array;
    }

    public static int generatorOfRandomNumbers(int min, int max) {
        int result = min + (int)(Math.random() * ((max - min) + 1));
        return result;
    }

    public static int showAnArrayOfRandomNumbersAndCalculateHowManyEven(int arrayLength, int min, int max) {
        int evenNumbers = 0;

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = generatorOfRandomNumbers(min,max);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("  ");
        System.out.print("Even numbers are " + evenNumbers + " ");
        System.out.println("  ");
        System.out.println("  ");
        return evenNumbers;
    }

    public static int showAnArrayOfRandomNumbersAndDefineMinNumber(int arrayLength, int min, int max) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = generatorOfRandomNumbers(min,max);
            System.out.print(array[i] + " ");
        }

        int minimum = array[0]; // пусть минимум у нас будет 1-элемент в массиве

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println("  ");
        System.out.println(" Minimum number is " + " " + minimum);
        System.out.println("  ");
        System.out.println("  ");
        return minimum;
    }

    public static int showAnArrayOfRandomNumbersAndDefineMaxNumber(int arrayLength, int min, int max) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = generatorOfRandomNumbers(min,max);
            System.out.print(array[i] + " ");
        }

        int maximum = array[0]; // пусть максимум у нас будет 1-элемент в массиве

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("  ");
        System.out.println(" Maximum number is " + " " + maximum);
        System.out.println("  ");
        System.out.println("  ");
        return maximum;
    }

    public static int[][] showMultidimensionalArrayOfRandomNumbers(int arrayLength, int arrayLength2, int min, int max){
        int[][] array = new int[arrayLength][arrayLength2];
        for (int i = 0; i < arrayLength; i++) {
            for (int k = 0; k < arrayLength2; k++) {
                array[i][k] = generatorOfRandomNumbers(min, max);
            }
        }
        for (int i = 0; i < arrayLength; i++) {
            for (int k = 0; k < arrayLength2; k++) {
               System.out.print(array[i][k] + " ");  //  массив в строку
            }
        }
        //System.out.println(Arrays.deepToString(array));
        System.out.println("  ");
        System.out.println("  ");
        return array;
    }

}


