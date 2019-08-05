package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader frRef;

		try {
			frRef = new FileReader("sample.txt");
			
			BufferedReader br = new BufferedReader(frRef);
			
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
			frRef.close();

		}
		
		catch(IOException e) {
			System.out.println("Sorry! File Not Found");
		}
		
		
		

	}

}
