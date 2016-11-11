package com.dvanzhula.app.classwork.lesson11;

/**
 * Created by Dmitry Vanzhula on 11/10/2016.
 */
public class EnigmaCipher {

    public static final String PRIMARY_KEY = "ABCDEFGHLKMO";
    public static final String Cipher_KEY = "OMKLHGFEDCBA";

    public String encodeString(String inputStr) {
        StringBuilder stringBuilder = new StringBuilder(inputStr);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int k = 0; k < PRIMARY_KEY.length(); k++) {
                if (stringBuilder.charAt(i) == PRIMARY_KEY.charAt(k)) {
                    stringBuilder.setCharAt(i, Cipher_KEY.charAt(k));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}