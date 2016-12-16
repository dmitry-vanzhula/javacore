package com.dvanzhula.app.homework.lesson19;

import java.util.*;

/**
 * Created by Dmitry Vanzhula on 12/16/2016.
 */
public class PhoneBook {
    public static void main(String[] args) {

        boolean exit = false;
        Map<String, List<PhoneBook.Person>> book = new HashMap<>();
        List<PhoneBook.Person> list;
        String str;

        while (exit != true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("letter A - Create a new group");
            System.out.println("letter B - Add a contact to an existing group");
            System.out.println("letter C - Display all the groups and their contacts");
            System.out.println("letter D - Change contact name / number");
            System.out.println("letter E - Exit");
            str = scanner.nextLine();
            switch (str) {
                case "A": {
                    System.out.println("Enter the group name");
                    String groupName = scanner.nextLine();
                    if (!book.containsKey(groupName)) {
                        book.put(groupName, new LinkedList<>());
                        System.out.println("New group " + groupName + "" + " was created!");
                        System.out.println("");
                    }
                    break;
                }
                case "B":
                    System.out.println("Enter the group name:");
                    String groupName2 = scanner.nextLine();
                    if (book.containsKey(groupName2)) {
                        System.out.println("Add a new contact:");
                        System.out.println("Enter a name");
                        String personName = scanner.nextLine();
                        System.out.println("Enter a phone number");
                        String personNumber = scanner.nextLine();
                        list = book.get(groupName2);
                        list.add(new PhoneBook.Person(personName, personNumber));
                        System.out.println("Contact was created!");
                        System.out.println();
                    } else {
                        System.out.println("This group doesn't exist");
                        System.out.println("");
                    }
                    break;
                case "C":
                    System.out.println("Current existing groups:");
                    System.out.println();
                    for (Map.Entry<String, List<PhoneBook.Person>> entry : book.entrySet()) {
                        if (entry.getValue().size() > -1) {
                            System.out.println("Group: " + entry.getKey());
                            System.out.println("Contacts:");
                            int index = 0;
                            for (PhoneBook.Person p : entry.getValue()) {
                                System.out.printf("index " + "%2d:\t%s\n", index++, "Name: " + p.name + "," + " " + "Phone number: " + p.number);
                            }
                            System.out.println("");
                        }
                    }
                    break;
                case "D":
                    System.out.println("Current existing groups:");
                    for (Map.Entry<String, List<PhoneBook.Person>> entry : book.entrySet()) {
                        if (entry.getValue().size() > -1) {
                            System.out.println("Group:" + entry.getKey());
                            System.out.println("Contacts:");
                            int index = 0;
                            for (PhoneBook.Person p : entry.getValue()) {
                                System.out.printf("index " + "%1d:\t%s\n", index++, "Name: " + p.name + "," + " " + "Phone number: " + p.number);
                            }
                            System.out.println("-----");
                        }
                    }
                    System.out.println("Enter the name of the group in which you want to change data");
                    String groupName = scanner.nextLine();
                    if (book.containsKey(groupName)) {
                        System.out.println("What do you want?");
                        System.out.println("letter a  - change contact name");
                        System.out.println("letter b  - change phone number");
                        System.out.println("letter c  - change name and phone number");
                        String choice = scanner.nextLine();
                        switch (choice) {
                            case "a":
                                System.out.println("Enter the contact index");
                                int indexA = scanner.nextInt();
                                System.out.println("Enter a new name");
                                scanner.nextLine();
                                String newName = scanner.nextLine();
                                list = book.get(groupName);
                                PhoneBook.Person p = list.get(indexA);
                                p.name = newName;
                                System.out.println("Name was modified!");
                                break;
                            case "b":
                                System.out.println("Enter the contact index");
                                int indexB = scanner.nextInt();
                                System.out.println("Enter a new phone number");
                                scanner.nextLine();
                                String newPhoneNumber = scanner.nextLine();
                                list = book.get(groupName);
                                PhoneBook.Person p1 = list.get(indexB);
                                p1.number = newPhoneNumber;
                                System.out.println("Phone number was modified!");
                                break;
                            case "c":
                                System.out.println("Enter the contact index");
                                int indexC = scanner.nextInt();
                                System.out.println("Enter a new name");
                                scanner.nextLine();
                                String newName2 = scanner.nextLine();
                                System.out.println("Enter a new phone number");
                                String newPhoneNumber2 = scanner.nextLine();
                                list = book.get(groupName);
                                PhoneBook.Person p2 = list.get(indexC);
                                p2.name = newName2;
                                p2.number = newPhoneNumber2;
                                System.out.println("Name and phone number were modified!");
                                break;
                            default:
                                System.out.println("Wrong command!");
                                break;
                        }
                    } else {
                        System.out.println("This group doesn't exist");
                        System.out.println("");
                    }
                    break;
                case "E":
                    exit = true;
                    break;
                default: {
                    System.out.println("Wrong command!");
                    System.out.println("");
                }
            }
        }
    }

    static class Person {
        String name;
        String number;

        @Override
        public String toString() {
            return "Name:" + " " + name + ", " + "Phone number:" + " " + number;
        }

        public Person(String name, String number) {
            this.name = name;
            this.number = number;
        }
    }
}


