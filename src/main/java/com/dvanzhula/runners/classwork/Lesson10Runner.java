package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson10.ArrayOfCharsToString;
import com.dvanzhula.app.classwork.lesson10.ConverterFromPrimitiveToStringAndFromStringToPrimitive;
import com.dvanzhula.app.classwork.lesson10.Palindrome;

import java.util.Scanner;

/**
 * Created by dmitry on 11/2/16.
 */
public class Lesson10Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your program, enter a number 1-4:");
        System.out.println("Number 1 - converter arrays of characters into string");
        System.out.println("Number 2 - determine whether the word is a palindrome");
        System.out.println("Number 3 - convert int to string");
        System.out.println("Number 4 - convert float to string");
        System.out.println("Number 5 - convert double to string");
        System.out.println("Number 6 - convert boolean to string");
        System.out.println("Number 7 - convert string to int");
        System.out.println("Number 8 - convert string to float");
        System.out.println("Number 9 - convert string to double");
        System.out.println("Number 10 - convert string to boolean");
        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1:
                System.out.println("Type the characters separated by commas");
                scanner.nextLine();
                String str = scanner.nextLine();
                String[] strings = str.split(",");
                char[] chars = new char[strings.length];
                for (int i = 0; i < strings.length; i++) {
                    String string = strings[i];
                    chars[i] = string.charAt(0);
                }
                ArrayOfCharsToString.convertCharToString(chars);
                    break;
            case 2:
                System.out.println("Type the word");
                scanner.nextLine();
                String inputData = scanner.nextLine();
                Palindrome.isPalindrome(inputData);
                break;
            case 3:
                scanner.nextLine();
                System.out.println("Type the int number");
                int inputInt = scanner.nextInt();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertIntToString(inputInt);
                break;
            case 4:
                scanner.nextLine();
                System.out.println("Type the float number");
                float inputFloat = scanner.nextFloat();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertFloatToString(inputFloat);
                break;
            case 5:
                scanner.nextLine();
                System.out.println("Type the double number");
                double inputDouble = scanner.nextDouble();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertDoubleToString(inputDouble);
                break;
            case 6:
                scanner.nextLine();
                System.out.println("Type the boolean");
                boolean inputBoolean = scanner.nextBoolean();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertBooleanToString(inputBoolean);
                break;
            case 7:
                scanner.nextLine();
                System.out.println("Type the String");
                String inputString = scanner.nextLine();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertStringToInt(inputString);
                break;
            case 8:
                scanner.nextLine();
                System.out.println("Type the String");
                String inputString2 = scanner.nextLine();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertStringToFloat(inputString2);
                break;
            case 9:
                scanner.nextLine();
                System.out.println("Type the String");
                String inputString3 = scanner.nextLine();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertStringToDouble(inputString3);
                break;
            case 10:
                scanner.nextLine();
                System.out.println("Type the String");
                String inputString4 = scanner.nextLine();
                ConverterFromPrimitiveToStringAndFromStringToPrimitive.convertStringToBoolean(inputString4);
                break;
            default:
                System.out.println("Wrong input");

                }
        }

    }




