package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        int num1_ = (int) (num1 * 1000);
        int num2_ = (int) (num2 * 1000);
        return num1_ == num2_;
    }
}
