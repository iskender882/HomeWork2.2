package com.geektech;

public class Lexus extends Car implements Printable{

    private String newCar;

    public Lexus(String name, String color, int yearOFIssue, String newCar) {
        super(name, color, yearOFIssue);
        this.newCar = newCar;
    }

    public String getNewCar() {
        return newCar;
    }

    @Override
    public void print() {
        System.out.println( "Новая машина:" + this.getNewCar() + " марка машины: " + this.getName() + " цвет машины: "
                + this.getColor() + " год выпуска: " + this.getYearOFIssue() );
    }
}
