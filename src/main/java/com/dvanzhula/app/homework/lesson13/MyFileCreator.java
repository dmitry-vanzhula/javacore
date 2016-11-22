package com.dvanzhula.app.homework.lesson13;

import java.io.File;

/**
 * Created by Dmitry Vanzhula on 11/22/2016.
 */
public class MyFileCreator {

    public File createNewFile (String fileName){
        File newFile = new File("src/test/resources/" + fileName + ".csv");
        return newFile;
    }
}
