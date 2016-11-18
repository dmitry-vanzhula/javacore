package com.dvanzhula.app.homework.lesson14;

/**
 * Created by Dmitry Vanzhula on 11/18/2016.
 */
public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > 0 && age < 121) {
            System.out.println("New age setted");
        } else {
            System.out.println("Age invalid");
        }
    }
}
