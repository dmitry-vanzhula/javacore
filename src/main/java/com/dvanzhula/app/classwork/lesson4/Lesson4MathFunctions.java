package com.dvanzhula.app.classwork.lesson4;

/**
 * Created by dmitry on 12.10.16.
 */

public class Lesson4MathFunctions {

    public  static int multiply (int a, int b){
        return a * b;
    }

    public static String addition(String a, String b){
        String result = a + b;
        return result;
    }

    public static int subtraction(int a, int b){
        int result = a - b;
        return result;
    }

    public static double chooseMaxNumber(double a, double b){
        double result = Math.max(a,b);
        return result;
    }

    public static double getSquareRoot(double a){
        double result = Math.sqrt(a);
        return result;
    }

    public static double power(double a, double b) {
        double result = Math.pow(a,b);
        return result;
    }

    public static boolean isOddNumber(int number){

        boolean result = false;
        if (number % 2 > 0) {
            System.out.println("true");
            result = true;
        } else {
            System.out.println("false");
        }
        return result;
    }


}
