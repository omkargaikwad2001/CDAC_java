package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

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
			int maxlen=0;
			while(!(line=br.readLine()).equals("quit")) {
				
				if(maxlen<line.length()) {
					maxlen=line.length();
				}
				
				System.out.println(line);
				fw.write(line);
				fw.write("\n");
			}
			
//			System.out.println(maxlen);
			fw.close();
			
			//reading
			System.out.println("Data from file");
			String data;
			
			
			br=new BufferedReader(new FileReader(fname));
			while((data=br.readLine())!=null) {
				int spaceCount=0;
				if(data.length()<maxlen) {
					spaceCount=maxlen-data.length();
				}
				
				for(int i=0;i<spaceCount;i++) {
					System.out.print("-");
				}
				
				System.out.println(data);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(br!=null) br.close();
				if(fw!=null) fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
