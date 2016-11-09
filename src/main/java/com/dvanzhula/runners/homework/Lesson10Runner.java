package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.Lesson10.Palindrome;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class Lesson10Runner {
    public static void main(String[] args) {

        boolean exit = false;
        do {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose your program, enter a number 1-4:");
            System.out.println("Number 1 - program to check palindrome string");
            System.out.println("Number 2 - program to check palindrome string");
            System.out.println("Number 3 - program to check palindrome string");
            System.out.println("Number 4 - Exit");
            try {
                Palindrome palindrome = new Palindrome();
                int inputNumber = scanner.nextInt();

                switch (inputNumber) {
                    case 1:
                        System.out.println("Enter a string to check if it is a palindrome");
                        scanner.nextLine();
                        String word = scanner.nextLine();
                        if (palindrome.isPolindrome(word))
                            System.out.println("Entered string is a palindrome.");
                        else
                            System.out.println("Entered string is not a palindrome.");
                        break;
                    case 2:
                        System.out.println("Enter a string to check if it is a palindrome");
                        scanner.nextLine();
                        String word2 = scanner.nextLine();
                        if(palindrome.checkPolindrome(word2))
                            System.out.println("Entered string is a palindrome.");
                        else
                            System.out.println("Entered string is not a palindrome.");
                        break;
                    case 3:
                        System.out.println("Enter a string to check if it is a palindrome");
                        scanner.nextLine();
                        String word3 = scanner.nextLine();
                        if(palindrome.determinePalindrome(word3)){
                            System.out.println("Entered string is a palindrome.");
                        }
                        else
                            System.out.println("Entered string is not a palindrome.");
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Wrong input");
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        } while (exit != true);
    }
}