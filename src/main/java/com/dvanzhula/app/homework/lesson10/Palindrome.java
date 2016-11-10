package com.dvanzhula.app.homework.lesson10;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class Palindrome {

    public static boolean isPolindrome(String original) {

        boolean polindrome = false;
        String reverse = "";
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string is a palindrome.");
            return true;
        } else {
            System.out.println("Entered string is not a palindrome.");
            return false;
        }
    }

    public static boolean checkPolindrome(String original) {
        boolean polindrome = false;
        StringBuilder strBuilder = new StringBuilder(original);
        strBuilder.reverse();
        if (original.equals(strBuilder.toString())) {
            System.out.println("String is palindrome");
            return true;
        } else {
            System.out.println("String is not palindrome");
            return false;
        }

    }

    public static Boolean determinePalindrome(String inputData) {
        for (int i = 0; i < inputData.length() / 2; i++) {
            if (inputData.charAt(i) != inputData.charAt(inputData.length() -  i - 1)) {
                System.out.println("The word isn't palindrome" );
                return false;
            }
        }
        System.out.println("The word is palindrome");
        return true;
    }


}
