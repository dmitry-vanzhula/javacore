package com.dvanzhula.app.classwork.Lesson9;

/**
 * Created by Dmitry Vanzhula on 10/29/16.
 */
public class ConverterCharArrayToString {

    public static char[] fillArrayOfAsciiCharacters(char[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (char) (i+48);
        }
        return myArray;
    }


}
