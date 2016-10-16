package com.dvanzhula.app.runners.homework;

import com.dvanzhula.app.homework.Lesson3PrimitiveConvertor;

/**
 * Created by dmitry on 09.10.16.
 */
public class Lesson3Runner {

    public static void main(String[] args) {

Lesson3PrimitiveConvertor pc = new Lesson3PrimitiveConvertor();
        pc.floatToChar(11.999f);
        pc.intToChar(666);
        pc.charToInt('*');
    }
}
