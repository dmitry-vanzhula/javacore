package com.dvanzhula.app.classwork.lesson13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Dmitry Vanzhula on 11/12/16.
 */
public class FileReaderLesson13 {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(
                    new java.io.FileReader("/home/dmitry/Projects/javacore/src/test/resources/info"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("file not found");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Error");
        }
    }
}