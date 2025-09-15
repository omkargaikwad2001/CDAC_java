package app;

import java.io.*;
import java.util.Scanner;

import util.Student;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Student student = new Student(rollNo, name, marks);

            FileWriter fw = new FileWriter("student.txt");
            fw.write(student.toString());
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            System.out.println("\nData read from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }

        sc.close();
    }
}