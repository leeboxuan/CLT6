package application;

import java.util.Scanner;

import pojo.User;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		User Lisa = new User("lisa@gmail.com", "123", "Black", 0.0, false);
		User Adam = new User("adam@gmail.com", "123", "Pink", 0.0, false);
		User Mary = new User("mary@gmail.com", "123", "Black", 0.5, false);
		User Loie = new User("loie@gmail.com", "123", "Red", 13.50, false);
		User Louis = new User("louis@gmail.com", "123", "Blue", 66.80, false);
		User Pamela = new User("pamela@gmail.com", "123", "Red", 0.0, false);

		User.getUserList().add(Lisa);
		User.getUserList().add(Adam);
		User.getUserList().add(Mary);
		User.getUserList().add(Loie);
		User.getUserList().add(Louis);
		User.getUserList().add(Pamela);

		System.out.println("User Home Page: ");
		System.out.println("1. Register ");
		System.out.println("2. Login ");
		System.out.println("3. Forget Password ");
		System.out.println("4. Logout (exit) ");

		System.out.println("Enter your choice: ");

		Scanner scan = new Scanner(System.in); //Creates a new scanner
		String input = scan.next();

		switch (input) {

		case "1":
			UserRegistration.main(null);
			break;

		case "2":

			UserLoginAuthentication.main(null);
			break;

		case "3":

			System.out.println("");
			break;

		case "4":
			System.out.println("Logout Successfully!!");
			break;

		default:
			System.out.println("Your input is invalid, please restart application.");

			break;
		}


	}

}
