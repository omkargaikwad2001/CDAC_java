package app;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fully qualified class name:");
        String fname = sc.next();

        try {
            Class c = Class.forName(fname);

            Constructor[] constructors = c.getConstructors();
            if (constructors.length == 0) {
                System.out.println("No public constructors available for this class!");
                return;
            }

            System.out.println("\nAvailable constructors:");
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(i + ": " + constructors[i]);
            }

            System.out.print("\nChoose constructor index: ");
            int choice = sc.nextInt();

            if (choice < 0 || choice >= constructors.length) {
                System.out.println("Invalid choice!");
                return;
            }

            Constructor chosen = constructors[choice];
            Class[] paramTypes = chosen.getParameterTypes();

            Object[] params = new Object[paramTypes.length];
            for (int i = 0; i < paramTypes.length; i++) {
                System.out.print("Enter value for parameter " + (i + 1) + " (" + paramTypes[i].getSimpleName() + "): ");
                String input = sc.next();

                if (paramTypes[i] == int.class) {
                    params[i] = Integer.parseInt(input);
                } else if (paramTypes[i] == double.class) {
                    params[i] = Double.parseDouble(input);
                } else if (paramTypes[i] == boolean.class) {
                    params[i] = Boolean.parseBoolean(input);
                } else if (paramTypes[i] == String.class) {
                    params[i] = input;
                } else {
                    System.out.println("Unsupported parameter type: " + paramTypes[i].getName());
                    return;
                }
            }

            Object obj = chosen.newInstance(params);
            System.out.println("\nObject created: " + obj);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
