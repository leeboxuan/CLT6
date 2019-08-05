package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerializationDemo e = null;
		try {
			
			FileInputStream fileIn = new FileInputStream("david.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (SerializationDemo) in.readObject();
			in.close();
			fileIn.close();
			
		}catch(IOException i) {
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c) {
			System.out.println("Serialization class not found.");
			c.printStackTrace();
			return;
		}
		
		System.out.println("Deserialized Player..");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.city);
		System.out.println("Number: " + e.mobile);
		System.out.println("Age: " + e.age);





	}

}
