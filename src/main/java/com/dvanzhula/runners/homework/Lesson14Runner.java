package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson14.Human;
import com.dvanzhula.app.homework.lesson14.WhiteCollar;

/**
 * Created by Dmitry Vanzhula on 11/18/2016.
 */
public class Lesson14Runner {

    public static void main(String[] args) {
        Human human = new Human("Dima",20);
        human.setName("Dasha");
        System.out.println(human.getName());
        human.setAge(20);

        System.out.println();

        WhiteCollar whiteCollar = new WhiteCollar("Alfa-Bank", "Sasha",26);
        whiteCollar.setName("Nick");
        System.out.println(whiteCollar.getName());
        whiteCollar.setAge(121);
        whiteCollar.setCompany("Luxoft");
    }
}
