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
        
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter file name : ");
            String fname = br.readLine();
            
            fw = new FileWriter(fname);
            String line;
            System.out.println("Enter text (type 'quit' to stop):");
            while (!(line = br.readLine()).equals("quit")) {
                fw.write(line + "\n");
            }
            fw.close();
            
            br = new BufferedReader(new FileReader(fname));
            String data;
            int lineNum = 0;
            int maxLen = 0;
            int maxLineNum = -1;
            String maxLine = "";

            while ((data = br.readLine()) != null) {
                lineNum++;
                int charCount = data.length();
                System.out.println(data + " lineNum = " + lineNum + " charCount = " + charCount);

                if (charCount > maxLen) {
                    maxLen = charCount;
                    maxLineNum = lineNum;
                    maxLine = data;
                }
            }

            if (maxLineNum != -1) {
                System.out.println("\nLine with max characters:");
                System.out.println("Line " + maxLineNum + " (length " + maxLen + "): " + maxLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
