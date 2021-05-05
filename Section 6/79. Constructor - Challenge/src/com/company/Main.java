package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer Customer1 = new VipCustomer();
        System.out.println(Customer1.getName());

        VipCustomer Customer2 = new VipCustomer("Fred", "50000");
        System.out.println(Customer2.getName() + " - " + Customer2.getCreditLimit());

        VipCustomer Customer3 = new VipCustomer("George", "10000", "Geaorge@email.com");
        System.out.println(Customer3.getName() + " - " + Customer3.getCreditLimit() + " - " + Customer3.getEmail());

    }
}
