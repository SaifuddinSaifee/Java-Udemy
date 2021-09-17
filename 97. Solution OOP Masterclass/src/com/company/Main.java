package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.29);
        hamburger.addHamburgerAddition2("Lettuce", 0.5);
        hamburger.addHamburgerAddition3("Cheese", 0.15);
        price = hamburger.itemizeHamburger();
        System.out.println("Total for Hamburger price is "+price);

        HealthyBurger healthyBurger = new HealthyBurger("Beacon", 5.65);
        healthyBurger.addHealthyAddition1("Egg", 5.7);

        healthyBurger.addHealthyAddition2("Lentils", 3.40);
        System.out.println("Total for Healthy-burger price is "+ healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition2("Lettuce", 0.5);
        deluxeBurger.itemizeHamburger();
    }
}
