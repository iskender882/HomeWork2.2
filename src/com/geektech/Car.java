package com.geektech;

public class Car implements Printable{

    private String name;
    private String color;
    private int yearOFIssue;

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

    public int getYearOFIssue() {
        return yearOFIssue;
    }

    public Car(String name, String color, int yearOFIssue) {
        this.name = name;
        this.color = color;
        this.yearOFIssue = yearOFIssue;
    }



    @Override
    public void print() {

    }
}
