package com.dvanzhula.app.homework.lesson7;

import com.dvanzhula.app.homework.Lesson7.LoopsAndArrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 10/27/2016.
 */
public class LoopsAndArraysTest {

     @Test
    public void showAnArrayOfEvenNumbersTest(){
        int[] expRes = {0,2,4,6,8,10,12,14,16,18,20};
        Assert.assertArrayEquals(expRes, LoopsAndArrays.showAnArrayOfEvenNumbers(11));
    }
    @Test
    public void showAnArrayOfOddNumbersTest(){
        int[] expRes = {0,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99};
        Assert.assertArrayEquals(expRes,LoopsAndArrays.showAnArrayOfOddNumbers(50));
    }



}
