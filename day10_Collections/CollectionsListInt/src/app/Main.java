package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> lists = new ArrayList<>();

        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        int currentIndex = 0;

        System.out.println("Enter space-separated integers per line. Type 'stop' to finish:");

        while (true) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("stop")) break;
            if (line.isEmpty()) continue;

            Scanner lineScanner = new Scanner(line);
            
            List<Integer> inner = new ArrayList<>();
            
            int innerSum = 0;

            while (lineScanner.hasNextInt()) {
                int num = lineScanner.nextInt();
                inner.add(num);
                innerSum += num;
            }
            lineScanner.close();

            if (!inner.isEmpty()) {
                lists.add(inner);
                totalSum += innerSum;
                if (innerSum > maxSum) {
                    maxSum = innerSum;
                    maxIndex = currentIndex;
                }
                currentIndex++;
            }
        }

        sc.close();

        if (lists.isEmpty()) {
            System.out.println("No lists were entered.");
        } else {
            System.out.println("\nList with maximum sum is at index: " + maxIndex);
            System.out.println("That list: " + lists.get(maxIndex));
            System.out.println("Maximum sum = " + maxSum);
            System.out.println("Total sum of all elements = " + totalSum);
        }
    }
}
