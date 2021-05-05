package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double Minimum value = " + myMindoubleValue);
        System.out.println("double Maximum value = " + myMaxdoubleValue);

        int myIntvalue = 5 / 2;
        float myFloatValue = 100f / 3f;
        double myDoubleValue = 100.00 / 3.00;
        System.out.println("MyIntValue = " + myIntvalue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilogram = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
