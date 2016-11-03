package com.dvanzhula.app.homework.lesson7;

import com.dvanzhula.app.homework.Lesson7.LoopsAndArrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitry Vanzhula on 10/27/2016.
 */
public class LoopsAndArraysTest {

    @Test
    public void createArrayTest() {
        int[] arrayLength = new int[6];
        Assert.assertArrayEquals(arrayLength, LoopsAndArrays.createArray(6));
    }

    @Test
    public void createMultidimensionalArrayTest() {
        int[][] arrayLength = new int[8][5];
        Assert.assertArrayEquals(arrayLength, LoopsAndArrays.createMultidimensionalArray(8, 5));
    }

    @Test
    public void showAnArrayOfEvenNumbersTest() {
        int[] expRes = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] array = LoopsAndArrays.createArray(11);
        Assert.assertArrayEquals(expRes, LoopsAndArrays.showAnArrayOfEvenNumbers(array));
    }

    @Test
    public void showAnArrayOfOddNumbersTest() {
        int[] expRes = {0, 3, 5, 7, 9};
        int[] array = LoopsAndArrays.createArray(5);
        Assert.assertArrayEquals(expRes, LoopsAndArrays.showAnArrayOfOddNumbers(array));
    }

    @Test
    public void generatorOfRandomNumbersMinBoundaryTest() {
        int minValue = 0;
        int maxValue = 9;
        int random = LoopsAndArrays.generatorOfRandomNumbers(minValue, maxValue);
        Assert.assertFalse("Error, number is too low", random < minValue);
    }

    @Test
    public void generatorOfRandomNumbersMaxBoundaryTest() {
        int minValue = 0;
        int maxValue = 9;
        int random = LoopsAndArrays.generatorOfRandomNumbers(minValue, maxValue);
        Assert.assertFalse("Error, number is too high", random > maxValue);
    }

    @Test
    public void showMinNumberMinValueBoundaryTest() {
        int arrayLength = 15;
        int minValue = 0;
        int maxValue = 999;
        int[] random = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,minValue,maxValue);
        Assert.assertFalse("Error, minimum is too low", LoopsAndArrays.showMinNumber(random) < minValue);
    }

    @Test
    public void showMinNumberMaxValueBoundaryTest() {
        int arrayLength = 15;
        int minValue = 0;
        int maxValue = 999;
        int[] random = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,minValue,maxValue);
        Assert.assertFalse("Error, maximum is too high", LoopsAndArrays.showMinNumber(random) > maxValue);
    }

    @Test
    public void showMaxNumberMinValueBoundaryTest() {
        int arrayLength = 15;
        int minValue = 0;
        int maxValue = 999;
        int[] random = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,minValue,maxValue);
        Assert.assertFalse("Error, minimum is too low", LoopsAndArrays.showMaxNumber(random) < minValue);
    }

    @Test
    public void showMaxNumberMaxValueBoundaryTest() {
        int arrayLength = 15;
        int minValue = 0;
        int maxValue = 999;
        int[] random = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength,minValue,maxValue);
        Assert.assertFalse("Error, maximum is too high", LoopsAndArrays.showMaxNumber(random) > maxValue);
    }

    @Test
    public void fillAnArrayWithRandomNumbersArrayLengthTest() {
        int arrayLength = 16;
        int minValue = 0;
        int maxValue = 9;
        int[] myArray = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength, minValue, maxValue);
        Assert.assertEquals(arrayLength, myArray.length);
    }

    @Test
    public void fillAnArrayWithRandomNumbAllValueInRangeTest() {
        boolean allValuesInRange = true;
        int arrayLength = 16;
        int minValue = 0;
        int maxValue = 9;
        int[] myArray = LoopsAndArrays.fillAnArrayWithRandomNumb(arrayLength, minValue, maxValue);
        for (int i = 0; i < arrayLength; i++) {
            if (myArray[i] < minValue || myArray[i] > maxValue) {
                allValuesInRange = false;
            }
        }
        Assert.assertTrue(allValuesInRange);
    }

    @Test
    public void fillMultidimensionalArrayWithRandomNumbArrayLengthTest() {
        int arrayLength = 8;
        int arrayLength2 = 5;
        int minValue = 10;
        int maxValue = 99;
        int[][] myArray = LoopsAndArrays.fillMultidimensionalArrayWithRandomNumb(arrayLength, arrayLength2, minValue, maxValue);
        Assert.assertEquals(arrayLength, arrayLength2, myArray.length);
    }

    @Test
    public void fillMultidimensionalArrayWithRandomNumbAllValueInRangeTest() {
        int arrayLength = 8;
        int arrayLength2 = 5;
        int minValue = 10;
        int maxValue = 99;
        int[][] myArray = LoopsAndArrays.fillMultidimensionalArrayWithRandomNumb(arrayLength, arrayLength2, minValue, maxValue);
        boolean allValueInRange = true;
        for (int i = 0; i < arrayLength; i++) {
            for (int k = 0; k < arrayLength2; k++) {
                if (myArray[i][k] < minValue || myArray[i][k] > maxValue) {
                    allValueInRange = false;
                }
            }
        }
    }

    @Test
    public void showMultidimensionalArrayOfRandomNumbersArrayLengthTest() {
        int arrayLength = 8;
        int arrayLength2 = 5;
        int minValue = 10;
        int maxValue = 99;
        int[][] myArray = LoopsAndArrays.showMultidimensionalArrayOfRandomNumbers(arrayLength, arrayLength2, minValue, maxValue);
        Assert.assertEquals(arrayLength, arrayLength2, myArray.length);
    }

    @Test
    public void showMultidimensionalArrayOfRandomNumbersAllValueInRangeTest() {
        int arrayLength = 8;
        int arrayLength2 = 5;
        int minValue = 10;
        int maxValue = 99;
        int[][] myArray = LoopsAndArrays.showMultidimensionalArrayOfRandomNumbers(arrayLength, arrayLength2, minValue, maxValue);
        boolean allValueInRange = true;
        for (int i = 0; i < arrayLength; i++) {
            for (int k = 0; k < arrayLength2; k++) {
                if (myArray[i][k] < minValue || myArray[i][k] > maxValue) {
                    allValueInRange = false;
                }
            }
        }

    }

    @Test
    public void calculateHowManyEvenNumbersTest() {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expRes = 4;
        Assert.assertEquals(expRes, LoopsAndArrays.calculateHowManyEvenNumbers(myArray));

    }


}