package com.dvanzhula.app.homework.lesson14;

/**
 * Created by Dmitry Vanzhula on 11/18/2016.
 */
public class WhiteCollar extends Human {
    private String company;

    public WhiteCollar(String company, String name, int age) {
        super(name, age);
        this.company = company;
    }

    public void setCompany(String company) {
        if (companyNameIsOk(company)) {
            this.company = company;
            System.out.println("Company name is setted");
        } else {
            System.out.println("Company name is invalid");
        }
    }

    private static boolean companyNameIsOk(String company) {
        for (char ch : company.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isSpaceChar(ch) && ch != '-' && ch != ',') {
                return false;
            }
        }
        return true;
    }
}
