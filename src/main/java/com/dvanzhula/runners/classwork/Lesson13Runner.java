package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson13.Student;

/**
 * Created by Dmitry Vanzhula on 11/16/16.
 */
public class Lesson13Runner {
    public static void main(String[] args) {
        Student student = new Student("dima","kpi");
        student.setName("Dawa");
        student.setUniversity("nau");
        System.out.println(student.getUniversity());
        System.out.println(student.getName());

    }
}
