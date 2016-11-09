package com.dvanzhula.app.homework.Lesson9;

/**
 * Created by Dmitry Vanzhula on 11/2/2016.
 */
public class BubbleSort {

    public int[] arraySortingFromSmallestToLargest(int[] array) {
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

    public int[] arraySortingFromLargestToSmallest(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }
}

