package com.dvanzhula.app.homework.lesson16;

/**
 * Created by Dmitry Vanzhula on 11/29/2016.
 */
public enum EnumMenuForHomeworkRunners {

    A(""),B(""),C(""),D(""),E(""),F(""),G(""),a(""),b(""),c("");

    private String description;

    EnumMenuForHomeworkRunners(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
