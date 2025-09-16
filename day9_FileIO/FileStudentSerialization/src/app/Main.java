package app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import utility.Student;

public class Main {
    public static void main(String[] args) {
        
        Student[] students = new Student[3];
        students[0] = new Student(101, "PG-DAC", 10000.00, "0063", 24, "Omkar OG", 4, 5, 2001);
        students[1] = new Student(102, "DBDA", 12000.00, "0064", 25, "Rahul RK", 15, 6, 2000);
        students[2] = new Student(103, "DESD", 15000.00, "0065", 23, "Sneha SN", 10, 8, 2002);

        System.out.println("Original Students (Before Serialization):\n");
        for(Student s : students) {
            System.out.println(s);
            System.out.println("----------------------");
        }

        try (FileOutputStream fos = new FileOutputStream("students.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(students); 
            System.out.println("\nStudents serialized to students.txt\n");
            
        } catch(Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("students.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            Student[] readStudents = (Student[]) ois.readObject();
            
            System.out.println("Deserialized Students (After Reading from File):\n");
            for(Student s : readStudents) {
                System.out.println(s);
                System.out.println("----------------------");
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
