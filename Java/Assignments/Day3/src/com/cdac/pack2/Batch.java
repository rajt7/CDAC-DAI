package com.cdac.pack2;

public class Batch {
    private String CourseName;
    private int BatchStrength;

    public Batch() {
        CourseName = "No Course Assigned";
        BatchStrength = 0;
    }

    public Batch(String CourseName, int BatchStrength) {
        this.CourseName = CourseName;
        this.BatchStrength = BatchStrength;
    }

    // Getters
    public String getCourseName() {
        return CourseName;
    }

    public int getBatchStrength() {
        return BatchStrength;
    }

    // Setters
    public void setCourseName(String cname) {
        this.CourseName = cname;
    }

    public void setBatchStrength(int bstrength) {
        this.BatchStrength = bstrength;
    }

    // String Representation of object
    @Override
    public String toString() {
        return "Batch [Cours Name=" + CourseName + ", Batch Strength=" + BatchStrength + "]";
    }
    
}
