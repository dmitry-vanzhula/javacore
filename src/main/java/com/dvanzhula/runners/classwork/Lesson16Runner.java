package com.dvanzhula.runners.classwork;

import com.dvanzhula.app.classwork.lesson16.Company;
import com.dvanzhula.app.classwork.lesson16.Holidays;

/**
 * Created by Dmitry Vanzhula on 11/26/16.
 */
public class Lesson16Runner {
    public static void main(String[] args) {
        for (Company cName : Company.values()) {
            System.out.println("Company Value: " + cName.getValue() + " - Company Name: " + cName);
        }

        System.out.println();

        for(Holidays holidays : Holidays.values()){
            System.out.println(holidays.getHolidayName() + " " + "holiday is on " + holidays.getMonthName() + "," + holidays.getDate());
        }
    }
}