package com.company;

public class Vehicle {
    private int name;
    private int size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(int name, int size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() steering towards : " + currentDirection + " degrees");
    }

    public void move (int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at speed: '" + this.currentVelocity + " km/hr', towards "+ currentDirection + "' degrees");
    }

    public int getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
