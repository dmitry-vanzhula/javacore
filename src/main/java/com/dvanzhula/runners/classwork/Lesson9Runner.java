package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson9.ArraySort;
import com.dvanzhula.app.classwork.lesson9.ConverterCharArrayToString;
import com.dvanzhula.runners.homework.OutputPrint;

/**
 * Created by Dmitry Vanzhula on 10/29/16.
 */
public class Lesson9Runner {

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        System.out.println("Input array");
        OutputPrint.showOutputResultForArrays(array);
        System.out.println("Sorted array");
        ArraySort arraySort = new ArraySort();
        OutputPrint.showOutputResultForArrays(arraySort.bubbleSorting(array));

        char[] myArray = new char[256];
        ConverterCharArrayToString converterCharArrayToString = new ConverterCharArrayToString();
        OutputPrint.showOutputResultForStrings(converterCharArrayToString.fillArrayOfAsciiCharacters(myArray));
    }
}
