package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean yes_no, int hoursOfDay) {
        if (yes_no == false || hoursOfDay < 0 || hoursOfDay > 23) {
            return false;
        } else {
            return hoursOfDay > 22 || hoursOfDay < 8;
        }

    }
}

