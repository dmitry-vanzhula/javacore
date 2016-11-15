package com.dvanzhula.app.homework.Lesson12;

/**
 * Created by Dmitry Vanzhula on 11/15/2016.
 */
public class Enigma {

    public static final String PRIMARY_KEY = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345 67890";
    public static final String Cypher_KEY = "ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba0 987654321";

    public String encodeString(String inputStr) {
        StringBuilder stringBuilder = new StringBuilder(inputStr);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int k = 0; k < PRIMARY_KEY.length(); k++) {
                if (stringBuilder.charAt(i) == PRIMARY_KEY.charAt(k)) {
                    stringBuilder.setCharAt(i, Cypher_KEY.charAt(k));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public String decodeString(String inputStr) {
        StringBuilder stringBuilder = new StringBuilder(inputStr);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int k = 0; k < Cypher_KEY.length(); k++) {
                if (stringBuilder.charAt(i) == Cypher_KEY.charAt(k)) {
                    stringBuilder.setCharAt(i, PRIMARY_KEY.charAt(k));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
