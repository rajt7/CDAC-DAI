package com.cdac.pack1;

public class Student {
    private int rollno;
    private String name;
    private static int r=0;

    // default constructor
    public Student(){
        r++;
        rollno=r;
        name="iron man";
    }

    // parameterized constructor
    public Student(String name) {
        r++;
        this.rollno = r;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
}
