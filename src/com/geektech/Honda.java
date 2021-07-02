package com.geektech;

public class Honda extends Car implements Printable {

    private String smallCar;

    public String getSmallCar() {
        return smallCar;
    }


    public Honda(String name, String color, int yearOFIssue, String smallCar) {
        super(name, color, yearOFIssue);
        this.smallCar = smallCar;
    }

    @Override
    public void print() {
        System.out.println( "Машина маленькаыя  " + this.getSmallCar() + " марка машины " + this.getName() + " цвет машины "
                + this.getColor() + " год выпуска:  " + this.getYearOFIssue() );

    }
}
