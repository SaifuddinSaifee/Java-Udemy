package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018";
        System.out.println("NumberAsString = " + numberAsString);
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = "+number);
        numberAsString += 1;
        System.out.println(numberAsString);
        number += 1;
        System.out.println(number);


    }
}
