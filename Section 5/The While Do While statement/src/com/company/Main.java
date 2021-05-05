package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 1;
        while (count != 5) {
            System.out.println("While Count value is = " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Do Count value is " + count);
            count++;
        } while (isEvenNumber(count));
    }

    public static boolean isEvenNumber(int number) {
        return number %2 == 0;
    }
}
