package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.lesson12.ArrayParser;
import com.dvanzhula.app.homework.lesson13.MyFileCreator;
import com.dvanzhula.app.homework.lesson13.MyFileReader;
import com.dvanzhula.app.homework.lesson13.MyFileWriter;
import com.dvanzhula.app.homework.lesson16.EnumMenuForHomeworkRunners;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/22/2016.
 */

public class Lesson13Runner {
    public static void main(String[] args) {

        boolean exit = false;
        do {
            System.out.println("");
            System.out.println("Enter a letter:");
            EnumMenuForHomeworkRunners.A.setDescription("Letter A - The program reads the array of numbers from a file, sorts it and rewrites it in another file(numbers should be separated by comma)");
            EnumMenuForHomeworkRunners.B.setDescription("Letter B - The program reads each line of text from the console and stores the result in the file.");
            EnumMenuForHomeworkRunners.C.setDescription("Letter C - Exit");
            for(EnumMenuForHomeworkRunners enumMenu : EnumMenuForHomeworkRunners.values()){
                System.out.println(enumMenu.getDescription());
            }
            try {
                Scanner scanner = new Scanner(System.in);
                String choice;
                choice = scanner.nextLine();
                String fileName;
                MyFileReader myFileReader = new MyFileReader();
                ArrayParser arrayParser = new ArrayParser();
                MyFileWriter myFileWriter = new MyFileWriter();
                MyFileCreator myFileCreator = new MyFileCreator();
                switch (choice) {
                    case "A":
                        System.out.println("Enter the path to the input file:");
                        String pathToFile = scanner.nextLine();
                        System.out.println("Enter the name of output file:");
                        fileName = scanner.nextLine();
                        System.out.println("How to sort an array?");
                        System.out.println("Number 1 - From smallest to bigger");
                        System.out.println("Number 2 - From bigger to smallest");
                        System.out.println("Number 3 - Exit");
                        try {
                            int choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    myFileWriter.writeNewFile(arrayParser.convertIntArrayToStringAndSplitByComma(arrayParser.sortFromSmallestToBigger(arrayParser.convertStringToIntArray(myFileReader.readNewFileUsingPath(pathToFile)))), myFileCreator.createNewFile(fileName));
                                    break;
                                case 2:
                                    myFileWriter.writeNewFile(arrayParser.convertIntArrayToStringAndSplitByComma(arrayParser.sortFromBiggerToSmallest(arrayParser.convertStringToIntArray(myFileReader.readNewFileUsingPath(pathToFile)))), myFileCreator.createNewFile(fileName));
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
                    case "B":
                        System.out.println("Enter the file name");
                        fileName = scanner.nextLine();
                        System.out.println("Enter the text. If you want to save the file, type the word 'exit' on a new line and press 'Enter' button");
                        myFileWriter.writeNewFile(myFileReader.readNewFile(), myFileCreator.createNewFile(fileName));
                        break;
                    case "C":
                        exit = true;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            } catch (IllegalArgumentException e){
                System.out.println("ERROR! Wrong input");
            }
        } while (exit != true);
    }
}
