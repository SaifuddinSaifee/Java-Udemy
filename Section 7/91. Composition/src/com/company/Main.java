package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("2208BC","Dell",240,dimensions);
//
//        Monitor theMonitor = new Monitor ("27 Inch Beast", "Acer",27, new Resolution(2540,1440));
//
//        MotherBoard theMotherBoar = new MotherBoard("BJ-200", "Asus",4,6,"v2.44");
//
//        PC thePC = new PC (theCase, theMonitor, theMotherBoar);
//        thePC.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Queen",3,8,2,1);
        Lamp lamp = new Lamp("Loft", true, 4);
        Bedroom bedroom = new Bedroom("Saif",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
