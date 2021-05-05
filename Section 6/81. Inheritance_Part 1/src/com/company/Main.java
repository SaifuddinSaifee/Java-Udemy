package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 10);

        Dog dog = new Dog("Tommy", 4, 30, 2, 4,1, 42, "Gold Fur");
        dog.eat();
        dog.walk();
//        dog.run();

    }
}
