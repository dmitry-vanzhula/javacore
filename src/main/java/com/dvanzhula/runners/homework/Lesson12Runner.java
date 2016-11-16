package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.Lesson12.ArrayParser;
import com.dvanzhula.app.homework.Lesson12.Enigma;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/11/2016.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        boolean exit = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Enter a number 1-4:");
            System.out.println(" ");
            System.out.println("Number 1 - Task 'A'");
            System.out.println("Number 2 - Task 'B'");
            System.out.println("Number 3 - Task 'C'");
            System.out.println("Number 4 - Task 'D'");
            System.out.println("Number 5 - Exit");
            try {
                int inputNumber = scanner.nextInt();
                ArrayParser arrayParser = new ArrayParser();
                Enigma enigma = new Enigma();

                switch (inputNumber) {
                    case 1:
                        System.out.println("Type numbers in a row, separated by semicolon");
                        scanner.nextLine();
                        String inputStr = scanner.nextLine();
                        System.out.println("How to sort an array?");
                        System.out.println("Number 1 - From smallest to bigger");
                        System.out.println("Number 2 - From bigger to smallest");
                        System.out.println("Number 3 - Exit");
                        try {
                            int choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("Your result:");
                                    OutputPrint.showOutputResultForString(arrayParser.convertIntArrayToStringAndSplitBySemicolon(arrayParser.sortFromSmallestToBigger(arrayParser.convertStringToIntArray(inputStr))));
                                    break;
                                case 2:
                                    System.out.println("Your result:");
                                    OutputPrint.showOutputResultForString(arrayParser.convertIntArrayToStringAndSplitBySemicolon(arrayParser.sortFromBiggerToSmallest(arrayParser.convertStringToIntArray(inputStr))));
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Wrong input");
                            }
                        } catch (java.util.InputMismatchException e1) {
                            System.out.println("Error, wrong input. Please enter a valid number!");
                        }
                        break;
                    case 2:
                        scanner.nextLine();
                        System.out.println("Type array of chars in a row, separated by comma");
                        String inputSt = scanner.nextLine();
                        String replaceInputSt = inputSt.replaceAll("[0-9,&,%,^,:,;,*,?,/,#,№,!,@,_,+,$,(,),~,|,{,},>,<,.,-]", "").replaceAll("\\s", "").replaceAll("\\[]","");
                        char[] array2 = replaceInputSt.toCharArray();
                        arrayParser.convertCharArrayToStringAndSplitByComma(array2);
                        System.out.println("Your result:");
                        OutputPrint.showOutputResultForString(arrayParser.convertCharArrayToStringAndSplitByComma(array2));
                        break;
                    case 3:
                        scanner.nextLine();
                        System.out.println("Enter the string");
                        String sentence = scanner.nextLine();
                        System.out.println("Enter key word");
                        String keyWord = scanner.nextLine();
                        arrayParser.checkKeyWord(sentence, keyWord);
                        break;
                    case 4:
                        scanner.nextLine();
                        System.out.println("Enter the sentence");
                        String sentence2 = scanner.nextLine();
                        System.out.println("Number 1 - Encrypt string");
                        System.out.println("Number 2 - Decrypt string");
                        try {

                            int choiceEnigma = scanner.nextInt();
                            switch (choiceEnigma) {
                                case 1:
                                    System.out.println("Encrypted string:");
                                    enigma.encodeString(sentence2);
                                    break;
                                case 2:
                                    System.out.println("Decrypted string:");
                                    enigma.decodeString(sentence2);
                                    break;
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Wrong input");
                        }

                        break;
                    case 5:
                        exit = true;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        } while (exit != true);
    }
}