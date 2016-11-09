package com.dvanzhula.app.classwork.lesson3;

/**
 * Created by Dmitry Vanzhula on 08.10.16.
 */
public class NarrowingCasting {
    public int narrowing(int int1, float float1) {
        int1 = (int) float1;
        System.out.println(int1);
        return int1;
    }
}

