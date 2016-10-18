package com.dvanzhula.app.runners.classwork;

import com.dvanzhula.app.classwork.lesson3.Lesson3NarrowingCasting;
import com.dvanzhula.app.classwork.lesson3.Lesson3WideningCasting;

/**
 * Created by dmitry on 08.10.16.
 */
public class Lesson3Runner {

    public static void main(String[] args) {
       Lesson3NarrowingCasting narrowingCasting = new Lesson3NarrowingCasting();
        narrowingCasting.narrowing(0,3.14159f);


        Lesson3WideningCasting wideningCasting = new Lesson3WideningCasting();
        wideningCasting.widening(127,0,0.0f,0.0d);

    }
}
