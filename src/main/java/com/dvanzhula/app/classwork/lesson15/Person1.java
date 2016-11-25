package com.dvanzhula.app.classwork.lesson15;

/**
 * Created by Dmitry Vanzhula on 11/23/16.
 */
public class Person1 {

    protected String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getResponse(String question) {
        return "My answer is " + question;
    }
}