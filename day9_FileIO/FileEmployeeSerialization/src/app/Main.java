package app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import staff.Admin;
import staff.Programmer;
import staff.SalesManager;
import utility.Employee;

public class Main {

    public static void main(String[] args) {

        SalesManager s1 = new SalesManager(50, 1000, 101, 50000, "Emp1", 30, 1, 1, 1111);
        Programmer p1 = new Programmer("Java Project", 8, 1000, 102, 50000, "Emp2", 40, 2, 2, 2222);
        Admin a1 = new Admin(2000, 103, 50000, "Emp3", 40, 3, 3, 3333);

        Employee[] allEmp = { s1, p1, a1 };

        // Serialization
        try (FileOutputStream fos = new FileOutputStream("employees.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            for (Employee e : allEmp) {
                oos.writeObject(e);
            }
            System.out.println("Objects written to file...");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fis = new FileInputStream("employees.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            System.out.println("\nReading objects from file...");
            while (true) {
                try {
                    Employee e = (Employee) ois.readObject();
                    e.display();
                } catch (IOException ex) {
                    break;
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
