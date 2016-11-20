package com.dvanzhula.app.classwork.lesson15;

/**
 * Created by Dmitry Vanzhula on 11/19/16.
 */
public class Pixel {

    private int x;
    private int y;

    public Pixel(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinates(){
        int[] res = {x,y};
        return res;
    }
}
