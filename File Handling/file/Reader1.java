package file;

import java.io.*;

public class Reader1 {
	public static void main(String args[]) {
		DataInputStream in = null;

		try {
			FileInputStream fs = new FileInputStream("sample.txt");

			in = new DataInputStream(fs);

			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		}

		catch(Exception e) {
			System.out.println("File not found..");
		}

		finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	}
}