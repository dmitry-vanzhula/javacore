package com.dvanzhula.app.classwork.lesson14;

/**
 * Created by Dmitry Vanzhula on 11/16/16.
 */
public class Person {

    private String name;

    public Person(String name){
        this.name  = name;
    }

    public String setName(String name){
        this.name = name;
        return name;

    }

    public String getName (){
        return name;
    }


}
