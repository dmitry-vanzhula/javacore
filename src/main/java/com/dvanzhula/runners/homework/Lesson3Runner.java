package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.PrimitiveConvertor;

/**
 * Created by dmitry on 09.10.16.
 */
public class Lesson3Runner {

    public static void main(String[] args) {

PrimitiveConvertor pc = new PrimitiveConvertor();
        pc.floatToChar(11.999f);
        pc.intToChar(666);
        pc.charToInt('*');
    }
}
