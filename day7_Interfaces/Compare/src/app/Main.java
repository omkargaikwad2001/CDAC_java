package app;

import util.*;

public class Main {
    public static void main(String[] args) {
        
        Student[] allStudents = new Student[5];
        
        allStudents[0] = new Student(105, "Alice", 85);
        allStudents[1] = new Student(101, "Bob", 72);
        allStudents[2] = new Student(104, "Charlie", 90);
        allStudents[3] = new Student(102, "Diana", 65);
        allStudents[4] = new Student(103, "Ethan", 78);
        
        // Sort by Roll Number
        System.out.println("Sorted by Roll Number:");
        bubbleSort(allStudents, new RollCompare());
        printArray(allStudents);

        // Sort by Name
        System.out.println("\nSorted by Name:");
        bubbleSort(allStudents, new NameCompare());
        printArray(allStudents);

        // Sort by Marks
        System.out.println("\nSorted by Marks:");
        bubbleSort(allStudents, new MarksCompare());
        printArray(allStudents);
    }

    // Bubble sort logic
    private static void bubbleSort(Student[] arr, Compare cmp) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (cmp.compare(arr[j], arr[j+1]) > 0) {
                    // swap
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println("Roll: " + s.getRollnum() +
                               ", Name: " + s.getName() +
                               ", Marks: " + s.getMarks());
        }
    }
}
