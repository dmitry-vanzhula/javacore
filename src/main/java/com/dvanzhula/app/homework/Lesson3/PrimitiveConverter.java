package com.dvanzhula.app.homework.lesson3;

/**
 * Created by Dmitry Vanzhula on 09.10.16.
 */

public class PrimitiveConverter {

    public char floatToChar(float floatNumber) {
        char charSymbol = (char) floatNumber;
        System.out.println("Input float value is" + " " + floatNumber + " " + "Output char value is" + " " + charSymbol);
        return charSymbol;
    }

    public char intToChar(int intNumber) {
        char charSymbol2 = (char) intNumber;
        System.out.println("Input int value is" + " " + intNumber + " " + "Output char value is" + " " + charSymbol2);
        return charSymbol2;
    }

    public int charToInt(char charSymbol3) {
        int intNumber2 = (int) charSymbol3;
        System.out.println("Input char value is" + " " + charSymbol3 + " " + "Output int value is" + " " + intNumber2);
        return intNumber2;
    }
}
