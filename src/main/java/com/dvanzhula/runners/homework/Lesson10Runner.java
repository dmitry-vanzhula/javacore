package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson10.Palindrome2;
import com.dvanzhula.app.homework.lesson16.EnumMenuForHomeworkRunners;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/4/16.
 */
public class Lesson10Runner {
    public static void main(String[] args) {

        boolean exit = false;
        do {
            System.out.println("");
            System.out.println("Choose your program, enter a letter:");
            EnumMenuForHomeworkRunners.A.setDescription("Letter A - Program to check palindrome string (version1)");
            EnumMenuForHomeworkRunners.B.setDescription("Letter B - Program to check palindrome string (version2)");
            EnumMenuForHomeworkRunners.C.setDescription("Letter C - Program to check palindrome string (version3)");
            EnumMenuForHomeworkRunners.D.setDescription("Letter D - Exit");
            for(EnumMenuForHomeworkRunners enumMenu: EnumMenuForHomeworkRunners.values()){
                System.out.println(enumMenu.getDescription());
            }
            try {
                Palindrome2 palindrome = new Palindrome2();
                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();
                EnumMenuForHomeworkRunners enumMenu = EnumMenuForHomeworkRunners.valueOf(choice);
                switch (enumMenu) {
                    case A:
                        System.out.println("Enter a string to check if it is a palindrome");
                        String word = scanner.nextLine();
                        if (palindrome.isPolindrome(word))
                            System.out.println("Entered string is a palindrome.");
                        else
                            System.out.println("Entered string is not a palindrome.");
                        break;
                    case B:
                        System.out.println("Enter a string to check if it is a palindrome");
                        String word2 = scanner.nextLine();
                        if(palindrome.checkPolindrome(word2))
                            System.out.println("Entered string is a palindrome.");
                        else
                            System.out.println("Entered string is not a palindrome.");
                        break;
                    case C:
                        System.out.println("Enter a string to check if it is a palindrome");
                        String word3 = scanner.nextLine();
                        if(palindrome.determinePalindrome(word3)){
                            System.out.println("Entered string is a palindrome.");
                        }
                        else
                            System.out.println("Entered string is not a palindrome.");
                        break;
                    case D:
                        exit = true;
                        break;
                    default:
                        System.out.println("Error, wrong input! Please enter a valid letter!");
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        } while (exit != true);
    }
}