package com.student;

public class Student {

    private int sid;
    private String name;
    private int[] marks;

    public Student() {
    }

    public Student(int sid, String name, int[] marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Id = " + sid);
        System.out.println("Name = " + name);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("----------------------------");
    }

    public int calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / marks.length; 
    }

    public int getAverage() {
        return calculateAverage();
    }
}
