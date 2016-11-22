package com.dvanzhula.app.homework.lesson13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dmitry Vanzhula on 11/22/2016.
 */
public class MyFileReader {

    public String readNewFile() {
        String inputStr = "";
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("exit")) {
                    break;
                }
                inputStr = inputStr + line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStr;
    }

    public String readNewFileUsingPath(String path) {
        String inputStr = " ";
        try {
            BufferedReader reader = new BufferedReader(
                    new java.io.FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                inputStr = inputStr + line;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStr;
    }
}
