package com.dvanzhula.app.classwork.lesson10;

/**
 * Created by dmitry on 11/2/16.
 */
public class Palindrome {

    public static Boolean isPalindrome(String inputData) {
        for (int i = 0; i < inputData.length() / 2; i++) {
            // Сравниваем символ с начала и конца
            if (inputData.charAt(i) != inputData.charAt(inputData.length() -  i - 1)) {
                System.out.println("The word isn't palindrome" );
                return false; // символы не равны, не полиндром, возвращаем фальшь
            }
        }
        System.out.println("The word is palindrome");
        return true; // проверка не выявила несовпадающих символов, возвращаем истину
    }
}
