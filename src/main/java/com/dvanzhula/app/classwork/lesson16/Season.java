package com.dvanzhula.app.classwork.lesson16;

/**
 * Created by Dmitry Vanzhula on 11/26/16.
 */
public enum Season {

    SPRING, SUMMER, AUTUMN, WINTER;

    public static void main(String[] args) {
        //System.out.println(SPRING.name());
        //System.out.println(SPRING.toString());
       // System.out.println(Arrays.toString(Season.values()));

   /* @Override
    public String toString() {
        return "Season{}";
    }*/
        try {
            Season season = Season.valueOf("SUMMER");
            switch (season) {
                case SPRING:
                    System.out.println(season.toString());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season selection!");
        }
    }
}