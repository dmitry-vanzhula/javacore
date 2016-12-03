package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson17.BoxPrinter;

/**
 * Created by Dmitry Vanzhula on 11/30/16.
 */
public class Lesson17Runner {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);

// Here is runtime error of class casting assignment

        Integer intValue2 = (Integer) value2.getValue();
    }
}
