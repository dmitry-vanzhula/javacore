package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson14.Person;
import com.dvanzhula.app.classwork.lesson14.Student;
import com.dvanzhula.app.classwork.lesson14.Teacher;

/**
 * Created by Dmitry Vanzhula on 11/16/16.
 */
public class Lesson14Runner {
    public static void main(String[] args) {
      /*  Student student = new Student("dima","kpi");
        student.setName("Dawa");
        student.setUniversity("nau");
        System.out.println(student.getUniversity());
        System.out.println(student.getName());
*/
        Student student = new Student("Egor", "Kit Center");
        String response = student.getResponse("What is class?");
        System.out.println(response);

        Teacher teacher = new Teacher("Ivan", "Kit Center");
        teacher.getResponse("What is polymorphism?");

        Person person = new Teacher("Dima","KPI");

    }
}
