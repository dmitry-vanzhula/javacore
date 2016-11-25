package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson15.Bicycle1;
import com.dvanzhula.app.homework.lesson15.BicycleWithRing;
import com.dvanzhula.app.homework.lesson15.BicycleWithRingInterface;
import com.dvanzhula.app.homework.lesson15.CustomBicycle;

/**
 * Created by Dmitry Vanzhula on 11/24/2016.
 */
public class Lesson15Runner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();

        Bicycle1 bicycle1 = new CustomBicycle();
        bicycle1.setSpeed(120);
        bicycle1.setGear(20);
        bicycle1.ride();
    }
}