package com.company;

class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Car --> startEngine()";
    }

    public String accelerate(){
        return "Car --> accelerate()";
    }

    public String brake(){
        return "Car --> brake()";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4,"Spyder");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(8, "Figo");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


    }


}
class Holden extends Car{
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" --> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+" --> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden --> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> brake()";
    }
}


