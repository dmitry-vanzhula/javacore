package com.dvanzhula.app.classwork.lesson13;

import java.io.*;

/**
 * Created by Dmitry Vanzhula on 11/12/16.
 */
public class FileReaderPolindrome {

    private static final String INPUT_PATH = "/home/dmitry/Projects/javacore/src/test/resources/inputPolindrome.csv";
    private static final String OUTPUT_PATH = "src/test/resources/outputPolindrome.csv";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(OUTPUT_PATH)));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(new StringBuilder(line).reverse().toString())) {
                    writer.append(line + " = polindrome");
                } else {
                    writer.append(line + " = not polindrome");
                }
                writer.newLine();
            }
            writer.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }
}