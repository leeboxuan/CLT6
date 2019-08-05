package dao;

import pojo.User;

public interface BalanceDAO {
	public void showBalance(User ref);
	public void depositAmt(User ref, double amt);
	public void withdrawAmt(User ref, double amt);

}
