package file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //Creates a new scanner
		FileReader frRef;
		System.out.println( repeat("*", 30));

		System.out.println("CREATE A NEW FILE");
		System.out.println( repeat("*", 30));
		System.out.println("");
		System.out.println("Enter file name with extension:");

		String fileName = scan.nextLine(); //Waits for input


		File f = new File(fileName);
		boolean exists = f.exists();

		if (exists) {

			frRef = new FileReader(f);

			BufferedReader br = new BufferedReader(frRef);

			String s;
			s = br.readLine();

			int num = s.split("\\s+").length;

			System.out.println("File already exist with " + num +  " words. Overwrite? (Y/N)");
			String overwrite = scan.nextLine();

			if (overwrite.equalsIgnoreCase("N")) {

				System.out.println("Would you like to append texts into the file?");
				if (scan.nextLine().equalsIgnoreCase("Y")) {

					System.out.println("Enter Text to the file: ");

					String texts = scan.nextLine(); //Waits for input

					FileWriter fw = new FileWriter(f, true);

					BufferedWriter bw = new BufferedWriter(fw);
					bw.newLine();

					bw.append(texts);
					bw.close();
					System.out.println("File written!");
					System.out.println(texts.split("\\s+").length + " Words written!");


				}else if (scan.nextLine().equalsIgnoreCase("N")) {

					System.out.println("Goodbye!");
				}else {
					System.out.println("Input is incorrect, please retry.");

				}

			}else if(overwrite.equalsIgnoreCase("Y")) {

				System.out.println("Enter Text to the file: ");

				String texts = scan.nextLine(); //Waits for input

				FileWriter fw = new FileWriter(f, false);
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(texts);

				bw.close();

				System.out.println("File written!");
				System.out.println(texts.split("\\s+").length + " Words written!");




			}else {
				System.out.println("Input is incorrect, please retry.");
			}

		}else {

			System.out.println("Enter Text to the file: ");

			String texts = scan.nextLine(); //Waits for input

			FileWriter fw = new FileWriter(f);
			BufferedWriter br = new BufferedWriter(fw);

			br.write(texts);

			br.close();
			System.out.println("File written!");


		}


	}
	
	public static String repeat(String str, int times) {
		return new String(new char[times]).replace("\0", str);
	}

}
