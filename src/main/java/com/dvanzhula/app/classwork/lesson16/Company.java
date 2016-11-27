package com.dvanzhula.app.classwork.lesson16;

/**
 * Created by Dmitry Vanzhula on 11/26/16.
 */
public enum Company {

    EBAY(30, "Ebay Inc"), GOOGLE(15, "Google Inc");
        private int value;
        private String fullName;
        Company(int value, String fullName){
            this.value = value;
            this.fullName = fullName;
        }

    public int getValue() {
        return value;
    }
}



