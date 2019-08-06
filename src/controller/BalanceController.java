package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import application.Main;
import pojo.User;

import service.UsersService;
import service.UsersServiceImpl;



public class BalanceController {
	User refUser;
	UsersService refService;

	Scanner sc = new Scanner(System.in);


	public void userBalanceController() throws ClassNotFoundException, SQLException {


		userInput();
	}

	void userInput() throws ClassNotFoundException, SQLException {

		//		refService = new UsersServiceImpl();
		//
		//		for (int i=0; i<refService.listUsers().size(); i++) {
		//
		//			if (refService.listUsers().get(i).isStatus() == true) {
		//				refUser = refService.listUsers().get(i);
		//			}
		//
		//		}
		
		refService = new UsersServiceImpl();
		refUser = new User();
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

	public void checkBalance() throws ClassNotFoundException, SQLException {
		refService.showBalance(refUser);

	}




	public void deposit() throws ClassNotFoundException, SQLException {
		
		System.out.println("Enter Amount: ");
		double amt = sc.nextDouble();

		if (amt > 0) {
			refService.depositAmt(refUser, amt);
			System.out.println(amt + " dollars deposited successfully!!");
			refService.showBalance(refUser);

		}else {
			System.out.println("Amount can't be negative!!");
		}
	}



	public void withdraw() throws ClassNotFoundException, SQLException {

		System.out.println("Enter Amount: ");
		double amt1 = sc.nextDouble();

//		if (refUser.getBankBalance() < amt1) {
//			System.out.println("Sorry!! Insufficient Balance");
//		}else {
//			refService.withdrawAmt(refUser, amt1);
//			System.out.println("Transaction Successful");
//		}
		refService.withdrawAmt(refUser, amt1);
		refService.showBalance(refUser);


	}


	public void continueUser() throws ClassNotFoundException, SQLException {

		System.out.println("Wish to continue? (Y/N)");
		String choice = sc.next();


		if (choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter your choice: ");
			String num = sc.next();
			switch(num) {
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
				System.out.println("Invalid choice, please restart.");
				break;
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
			Main.main(null);


		}else {	

			System.out.println("Invalid choice. Restart please.");

		}

	}
}
