package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {

	LoginService refLoginService; // LoginService is an interface
	User refUser; // User is a POJO (Plain old Java object)
	public void userLoginController() {
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

		System.out.println("Enter your password : ");
		String password = sc.next();
		//		refUser.setUserPassword(password);

		refUser = new User(email, password, "", 0.0, false);

		refLoginService.checkStatus(refUser);

	}



}
