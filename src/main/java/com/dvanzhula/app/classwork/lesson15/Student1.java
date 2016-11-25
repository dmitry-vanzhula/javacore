package com.dvanzhula.app.classwork.lesson15;

/**
 * Created by Dmitry Vanzhula on 11/23/16.
 */
public class Student1 extends Person1{

    private String university;

    public Student1(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question) {
        return "Ehhh, what was the question?";
    }
}