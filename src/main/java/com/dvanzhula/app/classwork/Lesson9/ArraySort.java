package com.dvanzhula.app.classwork.Lesson9;

import java.util.Arrays;

/**
 * Created by dmitry on 10/29/16.
 */
public class ArraySort {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 3, 1};

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}




