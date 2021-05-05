package com.company;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i < number; ++i) {
                if (number % i == 0) {
//                    System.out.print(i + "\n");
                    sum += i;
                }
            } return sum==number;
        }
    }
}
