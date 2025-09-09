package com.Array;

import java.util.Scanner;

public class TwoDArraySum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows ");
        int row = sc.nextInt();
        
        System.out.println("Enter number of cols");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        
        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter number for arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Display array
        System.out.println("\nArray Elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int total = 0;
        
        // Row sums
        System.out.println("\nRow sums:");
        for (int i = 0; i < row; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < col; j++) {
                sumOfRow += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sumOfRow);
            total += sumOfRow; // Add to total
        }
        
        // Column sums
        System.out.println("\nColumn sums:");
        for (int i = 0; i < col; i++) {
            int sumOfCol = 0;
            for (int j = 0; j < row; j++) {
                sumOfCol += arr[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " = " + sumOfCol);
        }
        
        System.out.println("\nTotal sum of all elements = " + total);
        
        sc.close();
    }
}
