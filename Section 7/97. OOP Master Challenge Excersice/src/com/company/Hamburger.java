package com.company;

public class Hamburger {

    private double burgCost;
    private double totalBill;
    private double tomato;
    private double cheese;
    private double mayo;
    private double spices;
    private double coke;

    public Hamburger() {
        this.burgCost = 12;
        this.totalBill = totalBill + burgCost;
        this.tomato = 0;
        this.cheese = 0;
        this.mayo = 0;
        this.spices = 0;
        this.coke = 0;
    }

    public void printMenu() {
        System.out.println("MENU :-");
        System.out.println("Base Burger Price  :  $12");
        System.out.println("---------------------------------------");
        System.out.println("Addition : 1. Tomato        -  $2");
        System.out.println("           2. Cheese        -  $3");
        System.out.println("           3. Mayonnaise    -  $0.5");
        System.out.println("           4. Spices        -  $1");
        System.out.println("-Coke (250ml) : $3\n-Coke (500ml) : $5\n-Coke (750ml) : $7");
        System.out.println("---------------------------------------");
        System.out.println();
    }

    public void addTomato() {
        this.burgCost += 2;
        this.totalBill += 2;
        this.tomato += 2;
        System.out.println("        add Tomato  +$" + this.tomato);
    }

    public void addCheese() {
        this.burgCost += 3;
        this.totalBill += 3;
        this.cheese += 3;
        System.out.println("        add Cheese  +$" + this.cheese);
    }

    public void addMayonnaise() {
        this.burgCost += 0.5;
        this.totalBill += 0.5;
        this.mayo += 0.5;
        System.out.println("    add Mayonnaise  +$" + this.mayo);
    }

    public void addSpices() {
        this.burgCost += 1;
        this.totalBill += 1;
        this.spices += 1;
        System.out.println("        add Spices  +$" + this.spices);
    }

    public void addCoke(String coke) {
        if (coke == "250ml") {
            totalBill += 3;
            this.coke += 3;

        }
        else if (coke == "500ml") {
            totalBill += 5;
            this.coke += 5;
            System.out.println("        Coke         $"+ this.coke);
        } else if (coke == "750ml") {
            totalBill += 7;
            this.coke += 7;
            System.out.println("        Coke         $"+ this.coke);
        } else {
            System.out.println("Unable to add Coke.");
        }
    }

    public void checkout() {
        System.out.println("Bill :");
        System.out.println("    Hamburger Cost : $12");
//        System.out.println("        add Tomato  +$" + this.tomato);
//        System.out.println("        add Cheese  +$" + this.cheese);
//        System.out.println("    add Mayonnaise  +$" + this.mayo);
        System.out.println("        add Spices  +$" + this.spices);
        System.out.println("-------------------------------");
        System.out.println("        Total =      $" + this.burgCost);
        System.out.println("Additional :");
        System.out.println("        Coke 750ml   $"+ this.coke);
        System.out.println();
        System.out.println("  Total Amount : $" + this.totalBill);
    }
}
