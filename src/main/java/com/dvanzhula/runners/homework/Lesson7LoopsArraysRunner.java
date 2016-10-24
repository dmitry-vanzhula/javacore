package com.dvanzhula.runners.homework;

/**
 * Created by Dmitriy on 10/24/2016.
 */
public class Lesson7LoopsArraysRunner {
    public static void main(String[] args) {

        Lesson7LoopsArraysRunner.showArrayOfEvenNumbers();
        Lesson7LoopsArraysRunner.showArrayOfOddNumbers();
        Lesson7LoopsArraysRunner.showRandomArrayNumbers();
    }

    public static void showArrayOfEvenNumbers() {
        int[] arrayOfEvenNumbers = new int[11];
        for (int i = 1; i < arrayOfEvenNumbers.length; i++) {
            arrayOfEvenNumbers[i] = i * 2;
        }
        for (int i = 1; i < arrayOfEvenNumbers.length; i++) {
            System.out.println(arrayOfEvenNumbers[i]); // массив в столбик
        }

        System.out.println(); // пробел между выводом текста на экран

        for (int i = 1; i < arrayOfEvenNumbers.length; i++) {
            System.out.print(arrayOfEvenNumbers[i] + " "); // массив в строку
        }
    }

    public static void showArrayOfOddNumbers() {

        int[] arrayOfOddNumbers = new int[50];
        for (int i = 0; i < arrayOfOddNumbers.length; i++) {
            arrayOfOddNumbers[i] = i * 2 + 1;
        }

        for (int i = 0; i < arrayOfOddNumbers.length; i++) {
            System.out.println(arrayOfOddNumbers[i]); // массив в столбик
        }

        System.out.println(); // пробел между выводом текста на экран

        for (int i = 49; i >= 0; i--) {
            System.out.print(arrayOfOddNumbers[i] + " "); // массив в строку
        }
    }

    public static void showRandomArrayNumbers() {

        int evenNumbers = 0;

        int[] randomArrayOfNumbers = new int[16];
        for (int i = 0; i < randomArrayOfNumbers.length; i++) {
            randomArrayOfNumbers[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < randomArrayOfNumbers.length; i++) {
            System.out.println(randomArrayOfNumbers[i]);
        }
        System.out.println("----------------------"); // пробел между выводом текста на экран

        for (int i = 0; i < randomArrayOfNumbers.length; i++) {
            if (randomArrayOfNumbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println(evenNumbers);
    }
}


