package com.dvanzhula.app.classwork.lesson16;

/**
 * Created by Dmitry Vanzhula on 11/26/16.
 */
public enum Holidays {

    NEW_YEAR("New Year", "December", 31), INDEPENDENCE_DAY("Independence day", "August", 24), EASTER("Easter", "May", 1);

    private String holidayName;
    private String monthName;
    private int date;

    Holidays(String holidayName, String monthName, int date) {
        this.holidayName = holidayName;
        this.monthName = monthName;
        this.date = date;
    }

    public String getHolidayName(){
        return holidayName;
    }

    public String getMonthName(){
        return monthName;
    }

    public int getDate(){
        return date;
    }
}
