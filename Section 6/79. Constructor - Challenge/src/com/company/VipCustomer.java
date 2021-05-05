package com.company;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer(){
        this("Default Name", "Default Limit", "Default Email");
        System.out.println("* Empty Constructor Called");
    }
    public VipCustomer(String name,String creditLimit){
        this("Client Name", "Acc. Limit", "Blank Email");
        System.out.println("* Two-Parameter Constructor called");
    }
    public VipCustomer(String name, String creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("* Three-Parameter Constructor called");

    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
