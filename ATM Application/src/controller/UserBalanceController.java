package controller;

import java.util.Scanner;

import application.UserLoginAuthentication;
import application.main;
import dao.LoginDAO;
import pojo.User;
import service.BalanceService;
import service.BalanceServiceImpl;
import service.LoginService;
import service.LoginServiceImpl;
import service.RegisterService;
import service.RegisterServiceImpl;

public class UserBalanceController {

	LoginDAO refLoginDAO;// Register Service is an interface
	User refUser;
	BalanceService refBalanceService;
	Scanner sc = new Scanner(System.in);

	public void userBalanceController() {


		userInput();

	}


	void userInput() {

		refBalanceService = new BalanceServiceImpl();
		for (int i=0; i<User.getUserList().size(); i++) {

			if (User.getUserList().get(i).isStatus() == true) {
				refUser = User.getUserList().get(i);
			}

		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Type 1: Check Available Bank Balance");
		System.out.println("Type 2: Deposit Amount");
		System.out.println("Type 3: Withdraw Amount");


		System.out.println("Enter your choice: ");

		String userChoice = sc.next();

		switch(userChoice) {

		case "1":

			checkBalance();
			continueUser();

			break;

		case "2":

			deposit();
			continueUser();

			break;

		case "3":

			withdraw();
			continueUser();

			break;

		default:
			System.out.println("Invalid choice. Please restart application.");
			break;
		}


	}

	public void checkBalance() {

		refBalanceService.showBalance(refUser);
	}




	public void deposit() {

		System.out.println("Enter Amount: ");
		double amt = sc.nextDouble();

		if (amt > 0) {
			refBalanceService.depositAmt(refUser, amt);
			System.out.println(amt + " dollars deposited successfully!!");

		}else {
			System.out.println("Amount can't be negative!!");
		}
	}



	public void withdraw() {

		System.out.println("Enter Amount: ");
		double amt1 = sc.nextDouble();

		if (refUser.getBankBalance() < amt1) {
			System.out.println("Sorry!! Insufficient Balance");
		}else {
			refBalanceService.withdrawAmt(refUser, amt1);
			System.out.println("Transaction Successful");
		}

	}


	public void continueUser() {

		System.out.println("Wish to continue? (Y/N)");
		String choice = sc.next();


		if (choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter your choice: ");
			String num = sc.next();
			switch(num) {
			case "1":
				checkBalance();
			case "2":
				deposit();

			case "3":
				withdraw();
				continueUser();

			default:
				System.out.println("Invalid choice, please restart.");
			}
			//			if (num == "2") {
			//				deposit();
			//				continueUser();
			//SS
			//
			//			}else if (num == "3") {
			//				withdraw();
			//				continueUser();
			//
			//			}


		}else if(choice.equalsIgnoreCase("N")){
			System.out.println("Thank you for banking with us!");
			main.main(null);


		}else {	

			System.out.println("Invalid choice. Restart please.");

		}

	}


}
