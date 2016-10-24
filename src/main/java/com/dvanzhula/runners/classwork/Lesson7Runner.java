package com.dvanzhula.runners.classwork;

import java.util.Scanner;

/**
 * Created by dmitry on 10/22/16.
 */
public class Lesson7Runner {
    public static void main(String[] args) {

        Lesson7Runner lesson7Runner = new Lesson7Runner();
        lesson7Runner.counter2();
    }

    public static void comparingTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();

        while (a >= b) {
            System.out.println("Your a is " + a + " " + "your b is " + b);
            a = a - 1;
        }
        if (a <= b) {
            System.out.println("Your a is " + a + " " + "your b is " + b);
        }
    }

    public static void counter() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void increment() {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment " + a);
    }

    public static void counter2() {
        int k = 0;
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i);
            k++;
        }
        System.out.println();
        System.out.println(k);
    }
}