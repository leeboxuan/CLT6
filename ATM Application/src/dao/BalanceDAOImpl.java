package dao;

import pojo.User;

public class BalanceDAOImpl implements BalanceDAO {


	@Override
	public void depositAmt(User ref, double amt) {
		// TODO Auto-generated method stub

		ref.setBankBalance(ref.getBankBalance() + amt);

	}

	@Override
	public void withdrawAmt(User ref, double amt) {
		// TODO Auto-generated method stub
		ref.setBankBalance(ref.getBankBalance() - amt);

	}



	@Override
	public void showBalance(User ref) {
		// TODO Auto-generated method stub
		ref.getBankBalance();
	}

}
