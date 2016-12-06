package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson12.ArrayParser;
import com.dvanzhula.app.homework.lesson12.Enigma;
import com.dvanzhula.app.homework.lesson16.EnumMenuForHomeworkRunners;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/11/2016.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        boolean exit = false;
        do {
            System.out.println(" ");
            System.out.println("Enter a letter:");
            EnumMenuForHomeworkRunners.A.setDescription("Letter A - Task 'A'");
            EnumMenuForHomeworkRunners.B.setDescription("Letter B - Task 'B'");
            EnumMenuForHomeworkRunners.C.setDescription("Letter C - Task 'C'");
            EnumMenuForHomeworkRunners.D.setDescription("Letter D - Task 'D'");
            EnumMenuForHomeworkRunners.E.setDescription("Letter E - Exit)");
            for(EnumMenuForHomeworkRunners enumMenu : EnumMenuForHomeworkRunners.values()){
                System.out.println(enumMenu.getDescription());
            }
            try {
                String choice;
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextLine();
                ArrayParser arrayParser = new ArrayParser();
                Enigma enigma = new Enigma();
                EnumMenuForHomeworkRunners enumMenu = EnumMenuForHomeworkRunners.valueOf(choice);
                switch (enumMenu) {
                    case A:
                        System.out.println("Type numbers in a row, separated by semicolon");
                        String inputStr = scanner.nextLine();
                        System.out.println("How to sort an array?");
                        System.out.println("Letter a - From smallest to bigger");
                        System.out.println("Letter b - From bigger to smallest");
                        System.out.println("Letter c - Exit");
                        try {
                            String choice2 = scanner.nextLine();
                            enumMenu = EnumMenuForHomeworkRunners.valueOf(choice2);
                            switch (enumMenu) {
                                case a:
                                    System.out.println("Your result:");
                                    OutputPrint.showOutputResultForString(arrayParser.convertIntArrayToStringAndSplitBySemicolon(arrayParser.sortFromSmallestToBigger(arrayParser.convertStringToIntArray(inputStr))));
                                    break;
                                case b:
                                    System.out.println("Your result:");
                                    OutputPrint.showOutputResultForString(arrayParser.convertIntArrayToStringAndSplitBySemicolon(arrayParser.sortFromBiggerToSmallest(arrayParser.convertStringToIntArray(inputStr))));
                                    break;
                                case c:
                                    break;
                                default:
                                    System.out.println("Wrong input");
                            }
                        } catch (java.util.InputMismatchException e1) {
                            System.out.println("Error, wrong input. Please enter a valid number!");
                        }
                        break;
                    case B:
                        System.out.println("Type array of chars in a row, separated by comma");
                        String inputSt = scanner.nextLine();
                        String replaceInputSt = inputSt.replaceAll("[0-9,&,%,^,:,;,*,?,/,#,№,!,@,_,+,$,(,),~,|,{,},>,<,.,-]", "").replaceAll("\\s", "").replaceAll("\\[]","");
                        char[] array2 = replaceInputSt.toCharArray();
                        arrayParser.convertCharArrayToStringAndSplitByComma(array2);
                        System.out.println("Your result:");
                        OutputPrint.showOutputResultForString(arrayParser.convertCharArrayToStringAndSplitByComma(array2));
                        break;
                    case C:
                        System.out.println("Enter the string");
                        String sentence = scanner.nextLine();
                        System.out.println("Enter key word");
                        String keyWord = scanner.nextLine();
                        arrayParser.checkKeyWord(sentence, keyWord);
                        break;
                    case D:
                        System.out.println("Enter the sentence");
                        String sentence2 = scanner.nextLine();
                        System.out.println("Letter a - Encrypt string");
                        System.out.println("Letter b - Decrypt string");
                        System.out.println("Letter c - Exit");
                        try {
                            String choiceEnigma = scanner.nextLine();
                            enumMenu = EnumMenuForHomeworkRunners.valueOf(choiceEnigma);
                            switch (enumMenu) {
                                case a:
                                    System.out.println("Encrypted string:");
                                    enigma.encodeString(sentence2);
                                    break;
                                case b:
                                    System.out.println("Decrypted string:");
                                    enigma.decodeString(sentence2);
                                    break;
                                case c:
                                    break;
                                default:
                                    System.out.println("ERROR! Wrong input");
                            }
                        }catch (InputMismatchException e){
                            System.out.println("ERROR! Wrong input");
                        }
                        break;
                    case E:
                        exit = true;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        } while (exit != true);
    }
}