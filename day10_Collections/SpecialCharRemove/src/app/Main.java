package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedReader br1 = null;
        try {
            br = new BufferedReader(new FileReader("names.txt"));
            br1 = new BufferedReader(new FileReader("names.txt"));
            String str;
            
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

            System.out.println("Original and Cleaned Content:");

            while ((str = br1.readLine()) != null) {
             
              String result = "";
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if ((ch >= 'a' && ch <= 'z') ||
                        (ch >= 'A' && ch <= 'Z') ||
                        (ch >= '0' && ch <= '9') ||
                        ch == ' ') {
                        result += ch;
                    }
                }

      
                System.out.println(result);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
