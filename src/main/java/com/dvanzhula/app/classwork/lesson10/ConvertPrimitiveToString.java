package com.dvanzhula.app.classwork.lesson10;

/**
 * Created by dmitry on 11/2/16.
 */
public class ConvertPrimitiveToString {
    public static void main(String[] args) {


        String myInt = String.valueOf(1);
        String myFloat = String.valueOf(1.111f);
        String myDouble = String.valueOf(1.3d);
        String myBoolen = String.valueOf(true);


        String myInt1 = String.valueOf(4);
        int int1 = Integer.valueOf(myInt);
        String myFloat1 = String.valueOf(5.55f);
        float float1 = Float.valueOf(myFloat1);
        String myDouble1 = String.valueOf(5.5d);
        double double1 = Double.valueOf(myDouble);
        String myBoolen1 = String.valueOf(true);
        Boolean mybool1 = Boolean.valueOf(myBoolen1);


    }
}
