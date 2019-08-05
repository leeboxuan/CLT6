package service;

import dao.BalanceDAO;
import dao.BalanceDAOImpl;
import dao.RegisterDAO;
import pojo.User;

public class BalanceServiceImpl implements BalanceService {


	BalanceDAO refBalanceDAO;


	@Override
	public void depositAmt(User ref, double amt) {
		// TODO Auto-generated method stub
		refBalanceDAO = new BalanceDAOImpl();

		refBalanceDAO.depositAmt(ref, amt);
	}

	@Override
	public void withdrawAmt(User ref, double amt) {
		// TODO Auto-generated method stub
		refBalanceDAO = new BalanceDAOImpl();

		refBalanceDAO.withdrawAmt(ref, amt);

	}

	@Override
	public void showBalance(User ref) {
		// TODO Auto-generated method stub
		//		 refBalanceDAO.showBalance(ref);

		System.out.println("Available Balance: $" + ref.getBankBalance());
	}


}
