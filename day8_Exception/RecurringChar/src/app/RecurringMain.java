package app;

import java.util.Arrays;

public class RecurringMain {
	
    
    static void printDuplicates(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        
        for (int i = 0; i < arr.length;) {
            int count = 1;

            
            while (i + count < arr.length && arr[i] == arr[i + count]) {
                count++;
            }

            
            if (count > 1) {
                System.out.print("['" + arr[i] + "', " + count + "], ");
            }
            
            
            i += count;
        }
    }
	
    public static void main(String[] args) {
		
		String str = "Entertainment";
		
		System.out.println("Printing duplicate characters:");
		printDuplicates(str);

    }
}
