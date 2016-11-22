package com.dvanzhula.app.homework.Lesson12;

/**
 * Created by Dmitry Vanzhula on 11/11/2016.
 */
public class ArrayParser {
    public int[] sortFromSmallestToBigger(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }

    public int[] sortFromBiggerToSmallest(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }

    public String convertIntArrayToStringAndSplitBySemicolon(int[] array) {
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

    public String convertIntArrayToStringAndSplitByComma(int[] array) {
        StringBuilder stringBuilder = new StringBuilder(array.length);
        stringBuilder.append(array);
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            if (i != array.length-1) {
                result = result + ",";
            }
        }
        return result;
    }

    public boolean checkKeyWord(String sentence,String keyWord){
        boolean isKeyWord;
        if(sentence.indexOf(keyWord)!= -1){
            String newString = sentence.replaceAll(keyWord,"");
            String[] stringArray = newString.split(" ");
            for (String array : stringArray)
                System.out.println(array);
            isKeyWord = true;
        }else{
            System.out.println(sentence);
            isKeyWord = false;
        }
        return isKeyWord;
    }
    public int[] convertStringToIntArray(String inputStr) {
        String[] strArray = inputStr.replaceAll(";",",").replaceAll("\\s", "").split(",");
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        return array;
    }
}

