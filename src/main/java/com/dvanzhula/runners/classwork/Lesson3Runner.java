package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson3.NarrowingCasting;
import com.dvanzhula.app.classwork.lesson3.WideningCasting;

/**
 * Created by dmitry on 08.10.16.
 */
public class Lesson3Runner {

    public static void main(String[] args) {
       NarrowingCasting narrowingCasting = new NarrowingCasting();
        narrowingCasting.narrowing(0,3.14159f);


        WideningCasting wideningCasting = new WideningCasting();
        wideningCasting.widening(127,0,0.0f,0.0d);

    }
}
