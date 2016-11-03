package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.Lesson9.ArraySort;
import com.dvanzhula.app.classwork.Lesson9.ConverterCharArrayToString;
import com.dvanzhula.runners.homework.ArrayPrint;

/**
 * Created by Dmitry Vanzhula on 10/29/16.
 */
public class Lesson9Runner {

    public static void main(String[] args) {

        int[] array = {5, 4, 3, 2, 1};
        ArrayPrint.showOutputResultForArrays(ArraySort.bubbleSorting(array));

        char[] myArray = new char[256];
        ArrayPrint.showOutputResultForStrings(ConverterCharArrayToString.fillArrayOfAsciiCharacters(myArray));
    }
}
