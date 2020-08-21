package com.sreejesh.instance1;

public class Car {

    private String colour;

    public Car() {
    }

    public Car(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                '}';
    }

    public void drive()
    {
        System.out.println("*** Driving Car ***");
    }

    public static Car getWhiteCar()
    {
        return new Car("White");
    }
}
