package com.geektech;

public class Bmv extends  Car implements Printable{

    private String niceCar;


    public Bmv(String name, String color, int yearOFIssue, String niceCar) {
        super(name, color, yearOFIssue);
        this.niceCar = niceCar;
    }

    public String getNiceCar() {
        return niceCar;
    }

    @Override
    public void print() {
        System.out.println( "Красивая машина  " + this.getNiceCar() + " марка машины " + this.getName() + " цвет машины "
                + this.getColor() + " год выпуска:  " + this.getYearOFIssue() );

    }
}
