package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson16.EnumMenuForHomeworkRunners;
import com.dvanzhula.app.homework.lesson3.PrimitiveConverter;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 09.10.16.
 */
public class Lesson3Runner {

    public static void main(String[] args) {

        boolean exit = false;
        do {
            System.out.println("Welcome to converter, enter a letter:");
            EnumMenuForHomeworkRunners.A.setDescription("Letter A - Convert a floating point number to character");
            EnumMenuForHomeworkRunners.B.setDescription("Letter B - convert an integer to character");
            EnumMenuForHomeworkRunners.C.setDescription("Letter C - Convert character to integer");
            EnumMenuForHomeworkRunners.D.setDescription("Letter D - Exit");
            for(EnumMenuForHomeworkRunners enumMenu : EnumMenuForHomeworkRunners.values()){
                System.out.println(enumMenu.getDescription());
            }
            try {
                float inputFloat;
                int inputInt;
                char inputChar;
                String choice;
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextLine();
                PrimitiveConverter primitiveConverter = new PrimitiveConverter();
                EnumMenuForHomeworkRunners enumMenu = EnumMenuForHomeworkRunners.valueOf(choice);
                switch (choice) {
                    case "A":
                        System.out.println("Enter enter a floating point number:");
                        inputFloat = scanner.nextFloat();
                        System.out.println("Your result:");
                        primitiveConverter.floatToChar(inputFloat);
                        break;
                    case "B":
                        System.out.println("Enter an integer number:");
                        inputInt = scanner.nextInt();
                        System.out.println("Your result:");
                        primitiveConverter.intToChar(inputInt);
                        break;
                    case "C":
                        System.out.println("Enter the character:");
                        inputChar = scanner.next().charAt(0);
                        System.out.println("Your result:");
                        primitiveConverter.charToInt(inputChar);
                        break;
                    case "D":
                        exit = true;
                        break;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("ERROR! Wrong input");
            } catch (IllegalArgumentException e){
                System.out.println("ERROR! Wrong input");
            }
        } while (exit != true);
    }
}