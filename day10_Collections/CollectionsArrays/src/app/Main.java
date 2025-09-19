package app;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        
        int arr[] = new int[10];
        
        arr[0] = 45;
        arr[1] = 12;
        arr[2] = 89;
        arr[3] = 33;
        arr[4] = 7;
        arr[5] = 56;
        arr[6] = 18;
        arr[7] = 72;
        arr[8] = 29;
        arr[9] = 64;

       
        System.out.println("Array values: " + Arrays.toString(arr));
        
//        System.out.println("Printing Arrays.toString(arr)");
//        System.out.println(Arrays.toString(arr));
        
//        System.out.println("Filling array with 5");
//        Arrays.fill(arr, 5);
//        System.out.println(Arrays.toString(arr));
        
//      System.out.println("Filling array from particular index");
//      Arrays.fill(arr, 3,8,1);
//      System.out.println(Arrays.toString(arr));
        
//        System.out.println("Copy off");
//        int arr2[]=Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.toString(arr2));
        
//        System.out.println(Arrays.equals(arr, arr2));
    
//        Arrays.sort(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));
    
        IntStream stream = Arrays.stream(arr);
        System.out.println("Sum: " + stream.sum());

        double avg = Arrays.stream(arr).average().orElse(0.0);
        System.out.println("Average: " + avg);

    }
}
