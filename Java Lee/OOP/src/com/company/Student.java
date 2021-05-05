package com.company;

import java.lang.reflect.Method;

public class Student extends Human{ // sub-class

    private int sRollNo;
    private int marks;

    public int getsRollNo() {
        return sRollNo;
    }

    public void setsRollNo(int sRollNo) {
        this.sRollNo = sRollNo;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public double getPercent() {
        return (marks * 1.0 / 75) * 100;
    }

//  Method Overriding
    public void write(){
        System.out.println("I m writing a paper");
    }

//  Method OverLoading
    public void write(String assignment){
        System.out.println("I'm writing an assignment");
    }
}
