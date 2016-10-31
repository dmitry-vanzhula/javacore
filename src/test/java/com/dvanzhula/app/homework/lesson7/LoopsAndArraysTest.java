package com.dvanzhula.app.homework.lesson7;

import com.dvanzhula.app.homework.Lesson7.LoopsAndArrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitriy on 10/27/2016.
 */
public class LoopsAndArraysTest {

    @Test
    public void createArrayTest() {
        int[] expRes = new int[6];
        Assert.assertArrayEquals(expRes, LoopsAndArrays.createArray(6));
    }
    @Test
    public void createMultidimensionalArrayTest() {
        int[][] expRes = new int[8][5];
        Assert.assertArrayEquals(expRes, LoopsAndArrays.createMultidimensionalArray(8, 5));
    }
    @Test
    public void showAnArrayOfEvenNumbersTest() {
        int[] expRes = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Assert.assertArrayEquals(expRes, LoopsAndArrays.showAnArrayOfEvenNumbers(11));
    }
    @Test
    public void showAnArrayOfOddNumbersTest() {
        int[] expRes = {0, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99};
        Assert.assertArrayEquals(expRes, LoopsAndArrays.showAnArrayOfOddNumbers(50));
    }
    @Test
    public void generatorOfRandomNumbersTest() {
        int random = LoopsAndArrays.generatorOfRandomNumbers(0, 9);
        int maximumNumber = 9;
        int minimumNumber = 0;
        Assert.assertFalse("Error, number is too high", random > maximumNumber);
        Assert.assertFalse("Error, number is too low", random < minimumNumber);
    }
    @Test
    public void showMinNumberTest(){
        int random = LoopsAndArrays.showMinNumber(15,0,999);
        int minimum = 0;
        int maximum = 999;
        Assert.assertFalse("Error, minimum is too low", random < minimum);
        Assert.assertFalse("Error, minimum is too high", random > maximum);
    }
    @Test
    public void showMaxNumberTest(){
        int random = LoopsAndArrays.showMaxNumber(15,0,999);
        int minimum = 0;
        int maximum = 999;
        Assert.assertFalse("Error, minimum is too low", random < minimum);
        Assert.assertFalse("Error, minimum is too high", random > maximum);
    }
    @Test
    public void fillAnArrayWithRandomNumbTest(){
        int arrayLength = 8;
        int minValue = 0;
        int maxValue = 9;
        int[] myArray = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,minValue,maxValue);
        boolean allValuesInRange = true;
        Assert.assertEquals(arrayLength,myArray.length);
        for (int i = 0; i < myArray.length; i++){
            if (!(minValue <= myArray[i] && myArray[i] <= maxValue)){
                allValuesInRange = false;
            }
        }
        Assert.assertTrue(allValuesInRange);

    }

}