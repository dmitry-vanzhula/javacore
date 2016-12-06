package com.dvanzhula.app.classwork.lesson14;

/**
 * Created by Dmitry Vanzhula on 11/16/16.
 */
public class Bicycle {
    private int diameter;
    private String color;
    private int wheelSize;
    private int frameSize;
    private String breakType;


    public Bicycle(int diameter,String color, int wheelSize, int frameSize, String breakType){
        this.color = color;
        this.wheelSize = wheelSize;
        this.frameSize = frameSize;
        this.breakType = breakType;
        this.diameter = diameter;
    }

    public Bicycle(){
        this.diameter = 26;
        this.color = "red";
        this.frameSize = 20;
        this.breakType = "disk";
    }

    public Bicycle(int diameter){
        this();
        this.diameter = diameter;

    }


}
