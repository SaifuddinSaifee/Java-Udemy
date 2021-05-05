package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;

        while (counter<10) {
            System.out.println("Enter number #" +counter+":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum+=number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        } System.out.println("Sum = " + sum);
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter number #" + i + ":");
//            int inputNum = scanner.nextInt(); // reads an integer and stores in the variable
//            scanner.nextLine();
//            sum += inputNum;
//        }
//        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
