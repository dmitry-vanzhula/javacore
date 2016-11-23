package com.dvanzhula.app.homework.lesson10;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class Palindrome2 {

    public boolean isPolindrome(String original) {
        boolean polindrome = false;
        String reverse = "";
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
       if (original.equals(reverse)) {
           return true;
       } else {
          return false;
       }
    }

    public boolean checkPolindrome(String original) {
        boolean polindrome = false;
        StringBuilder strBuilder = new StringBuilder(original);
        strBuilder.reverse();
        if (original.equals(strBuilder.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean determinePalindrome(String inputData) {
        for (int i = 0; i < inputData.length() / 2; i++) {
            if (inputData.charAt(i) != inputData.charAt(inputData.length() -  i - 1)) {
                return false;
            }
        }
        return true;
    }
}