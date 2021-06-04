package com.company;

public class Printer {
    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int noOfPagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int cartridge) {
        if (tonerLevel + cartridge >= 100) {
            tonerLevel = 100;
        } else if (tonerLevel + cartridge <= 0) {
            tonerLevel = 0;
            System.out.println("Toner is now empty");
        } else {
            tonerLevel += cartridge;
        }
        System.out.println("The Toner level is now at " + tonerLevel);
    }

    public void printPage(int pages) {
        noOfPagesPrinted += pages;
        System.out.println("Pages printed are " + pages + ". Total pages printed are " + noOfPagesPrinted);
    }

    public void printing(int page) {
        if (tonerLevel > 0) {
            if (isDuplex) {
                printPage(page / 2);
                fillToner(page * -1);
            } else {
                printPage(page);
                fillToner(page * -1);
            }
        } else {
            System.out.println("---Insufficient Ink---");
        }
    }
}

