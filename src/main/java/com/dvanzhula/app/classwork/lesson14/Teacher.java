package com.dvanzhula.app.classwork.lesson14;

/**
 * Created by Dmitry Vanzhula on 11/19/16.
 */
    public class Teacher extends Person {

        private String university;
        private String response;

        public Teacher(String name, String university) {
            super(name);
            this.university = university;
        }

        public String getResponse(String question) {
            printOnTable();
            return response;
        }

        public void printOnTable() {
            System.out.println("Assume this is table:" + response);
        }
    }
