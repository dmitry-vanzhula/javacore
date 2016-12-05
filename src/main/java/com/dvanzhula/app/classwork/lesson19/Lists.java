package com.dvanzhula.app.classwork.lesson19;

import java.util.ArrayList;

/**
 * Created by Dmitry Vanzhula on 12/3/16.
 */
public class Lists {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        String string1 = "dima";
        myList.add(string1);
        String string2 = "sasha";
        myList.add(string2);
        int theSize = myList.size();
        System.out.println("List size is " + theSize);
        System.out.println("Index of \"" + string1 + "\" is " + myList.indexOf(string1));
        System.out.println(myList);
        boolean isIn = myList.contains(string2);
        System.out.println(isIn);
        myList.remove(0);
        System.out.println(myList);
        int index = myList.indexOf(string2);

    }

}
