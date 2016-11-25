package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson15.Person1;
import com.dvanzhula.app.classwork.lesson15.Pixel;
import com.dvanzhula.app.classwork.lesson15.Student1;
import com.dvanzhula.app.classwork.lesson15.Teacher1;

/**
 * Created by Dmitry Vanzhula on 11/19/16.
 */
public class Lesson15Runner {
    public static void main(String[] args) {
        Pixel pixel = new Pixel(10,20);
        int[] pixelCoordinates = pixel.getCoordinates();


        Student1 student1 = new Student1("Egor", "Kit Center");
        System.out.println(student1.getResponse("What is class?"));
        Teacher1 teacher1 = new Teacher1("Ivan", "Kit Center");
        System.out.println(teacher1.getResponse("What time is now?"));

/* - - - - - - - - - - - - - - - - - - - - - - - */

        Person1 person1 = new Student1("Ilya", "Kit Center");
        System.out.println(person1.getResponse("What is class?"));
        person1 = new Teacher1("Evgeniy", "Kit Center");
        System.out.println(person1.getResponse("What time is now?"));
    }
}
