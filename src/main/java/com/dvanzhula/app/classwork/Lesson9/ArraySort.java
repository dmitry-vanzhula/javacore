package com.dvanzhula.app.classwork.Lesson9;

/**
 * Created by Dmitry Vanzhula on 10/29/16.
 */
public class ArraySort {

        public static int[] bubbleSorting(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
            return array;
    }
}




