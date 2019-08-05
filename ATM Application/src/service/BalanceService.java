package service;

import pojo.User;

public interface BalanceService {

	public void showBalance(User ref);
	public void depositAmt(User ref, double amt);
	public void withdrawAmt(User ref, double amt);

}
