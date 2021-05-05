package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetInchesToCentimeters(2, 6);
        calcFeetInchesToCentimeters(23);
    }

    public static double calcFeetInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        inches += (feet * 12);
        System.out.println(feet + " feet," + inches + " inches = " + inches * 2.54 + " cm");
        return inches * 2.54;
    }

    public static double calcFeetInchesToCentimeters(double only_inches) {
        if (only_inches <= 0) {
            return -1;
        }
        double feet = only_inches / 12;
        int temp_feet = (int) feet;
        int inches = (int) ((feet - temp_feet) * 12);
        return calcFeetInchesToCentimeters(temp_feet, inches);

    }

}
