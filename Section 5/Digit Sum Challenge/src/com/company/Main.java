package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigit(28472905));
    }

    public static int sumDigit(int num){
        if (num < 10){
            return -1;
        }
        int sum = 0;
        while (num>0){
            int digit  = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;

    }
}
