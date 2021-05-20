package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2208BC","Dell",240,dimensions);

        Monitor theMonitor = new Monitor ("27 Inch Beast", "Acer",27, new Resolution(2540,1440));

        MotherBoard theMotherBoar = new MotherBoard("BJ-200", "Asus",4,6,"v2.44");

        PC thePC = new PC (theCase, theMonitor, theMotherBoar);
        thePC.getTheMonitor().drawPixelAt(500, 1200, "Red");
        thePC.getMotherBoard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();



    }
}
