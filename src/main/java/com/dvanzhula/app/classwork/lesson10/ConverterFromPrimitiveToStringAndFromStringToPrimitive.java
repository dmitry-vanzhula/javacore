package com.dvanzhula.app.classwork.lesson10;

/**
 * Created by dmitry on 11/2/16.
 */
public class ConverterFromPrimitiveToStringAndFromStringToPrimitive {

    public String convertIntToString(int myInt) {
        String stringInt = String.valueOf(myInt);
        System.out.println(stringInt);
        return stringInt;
    }

    public String convertFloatToString(float myFloat) {
        String stringFloat = String.valueOf(myFloat);
        System.out.println(stringFloat);
        return stringFloat;
    }

    public String convertDoubleToString(double myDouble) {
        String stringDouble = String.valueOf(myDouble);
        System.out.println(stringDouble);
        return stringDouble;
    }

    public String convertBooleanToString(boolean myBoolean) {
        String stringBoolean = String.valueOf(myBoolean);
        System.out.println(stringBoolean);
        return stringBoolean;
    }

    public int convertStringToInt(String myString){
        int int1 = Integer.valueOf(myString);
        System.out.println(int1);
        return int1;
    }

    public float convertStringToFloat(String myString){
        float float1 = Float.valueOf(myString);
        System.out.println(float1);
        return float1;
    }

    public double convertStringToDouble(String myString){
        double double1 = Double.valueOf(myString);
        System.out.println(double1);
        return double1;
    }

    public boolean convertStringToBoolean(String myString){
        boolean boolean1 = Boolean.valueOf(myString);
        System.out.println(boolean1);
        return boolean1;
    }
}
