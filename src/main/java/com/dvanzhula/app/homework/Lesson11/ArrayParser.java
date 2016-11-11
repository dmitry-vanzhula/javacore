package com.dvanzhula.app.homework.Lesson11;

/**
 * Created by Dmitry Vanzhula on 11/11/2016.
 */
public class ArrayParser {
    public char[] sortFromSmallestToBigger(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    char temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }

    public char[] sortFromBiggerToSmallest(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    char temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }

    public String convertCharArrayToStringAndSplitBySemicolon(char[] array) {
        StringBuilder stringBuilder = new StringBuilder(array.length);
        stringBuilder.append(array);
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            if (i != array.length) {
                result = result + ";";
            }
        }
        return result;
    }

    public String convertCharArrayToStringAndSplitByComma(char[] array) {
        StringBuilder stringBuilder = new StringBuilder(array.length);
        stringBuilder.append(array);
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            if (i != array.length - 1) {
                result = result + ",";
            }
        }
        return result;
    }

    public boolean checkKeyWord(String sentence,String keyWord){
        boolean isKeyWord;
        if(sentence.indexOf(keyWord)!= -1){
            String newString = sentence.replaceAll(keyWord,"");
            System.out.println(newString);
            isKeyWord = true;
        }else{
            System.out.println(sentence);
            isKeyWord = false;
        }
        return isKeyWord;
    }
}

