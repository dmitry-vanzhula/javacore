package com.dvanzhula.app.classwork.lesson10;

/**
 * Created by Dmitry Vanzhula on 11/2/16.
 */
public class ArrayOfCharsToString {

    public static String convertCharToString(char[] arrayOfChar) {
        String myString = new String();
        for (int i = 0; i < arrayOfChar.length; i++) {
            myString = myString + arrayOfChar[i];
            if (i != arrayOfChar.length - 1)
                myString += ",";
        }

        System.out.println(myString);
        return myString;
    }
}
