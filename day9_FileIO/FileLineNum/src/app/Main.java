package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedReader fr = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name of file:");            
            String fname = br.readLine();

            fw = new FileWriter(fname);
            String str;
            System.out.println("Enter text (type 'quit' to stop):");
            while (!(str = br.readLine()).equals("quit")) {
                fw.write(str + "\n");
            }
            fw.close();

            fr = new BufferedReader(new FileReader(fname));
            String data;
            int linenum=0;
            System.out.println("\n--- File Content ---");
            while ((data = fr.readLine()) != null) {
            	linenum++;
                System.out.println(data+" [lineNum :"+linenum+"]");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fw != null) fw.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
