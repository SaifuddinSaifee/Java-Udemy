package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimun Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Minimun Value = " + (myMinIntValue - 2));
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 2));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value: " + minByteValue);
        System.out.println("Byte max value: " + maxByteValue);

        Short shortminValue = Short.MIN_VALUE;
        Short shortmaxValue = Short.MAX_VALUE;
        System.out.println("Short min value: " + shortminValue);
        System.out.println("Short max value: " + shortmaxValue);

        long mylongvalue = 100L;
        long longminValue = Long.MIN_VALUE;
        long longmaxValue = Long.MAX_VALUE;
        System.out.println("Long min value: " + longminValue);
        System.out.println("Long max value: " + longmaxValue);

        long bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);

        int myTotal = (myMinIntValue/2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte) (minByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (shortminValue / 2);
        System.out.println(myNewShortValue);


    }
}
