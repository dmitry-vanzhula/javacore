package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson10.Palindrome;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class Lesson10Runner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your program, enter a number 1-3:");
        System.out.println("Number 1 - program to check palindrome string");
        System.out.println("Number 2 - program to check palindrome string");
        System.out.println("Number 3 - program to check palindrome string");

        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1:
                System.out.println("Enter a string to check if it is a palindrome");
                scanner.nextLine();
                String word = scanner.nextLine();
                Palindrome.isPolindrome(word);
                break;
            case 2:
                System.out.println("Enter a string to check if it is a palindrome");
                scanner.nextLine();
                String word2 = scanner.nextLine();
                Palindrome.checkPolindrome(word2);
                break;
            case 3:
                System.out.println("Enter a string to check if it is a palindrome");
                scanner.nextLine();
                String word3 = scanner.nextLine();
                Palindrome.determinePalindrome(word3);
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}