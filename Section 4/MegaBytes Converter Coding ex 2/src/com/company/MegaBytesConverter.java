package com.company;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        } else {
            int mb_count = 1024;
            int main_mb = (int) (kiloBytes / mb_count);
            int main_kb = (int) (kiloBytes % mb_count);
            System.out.println(kiloBytes + " KB = " + main_mb + " MB and " + main_kb + " KB");
        }

    }
}
