package com.dvanzhula.app.classwork.Lesson9;

import java.util.Arrays;

/**
 * Created by dmitry on 10/29/16.
 */
public class ConvertorCharArrayToString {

    public static void showAndConvertCharToString(){

        char[] array = new char[256];
        for(int i = 0; i < array.length; i++){
            array[i] = (char) i;
        }
        String myString = Arrays.toString(array);
        System.out.println("Char array: \n" + myString);
    }
}
