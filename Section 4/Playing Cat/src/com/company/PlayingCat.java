package com.company;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature > 25 && temperature <= 45;
        } else if (!summer) {
            return temperature > 25 && temperature <= 35;
        } else {
            return false;
        }
    }
}
