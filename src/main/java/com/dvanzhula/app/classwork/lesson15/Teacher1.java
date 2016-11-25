package com.dvanzhula.app.classwork.lesson15;

/**
 * Created by Dmitry Vanzhula on 11/23/16.
 */
public class Teacher1 extends Person1 {

    private String university;

    public Teacher1(String name, String university) {
        super(name);
        this.university = university;
    }

    public String lessonFinished() {
        return "Do not forget to make homework!";
    }
}