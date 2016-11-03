package com.dvanzhula.app.classwork.lesson9;

import com.dvanzhula.app.classwork.Lesson9.ArraySort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 11/2/2016.
 */
public class ArraySortTest {
    @Test
    public void bubbleSortingTest(){
        int[] array = {5,4,3,2,1};
        int[] expRes = {1,2,3,4,5};
        Assert.assertArrayEquals(expRes, ArraySort.bubbleSorting(array));
    }
}
