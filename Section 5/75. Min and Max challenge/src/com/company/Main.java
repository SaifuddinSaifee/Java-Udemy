package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = Integer.MAX_VALUE;  // 2147483647
        int max = Integer.MIN_VALUE; // -2147483647
//        boolean first = true;
        while (true) {

            System.out.println("Enter Number : ");
            boolean isAnInt = input.hasNextInt();

            if (isAnInt) {

                int number = input.nextInt();

//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            input.nextLine();
        }
        System.out.println("Min = " + min + " and Max = " + max);
        input.close();
    }
}
