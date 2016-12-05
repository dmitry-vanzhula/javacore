package com.dvanzhula.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 12/3/16.
 */
public class WordList {
    public static void main(String[] args) {
      /*  ArrayList<String> wordList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        do {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            wordList.add(word);

        } while (true);
        System.out.println(wordList); */

        ArrayList<Word> wordsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word or \"exit\"");
        do {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            wordsList.add(new Word(word));
        } while (true);
        System.out.println(wordsList);
        for(Word item: wordsList) {
            System.out.println(item.hashCode());
        }
        System.out.println(wordsList.get(0).equals(wordsList.get(1)));
        HashSet<Word> hashSet = new HashSet<>();
        hashSet.add(wordsList.get(0));
        hashSet.add(wordsList.get(1));
        System.out.println(hashSet);
    }
}

