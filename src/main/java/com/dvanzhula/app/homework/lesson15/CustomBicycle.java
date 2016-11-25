package com.dvanzhula.app.homework.lesson15;

/**
 * Created by Dmitry Vanzhula on 11/24/2016.
 */
public class CustomBicycle extends Bicycle1 {

    int speed;
    int gear;

    @Override
    public void setGear(int speed) {
     this.speed = speed;
        System.out.println("Size of gear is " + speed);
    }

    @Override
    public void setSpeed(int gear){
        this.gear = gear;
        System.out.println("Current speed is " + gear);
    }

    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }


}
