package com.dvanzhula.runners.homework;

import java.util.Arrays;

/**
 * Created by Dmitry Vanzhula on 11/2/2016.
 */
public class OutputPrint {

    public static void showOutputResultForArrays(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            if (i != array.length - 1) {
                result = result + ",";
            }
        }
        System.out.println(result);
        System.out.println();
    }

    public static void showOutputResultForArrays2(int[] array) {
        String result = "";
        for (int i = 1; i < array.length; i++) {
            result = result + array[i];
            if (i != array.length - 1) {
                result = result + ",";
            }
        }
        System.out.println(result);
        System.out.println();
    }

    public static void showOutputResultForHowManyEvenNumbers(int evenNumbers) {
        System.out.println(evenNumbers);
    }

    public static void showOutputResultForMinAndMaxNumber(int number) {
        System.out.println(number);
    }

    public static void showOutputResultForMultidimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d%s", i + 1, ":");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println("");
        }
    }

    public static void showOutputResultForStrings(char[] myArray) {
        String myString = Arrays.toString(myArray);
        System.out.println("Char array: \n" + myString);
    }

    public static void showOutputResultForCircleRadius(double radius) {
        System.out.println("Area is " + radius);

    }

    public static void showOutputResultForString(String inputString){
        System.out.println(inputString);

    }
}



