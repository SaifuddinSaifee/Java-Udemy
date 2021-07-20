package com.company;

public class DeluxeBurger extends Hamburger{
    private double mozzarella;
    private double extraMeat;

    public DeluxeBurger() {
        super();
        this.mozzarella = 0;
        this.extraMeat = 0;
    }

    @Override
    public void printMenu() {
        super.printMenu();
    }

    @Override
    public void addCoke(String coke) {
        super.addCoke(coke);
    }

    @Override
    public void checkout() {
        super.checkout();
    }
}

