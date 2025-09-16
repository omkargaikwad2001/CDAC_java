package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter file or directory name: ");
            String fname = br.readLine();

            File file = new File(fname);

            if (file.isDirectory()) {
                System.out.println("It is a directory. Files inside:");
                String[] files = file.list();
                if (files != null) {
                    for (String f : files) {
                        System.out.println(f);
                    }
                }
            } else if (file.isFile()) {
                System.out.println("It is a file. Size = " + file.length() + " bytes");

                if (file.length() > 25) {
                    System.out.println("\nReading with BufferedReader (file > 25 bytes):");
                    try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = fr.readLine()) != null) {
                            System.out.println(line);
                        }
                    }
                } else {
                    System.out.println("\nReading with FileInputStream (file ≤ 25 bytes):");
                    try (FileInputStream fis = new FileInputStream(file)) {
                        int ch;
                        while ((ch = fis.read()) != -1) {
                            System.out.print((char) ch);
                        }
                    }
                }
            } else {
                System.out.println("Invalid path: neither file nor directory.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
