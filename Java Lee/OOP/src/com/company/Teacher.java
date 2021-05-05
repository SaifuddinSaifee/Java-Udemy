package com.company;

public class Teacher extends Human { // sub-class
    private int eId;

    private int salary;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int annualSalary() {
        return salary * 12;
    }

    // Method Overriding
    public void write() {
        System.out.println("I m setting a paper");
    }
}
