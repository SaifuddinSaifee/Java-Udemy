package com.company;

public class SpecificCar extends Car {

    private String model;
    private int dated;
    private int mileage;
    private int color;

    public SpecificCar(int wheels, int size, int steering, int velocity, int company, int roadType) {
        super(wheels, size, steering, velocity, company, roadType);
        this.model = model;
        this.dated = dated;
        this.mileage = mileage;
        this.color = color;
    }

}
