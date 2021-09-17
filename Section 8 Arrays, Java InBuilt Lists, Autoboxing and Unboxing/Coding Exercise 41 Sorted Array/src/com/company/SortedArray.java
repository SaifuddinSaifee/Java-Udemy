package com.company;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];
        System.out.println("Enter " + arraySize + " integers for the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] sortedIntegers) {
        for (int i = 0; i< sortedIntegers.length; i++){
            System.out.println("Element " + i + " contents " + sortedIntegers[i]);
        }
    }
}
