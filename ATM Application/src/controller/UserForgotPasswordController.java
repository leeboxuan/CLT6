package controller;

import java.util.Scanner;

import application.main;
import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class UserForgotPasswordController {
	LoginService refLoginService; // LoginService is an interface
	User refUser; // User is a POJO (Plain old Java object)
	public void userForgotPasswordController() {
		refLoginService = new LoginServiceImpl();
		refUser = new User();
		userInput();

	}

	void userInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email Address : ");
		String email = sc.next();
		//		refUser.setUserEmail(email);

		System.out.println("Enter your Security Key : ");
		String sk = sc.next();
		//		refUser.setUserPassword(password);

		for (int i=0; i<User.getUserList().size(); i++) {

			User a = User.getUserList().get(i);

			if ((email == (a.getUserEmail())) && (sk == (a.getUserSecurityKey()))){


				System.out.println("Enter new password : ");
				String password = sc.next();

				System.out.println("Retype Password: ");
				String retype = sc.next();

				if (password == retype) {

					System.out.println("What is your favourite color? ");
					String color = sc.next();
					System.out.println( color + " is your security key, if you forget your password");

					a.setUserSecurityKey(color);
					a.setUserPassword(password);
					System.out.println("Your password has been reset successfully!!\n");

					main.main(null);

				}


			}
		}


	}
}
