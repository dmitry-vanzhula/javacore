package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.Lesson9.BubbleSort;

import java.util.Arrays;

/**
 * Created by Dmitriy on 11/2/2016.
 */
public class Lesson9Runner {

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 2, 6};

        System.out.println(Arrays.toString(array));
        BubbleSort.arraySortingFromSmallestToLargest(array);

        System.out.println(Arrays.toString(array));
        BubbleSort.arraySortingFromLargestToSmallest(array);


    }
}