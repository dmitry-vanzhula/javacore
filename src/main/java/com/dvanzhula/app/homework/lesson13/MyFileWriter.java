package com.dvanzhula.app.homework.lesson13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 * Created by Dmitry Vanzhula on 11/22/2016.
 */
public class MyFileWriter {

    public void writeNewFile(String inputStr, File path) {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new java.io.FileWriter(path));
            writer.write(inputStr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
            }
        }

    }
}
