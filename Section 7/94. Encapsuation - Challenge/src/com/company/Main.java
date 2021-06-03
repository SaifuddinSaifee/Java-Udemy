package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Printer myPrinter = new Printer(50,350,true);

    myPrinter.printPage(20);
    myPrinter.fillToner(20);
    myPrinter.printing(20);

    Printer myOtherPrinter = new Printer(200,0,false);
    myOtherPrinter.printing(40);
    myOtherPrinter.printing(80);
    myOtherPrinter.printing(10);
    myOtherPrinter.printing(10);
    myOtherPrinter.printing(1);
    myOtherPrinter.printing(2);

    }
}

