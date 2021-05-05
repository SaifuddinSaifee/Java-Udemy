package com.company;

public class Main {
    public static final String Invalid_Value_MSG = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(63, 33));
        System.out.println(getDurationString(7039));

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return ("Invalid value");
        }
        int hours = minutes / 60;
        minutes = minutes % 60;
        return (hours + "h " + minutes + "m " + seconds + "s");
    }

    public static String getDurationString(int only_seconds) {
        if (only_seconds < 0) {
            return "Invalid Value";
        }
        int minutes = only_seconds / 60;
        int seconds = only_seconds % 60;
        return getDurationString(minutes, seconds);
    }
}
