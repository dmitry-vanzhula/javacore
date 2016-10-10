package com.dvanzhula.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        String phrase;
        System.out.println("Enter a phrase:");
        phrase = scanner.nextLine();
        System.out.println("Your phrase is" + " " + phrase);
    }
}
