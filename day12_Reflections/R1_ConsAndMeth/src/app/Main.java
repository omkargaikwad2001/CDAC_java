package app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fully qualified class name:");
        String fname = sc.next();

        try {
            
            Class c = Class.forName(fname);

            
            System.out.println("\nClass: " + c.getName());
            System.out.println("Package: " + c.getPackageName());

            Class superClass = c.getSuperclass();
            if (superClass != null) {
                System.out.println("Superclass: " + superClass.getName());
            } else {
                System.out.println("Superclass: None");
            }

            
            Class[] interfaces = c.getInterfaces();
            if (interfaces.length > 0) {
                System.out.println("Implemented Interfaces:");
                for (Class i : interfaces) {
                    System.out.println("  " + i.getName());
                }
            } else {
                System.out.println("No interfaces implemented");
            }

            int mod = c.getModifiers();
            System.out.println("Modifiers:");
            if (Modifier.isPublic(mod)) System.out.println("  public");
            if (Modifier.isAbstract(mod)) System.out.println("  abstract");
            if (Modifier.isFinal(mod)) System.out.println("  final");

            
            System.out.println("\nConstructors:");
            Constructor[] constructors = c.getConstructors();
            if (constructors.length == 0) {
                System.out.println("  No public constructors");
            } else {
                for (Constructor<?> cons : constructors) {
                    System.out.println("  " + cons);
                }
            }

            System.out.println("\nMethods:");
            Method[] methods = c.getMethods();
            if (methods.length == 0) {
                System.out.println("  No public methods");
            } else {
                for (Method m : methods) {
                    System.out.println("  " + m);
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Invalid class name! Class not found.");
        }

        sc.close();
    }
}
