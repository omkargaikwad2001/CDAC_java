package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br=null;
		FileWriter fw = null;
		FileReader fr =null;
		String str=null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter file name ");
			String fname = br.readLine();
			fw = new FileWriter(fname);
			
			while(!(str = br.readLine()).equals("quit")) {
				System.out.println(str);
				fw.write(str);
				fw.write("\n");
			}
			fw.close();
			System.out.println("Data added to file...\n\n");
			System.out.println("Reading data from file...");
			
			fr = new FileReader(fname);
			int i;
			while((i=fr.read())!=-1) {
				
				System.out.print((char)i);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
