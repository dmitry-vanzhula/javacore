package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.Lesson9.ArraySort;
import com.dvanzhula.app.classwork.Lesson9.ConvertorCharArrayToString;

/**
 * Created by dmitry on 10/29/16.
 */
public class Lesson9Runner {

    public static void main(String[] args) {
        char[] myArray = new char[256];
        ConvertorCharArrayToString.showAndConvertCharToString(myArray);
        int[] array = {5,4,3,2,1};
        ArraySort.bubbleSorting(array);
    }
}
