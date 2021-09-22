package com.company;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    private static int readInteger(){
        return scanner.nextInt();
    }

    private static int[] readElements(int arrayLength){
        int[] array = new int[arrayLength];
        for (int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i< array.length; i++){
            if (array[i] <= min){
                min = array[i];
            }
        }
        return min;
    }
}
