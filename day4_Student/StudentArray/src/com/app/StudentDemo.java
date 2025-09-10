package com.app;

import com.student.Student;

public class StudentDemo {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student(101, "Omkar", new int[]{90, 85, 88, 92, 87});
        students[1] = new Student(102, "Raj", new int[]{70, 75, 68, 72, 69});
        students[2] = new Student(103, "Priya", new int[]{95, 92, 98, 91, 90});
        students[3] = new Student(104, "Amit", new int[]{60, 65, 63, 70, 68});
        students[4] = new Student(105, "Sneha", new int[]{88, 85, 89, 87, 90});

        System.out.println("All Student Details:");
        for (Student s : students) {
            s.display();
        }

        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getAverage() > topStudent.getAverage()) {
                topStudent = s;
            }
        }

        System.out.println("\nStudent with Highest Average Marks:");
        topStudent.display();
    }
}
