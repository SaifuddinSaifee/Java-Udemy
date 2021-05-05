package com.company;

public class Main {

    public static void main(String[] args) {
        String mystring = "This is string";
        System.out.println(mystring);
        mystring = mystring + ", This is more.";
        System.out.println(mystring);

        String numberstring = "250.55";
        numberstring = numberstring + "49.95";
        System.out.println(numberstring);

        String lastString = "30";
        int myint = 50;
        double doublenumber = 120.4545;
        lastString = lastString + myint + doublenumber;
        System.out.println("Last String is equal to: " + lastString);


    }
}
