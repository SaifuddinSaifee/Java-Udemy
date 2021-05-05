package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000, 4));

        for (int i = 1; i < 9; i++) {
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000, i));
        }

        System.out.println("-------------------------------");

        for (int i = 8; i > 0; i--) {
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
