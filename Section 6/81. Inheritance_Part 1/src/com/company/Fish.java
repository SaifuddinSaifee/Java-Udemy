package com.company;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;
    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscle() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscle();
        moveBackFin();
        System.out.println("Fish.swim() The Fish is now swimming");
        super.move(speed);


    }
}
