package controller;

import java.util.Scanner;

import application.UserLoginAuthentication;
import pojo.User;
import service.RegisterService;
import service.RegisterServiceImpl;

public class UserRegistrationController {


	RegisterService refRegisterService; // Register Service is an interface

	public void userRegistrationController() {

		userInput();

	}

	void userInput() {
		Scanner sc = new Scanner(System.in);
		//step 1 : ask user ID and Password
		System.out.println("Enter Email address : ");
		String emailInput = sc.next();

		for (int i=0; i<User.getUserList().size(); i++) {

			User a = User.getUserList().get(i);

			if (emailInput == a.getUserEmail()) {
				System.out.println("Email already exists!!!");
			}else {

				System.out.println("Enter User Password : ");
				String password = sc.next();

				System.out.println("Re-type Password : ");
				String retypePass = sc.next();

				if (password == retypePass) {


					System.out.println("What is your favourite color?  ");
					String securityKey = sc.next();

					System.out.println(securityKey + " is your security key, incase if you forget your password.");
					refRegisterService = new RegisterServiceImpl();


					//step 2 : create object of User class
					User refUser = new User(emailInput, password, securityKey, 0, false);

					refRegisterService.addUser(refUser);

					System.out.println("Would you like to login? (Y/N)");
					String choice = sc.next();

					switch(choice) {
					case "Y":
						UserLoginAuthentication.main(null);
						break;

					case "N":
						System.out.println("OK THANKS BYE");
						break;

					default: 
						System.out.println("You have entered an invalid choice, please restart application.");
					}



				}else {
					System.out.println("Password doesnt match!!");
				}




			}
		}




	}

}
