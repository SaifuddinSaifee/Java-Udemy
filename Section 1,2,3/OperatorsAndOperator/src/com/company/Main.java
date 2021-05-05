package com.company;

public class Main {

    public static void main(String[] args) {

        var result = 1+3;
        System.out.println("1+2 = " + result);


        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen!");
        }

        boolean wasCar = isCar? true : false;
        if (wasCar) {
            System.out.println("Was car is true");

            double myfirstValue = 20.00d;
            double mysecondValue = 80.00d;
            double myValueTotal = (myfirstValue * mysecondValue) * 100.00d;
            double theRemainder = myValueTotal % 40.00d;
            System.out.println("The Remainder = " + theRemainder);
            boolean isNoRemainder = (theRemainder == 0)? true: false;
            System.out.println("isRemainder = " + isNoRemainder);
            if (!isNoRemainder) {
                System.out.println("Got Some Remainder");
            }
        }

    }
}
