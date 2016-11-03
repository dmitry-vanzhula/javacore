package com.dvanzhula.app.classwork.lesson10;

/**
 * Created by dmitry on 11/2/16.
 */
public class Palindrome {

    public static Boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            // Сравниваем символ с начала и конца
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false; // символы не равны, не полиндром, возвращаем фальшь
            }
        }
        return true; // проверка не выявила несовпадающих символов, возвращаем истину
    }
}
