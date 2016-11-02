package com.dvanzhula.app.classwork.Lesson9;

import java.util.Arrays;

/**
 * Created by dmitry on 10/29/16.
 */
public class ConvertorCharArrayToString {

    public static String showAndConvertCharToString(char[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (char) i;
        }
        String myString = Arrays.toString(myArray);
        System.out.println("Char array: \n" + myString);
        //System.out.println(Arrays.toString(myArray));
        return myString;
    }
}
