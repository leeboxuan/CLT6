package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

			boolean newFile = false;

			File f = new File("abcxyz.doc");
			System.out.println(f.exists());

			newFile = f.createNewFile();
			System.out.println(newFile);
			System.out.println(f.exists());

			FileWriter fw = new FileWriter("abcxyz.doc");
			BufferedWriter br = new BufferedWriter(fw);

			br.write("this is filewriter7");

			br.newLine();

			br.write("thank you...");

			br.newLine();

			br.write("Java");

			br.newLine();

			br.write("SAP");

			br.newLine();

			br.write(".Net");

			br.close();

		
		
	}

}
