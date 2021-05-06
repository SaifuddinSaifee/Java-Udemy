package com.company;

public class SpecificCar extends Car {

    private int roadService;

    public SpecificCar(int roadService) {
        super("Outlander", "4WLD", 4, 4, 5, false,6);
        this.roadService = roadService;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 20){
            changeGear(2);
        } else if(newVelocity > 0 && newVelocity <= 30){
            changeGear(3);
        } else if(newVelocity > 0 && newVelocity <= 40){
            changeGear(4);
        } else if(newVelocity > 0 && newVelocity <= 50){
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }




    }
}
