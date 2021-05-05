package com.company;

public class Main {

    public static void main(String[] args) {
        Student obj = new Student();

        obj.setsRollNo(4);
        obj.setName("Tim");
        obj.setMarks(56);
        obj.setAge(18);
        obj.write();
        obj.write("Work");




        Teacher ob1 = new Teacher();

        ob1.seteId(66);    //ob1.eId = 66;
        ob1.setName("Kenobi");    //ob1.tName = "Kenobi";
        ob1.setAge(33);    //ob1.tAge = 33;
        ob1.setSalary(30000);
        ob1.write();

        int aSal = ob1.annualSalary();
        System.out.println(aSal);


    }
}
