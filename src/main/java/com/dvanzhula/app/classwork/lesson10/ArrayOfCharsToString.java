package com.dvanzhula.app.classwork.lesson10;

/**
 * Created by dmitry on 11/2/16.
 */
public class ArrayOfCharsToString {

        public static String convertCharToString (char[] arrayOfChar) {
            String myString = " ";
            for(int i = 0; i < arrayOfChar.length;i++){
                myString = myString + arrayOfChar[i];
            }
            System.out.println(myString);
            return myString;
    }
}
