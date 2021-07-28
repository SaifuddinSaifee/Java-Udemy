package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();
            hamburger.printMenu();
            hamburger.addTomato();
            hamburger.addCheese();
            hamburger.addMayonnaise();
            hamburger.addCoke("250ml");
            hamburger.checkout();

//            DeluxeBurger deluxeBurger = new DeluxeBurger();
//            deluxeBurger.printMenu();
//            deluxeBurger.addTomato();
//            deluxeBurger.addSpices();
//            deluxeBurger.addCoke("750ml");
//            deluxeBurger.checkout();
//
//            HealthyBurger healthyBurger = new HealthyBurger();
//            healthyBurger.printMenu();
//            healthyBurger.addAdditional(5);
//            healthyBurger.addAdditional(6);
//            healthyBurger.addAdditional(1);
//            healthyBurger.addAdditional(2);
//            healthyBurger.checkOutOrder();
//
//            DeluxeBurger deluxeBurger = new DeluxeBurger();
//            deluxeBurger.printMenu();
//            deluxeBurger.addAdditional(1);
//            deluxeBurger.addAdditional(1);
//            deluxeBurger.addAdditional(2);
//            deluxeBurger.checkOutOrder();

    }
}
