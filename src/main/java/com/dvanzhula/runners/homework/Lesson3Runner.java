package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.Lesson3.PrimitiveConverter;

/**
 * Created by Dmitry Vanzhula on 09.10.16.
 */
public class Lesson3Runner {

    public static void main(String[] args) {

        float inputFloat = 44.0f;
        int inputInt = 66;
        char inputChar = ('*');

        PrimitiveConverter primitiveConverter = new PrimitiveConverter();
        primitiveConverter.floatToChar(inputFloat);
        primitiveConverter.intToChar(inputInt);
        primitiveConverter.charToInt(inputChar);
    }
}
