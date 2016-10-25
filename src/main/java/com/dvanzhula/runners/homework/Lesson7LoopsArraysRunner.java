package com.dvanzhula.runners.homework;

/**
 * Created by Dmitriy on 10/24/2016.
 */
public class Lesson7LoopsArraysRunner {
    public static void main(String[] args) {

        Lesson7LoopsArraysRunner.showAnArrayOfMultidimensionalNumbers2();


    }

    public static void showAnArrayOfEvenNumbers() {

        int[] array = new int[11];
        for (int i = 1; i < array.length; i++) {
            array[i] = i * 2;
        }
        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i]); // массив в столбик
        }

        System.out.println("----------------------"); // пробел между выводом текста на экран

        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " "); // массив в строку
        }
    }

    public static void showAnArrayOfOddNumbers() {

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // массив в столбик
        }
        System.out.println("----------------------"); // пробел между выводом текста на экран

        for (int i = 49; i >= 0; i--) {
            System.out.print(array[i] + " "); // массив в строку
        }
    }

    public static void showAnArrayOfNumbers() {

        int evenNumbers = 0;

        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10); // генерация случайных чисел
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // массив в столбик
        }
        System.out.println("----------------------"); // пробел между выводом текста на экран

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("There are " + evenNumbers + " even numbers"); // вывести на экран количество четных чисел
    }

    public static void showAnArrayOfNumbers2() {

        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000); // генерация случайных чисел
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // массив в столбик
        }

        System.out.println("----------------------"); // пробел между выводом текста на экран

        int min = array[0]; // пусть минимум у нас будет 1-элемент в массиве
        int max = array[0]; // пусть максимум у нас будет 1-элемент в массиве

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
    }

    public static void showAnArrayOfMultidimensionalNumbers() {

        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (int) (Math.random() * 100); // генерация случайных чисел
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.println(array[i][k]);  // массив в столбик
            }
        }
    }

    public static void showAnArrayOfMultidimensionalNumbers2() {

        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (int) (Math.random() * 1000); // генерация случайных чисел
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d%s", i + 1, ":"); // %s - отобразить, как String; %d отобразить, как int;
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%5d", array[i][k]); // отступ в 5 символов между числами в столбцах
            }
            System.out.println(""); // отступ между строк
        }

    }
}
