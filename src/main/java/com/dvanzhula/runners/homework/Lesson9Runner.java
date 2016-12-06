package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson12.ArrayParser;
import com.dvanzhula.app.homework.lesson16.EnumMenuForHomeworkRunners;
import com.dvanzhula.app.homework.lesson3.PrimitiveConverter;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/2/2016.
 */
public class Lesson9Runner {

    public static void main(String[] args) {
        boolean exit = false;
        do {
            System.out.println();
            System.out.println("Welcome to converter, enter a letter:");
            EnumMenuForHomeworkRunners.A.setDescription("Letter A - Sorting an array of numbers from smallest to largest");
            EnumMenuForHomeworkRunners.B.setDescription("Letter B - Sorting an array of numbers from largest to smallest");
            EnumMenuForHomeworkRunners.C.setDescription("Letter C - Exit");
            for (EnumMenuForHomeworkRunners enumMenu : EnumMenuForHomeworkRunners.values()) {
                System.out.println(enumMenu.getDescription());
            }
            try {
                String choice;
                String inputStr;
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextLine();
                PrimitiveConverter primitiveConverter = new PrimitiveConverter();
                ArrayParser arrayParser = new ArrayParser();
                EnumMenuForHomeworkRunners enumMenu = EnumMenuForHomeworkRunners.valueOf(choice);
                switch (enumMenu) {
                    case A:
                        System.out.println("Enter the array of numbers separated by comma:");
                        inputStr = scanner.nextLine();
                        System.out.println("Your result:");
                        OutputPrint.showOutputResultForString(arrayParser.convertIntArrayToStringAndSplitByComma(arrayParser.sortFromSmallestToBigger(arrayParser.convertStringToIntArray(inputStr))));
                        break;
                    case B:
                        System.out.println("Enter the array of numbers separated by comma:");
                        inputStr = scanner.nextLine();
                        System.out.println("Your result:");
                        OutputPrint.showOutputResultForString(arrayParser.convertIntArrayToStringAndSplitByComma(arrayParser.sortFromBiggerToSmallest(arrayParser.convertStringToIntArray(inputStr))));
                        break;
                    case C:
                        exit = true;
                        break;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("ERROR! Wrong input");
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR! Wrong input");
            }
        } while (exit != true);
    }
}