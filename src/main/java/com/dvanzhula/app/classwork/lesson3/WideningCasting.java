package com.dvanzhula.app.classwork.lesson3;

/**
 * Created by dmitry on 08.10.16.
 */
public class WideningCasting {
    public static double widening(int int1, long long1, float float1, double double1 ){
            double1 = float1 = long1 = int1;
            System.out.println(double1);
            return double1;
    }
}
