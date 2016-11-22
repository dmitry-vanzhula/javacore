package com.dvanzhula.runners.homework;

import com.dvanzhula.app.homework.Lesson12.ArrayParser;
import com.dvanzhula.app.homework.lesson13.MyFileCreator;
import com.dvanzhula.app.homework.lesson13.MyFileReader;
import com.dvanzhula.app.homework.lesson13.MyFileWriter;

import java.util.Scanner;

/**
 * Created by Dmitry Vanzhula on 11/22/2016.
 */
public class Lesson13Runner {
    public static void main(String[] args) {

        boolean exit = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Enter a number 1-3:");
            System.out.println(" ");
            System.out.println("Number 1 - Task 'A'");
            System.out.println("Number 2 - Task 'C'");
            System.out.println("Number 3 - Exit");
            try {
                int inputNumber = scanner.nextInt();
                String fileName;
                MyFileReader myFileReader = new MyFileReader();
                ArrayParser arrayParser = new ArrayParser();
                MyFileWriter myFileWriter = new MyFileWriter();
                MyFileCreator myFileCreator = new MyFileCreator();
                switch (inputNumber) {
                    case 1:
                        System.out.println("Enter the path to the input file:");
                        scanner.nextLine();
                        String pathToFile = scanner.nextLine();
                        System.out.println("Enter the name of output file:");

                        fileName = scanner.nextLine();
                        System.out.println("How to sort an array?");
                        System.out.println("Number 1 - From smallest to bigger");
                        System.out.println("Number 2 - From bigger to smallest");
                        System.out.println("Number 3 - Exit");
                        try {
                            int choice = scanner.nextInt();
                            switch (choice) {
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
                    case 2:
                        scanner.nextLine();
                        System.out.println("Enter the file name");
                        fileName = scanner.nextLine();
                        System.out.println("Enter the text");
                        myFileWriter.writeNewFile(myFileReader.readNewFile(), myFileCreator.createNewFile(fileName));
                        break;
                    case 3:
                        exit = true;
                }
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Error, wrong input. Please enter a valid number!");
            }
        } while (exit != true);
    }
}
