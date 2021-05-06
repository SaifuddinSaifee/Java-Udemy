package com.company;

public class Car extends Vehicle{

    private int wheels;
    private int velocity;
    private int company;
    private int roadType;

    public Car(int name, int size, int wheels, int velocity, int company, int roadType) {
        super(name, size);
        this.wheels = wheels;
        this.velocity = velocity;
        this.company = company;
        this.roadType = roadType;
    }
}
