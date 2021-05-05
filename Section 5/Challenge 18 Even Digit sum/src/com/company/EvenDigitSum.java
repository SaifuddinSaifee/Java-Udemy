package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number == 0) {
            return 0;
        } else if (number < 0) {
            return -1;
        } else {
            int even_num_sum = 0;
            int mod_number = number;

            while (number > 0) {
                mod_number = number % 10;
                if (mod_number % 2 == 0) {
                    even_num_sum += mod_number;
                }
                number /= 10;
            }
            return (even_num_sum);
        }
    }
}
