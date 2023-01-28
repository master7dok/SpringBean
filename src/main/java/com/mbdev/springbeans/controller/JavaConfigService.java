package com.mbdev.springbeans.controller;

public class JavaConfigService {


    private final String timeOfInitialization;
    private Integer dayOfMonth;

    public JavaConfigService(String timeOfInitialization) {
        this.timeOfInitialization = timeOfInitialization;
    }

    public String hello(){
        return "Hello From Java Config" + " time: " + timeOfInitialization
                + " day of month: " + dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
}
