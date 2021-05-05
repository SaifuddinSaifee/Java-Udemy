package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year : ");

        boolean hasNextInt = scanner.hasNextInt(); // reads the input and checks if it's an int or not
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); // reads an integer
            scanner.nextLine(); // Handle Next Line Character

            System.out.println("Enter your name : ");
            String name = scanner.nextLine(); // reads the whole input and stores it in the variable
            int age = 2021 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " old.");
            } else {
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("Unable to Parse year of Birth");
        }


        scanner.close();
    }
}
