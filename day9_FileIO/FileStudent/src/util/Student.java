package util;

public class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return "Name = " + name + 
               ", Roll No = " + rollNo + 
               ", Marks = " + marks + 
               ", Grade = " + calculateGrade();
    }
}