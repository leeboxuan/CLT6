package service;

import application.UserBalance;
import dao.LoginDAO;
import dao.LoginDAOImpl;
import pojo.User;

public class LoginServiceImpl implements LoginService{

	LoginDAO refLoginDAO;


	@Override
	public void checkStatus(User ref) {

		refLoginDAO = new LoginDAOImpl();
		if(refLoginDAO.loginValidate(ref) == true) {
			ref.setStatus(true);
			System.out.println("Login Successful!!");

			UserBalance.main(null);
		}
		else {
			System.out.println("Not valid... Please restart application.");

		}

	}









}
