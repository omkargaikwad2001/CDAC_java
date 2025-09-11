package logical;

import java.util.Arrays;
import java.util.Scanner;

public class StringLogical {

    public static void main(String[] args) {

        if (args.length < 5) {
            System.out.println("Please provide at least 5 strings as command line arguments.");
            return;
        }

        // 1. Accept 5 strings from command line argument
        String[] strArr = new String[5];
        for (int i = 0; i < 5; i++) {
            strArr[i] = args[i];
        }

        // 2. Print length of each string
        System.out.println("Lengths of strings:");
        for (String s : strArr) {
            System.out.println(s + " → length = " + s.length());
        }

        // 3. Search specific string in given array
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter string to search: ");
        String search = sc.next();

        boolean found = false;
        for (String s : strArr) {
            if (s.equals(search)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("String \"" + search + "\" found in array.");
        } else {
            System.out.println("String \"" + search + "\" not found in array.");
        }

        // 4. Sort strings in ascending order
        Arrays.sort(strArr);
        System.out.println("\nStrings in ascending order:");
        for (String s : strArr) {
            System.out.println(s);
        }

        sc.close();
    }
}
