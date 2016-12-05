package com.dvanzhula.app.classwork.lesson19;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 12/3/16.
 */
public class WordList2 {

    public static void main(String[] args) {

        HashSet wordList = new HashSet();
        Scanner scanner = new Scanner(System.in);
        do {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            wordList.add(word);
        } while (true);
        System.out.println(wordList);
    }
}
