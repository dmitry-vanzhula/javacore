package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson9.BubbleSort;

/**
 * Created by Dmitry Vanzhula on 11/2/2016.
 */
public class Lesson9Runner {

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 2, 6};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Input array:");
        OutputPrint.showOutputResultForArrays(array);
        System.out.println("Bubble sorted array from smallest to largest:");
        OutputPrint.showOutputResultForArrays(bubbleSort.arraySortingFromSmallestToLargest(array));

        int[] array2 = {5, 3, 1, 2, 6};
        System.out.println("Input array:");
        OutputPrint.showOutputResultForArrays(array2);
        System.out.println("Bubble sorted array from largest to smallest:");
        OutputPrint.showOutputResultForArrays(bubbleSort.arraySortingFromLargestToSmallest(array2));
    }
}