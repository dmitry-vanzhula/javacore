package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson3.NarrowingCasting;
import com.dvanzhula.app.classwork.lesson3.WideningCasting;

/**
 * Created by Dmitry Vanzhula on 08.10.16.
 */
public class Lesson3Runner {

    public static void main(String[] args) {

        int inputInt = 0;
        System.out.println("Input int number:");
        System.out.println(inputInt);
        float inputFloat = 3.14159f;
        System.out.println("Input float number:");
        System.out.println(inputFloat);
        NarrowingCasting narrowingCasting = new NarrowingCasting();
        System.out.println("Narrowed number:" );
        narrowingCasting.narrowing(inputInt,inputFloat);
        System.out.println("");

        int inputInt2 = 127;
        System.out.println("Input int number:");
        System.out.println(inputInt2);
        long inputLong2 = 0;
        System.out.println("Input long number:");
        System.out.println(inputLong2);
        float inputFloat2 = 0.0f;
        System.out.println("Input float number:");
        System.out.println(inputFloat2);
        double inputDouble2 = 0.0d;
        System.out.println("Input double number:");
        System.out.println(inputDouble2);
        WideningCasting wideningCasting = new WideningCasting();
        System.out.println("Casted number:");
        wideningCasting.widening(inputInt2,inputLong2,inputFloat,inputDouble2);

    }
}
