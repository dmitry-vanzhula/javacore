package com.dvanzhula.app.classwork.lesson9;

/**
 * Created by Dmitry Vanzhula on 10/29/16.
 */
public class ConverterCharArrayToString {

    public char[] fillArrayOfAsciiCharacters(char[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (char) (i+48);
        }
        return myArray;
    }


}
