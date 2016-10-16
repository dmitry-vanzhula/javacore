package com.dvanzhula.app.classwork.lesson3;

/**
 * Created by dmitry on 08.10.16.
 */
public class Lesson3NarrowingCasting {

    int int1 = 0;
    float float1 = 3.14159f;


    public void narrowing () {
        int1 = (int) float1;
        System.out.println(int1);
    }

}

