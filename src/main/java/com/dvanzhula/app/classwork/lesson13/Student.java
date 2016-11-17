package com.dvanzhula.app.classwork.lesson13;

/**
 * Created by Dmitry Vanzhula on 11/16/16.
 */
public class Student extends Person {

    private String university;

    public Student (String name, String university){
        super(name);// call parent (super) class constructor
        this.university = university;
    }

    public String getResponse(String question) { // method

        return "Ehhh, what was the question?";
    }


    public String setUniversity(String university){
        this.university = university;
        return university;
    }

    public String getUniversity(){
        return university;
    }



}
