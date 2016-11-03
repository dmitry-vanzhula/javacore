package com.dvanzhula.runners.homework;

import java.util.Arrays;

/**
 * Created by Dmitry Vanzhula on 11/2/2016.
 */
public class ArrayPrint {

    public static void showOutputResultForArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showOutputResultForStrings(char[] myArray) {
        String myString = Arrays.toString(myArray);
        System.out.println("Char array: \n" + myString);
    }

}

