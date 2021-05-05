package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        char switchValue = '5';

        switch (switchValue){
            case 'a':
                System.out.println("Value was a");
                break;
            case 'b':
                System.out.println("Value was b");
                break;
            case 'x': case 'y': case '5':
                System.out.println("Was a x or y or z");
                System.out.println(switchValue + " was found");
                System.out.println();
                break;
            default:
                System.out.println("Could Not find A,B,C,D,E");
                break;
        }
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }
    }
}
