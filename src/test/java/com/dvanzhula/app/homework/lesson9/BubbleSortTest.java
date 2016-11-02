package com.dvanzhula.app.homework.lesson9;

import com.dvanzhula.app.homework.Lesson9.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 11/2/2016.
 */
public class BubbleSortTest {
    @Test
    public void arraySortingFromSmallestToLargestTest(){
        int[] array = {5,4,3,2,1};
        int[] expRes = {1,2,3,4,5};
        Assert.assertArrayEquals(expRes, BubbleSort.arraySortingFromSmallestToLargest(array));
    }
    @Test
    public void arraySortingFromLargestToSmallestTest(){
        int[] array = {1,4,3,5,9};
        int[] expRes = {9,5,4,3,1};
        Assert.assertArrayEquals(expRes, BubbleSort.arraySortingFromLargestToSmallest(array));
    }
}
