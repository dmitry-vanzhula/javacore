package com.dvanzhula.app.classwork.lesson15;

/**
 * Created by Dmitry Vanzhula on 11/19/16.
 */
public class Line {

   private Pixel [] line = new Pixel[2];

    public Line (Pixel pixel1, Pixel pixel2){
        this.line[0] = pixel1;
        this.line[1] = pixel2;
    }

    public void addPixel(Pixel pixel){
        Pixel[] newLine = new Pixel[line.length +1];
        for(int i = 0; i < line.length;i++){
            newLine[i] = line[i];
        }
        newLine[newLine.length -1] = pixel;
        line = newLine;
    }

}
