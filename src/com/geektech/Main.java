package com.geektech;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Car honda = main.createObject("Honda");
        Car bmv = main.createObject("Bmv");
        Car lexus = main.createObject("Lexus");
        honda.print();
        bmv.print();
        lexus.print();
    }

    public Car createObject(String className) {

        Car car;
        switch (className) {
            case "Honda":
                car = new Honda("Honda", "Black", 2007, "Fit");
                break;
            case "Bmv":
                car = new Bmv("Bmv X5", "Blue", 2021,"Уникальная");
                break;
            case "Lexus":
                car = new Lexus("GX460", "White", 2021, "Lexus");
                break;
            default:
                car = new Mers("S5", "Silver", 1999);

        }

        return car;
    }


}
