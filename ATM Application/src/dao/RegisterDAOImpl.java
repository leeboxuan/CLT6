package dao;

import java.util.List;

import pojo.User;

public class RegisterDAOImpl  implements RegisterDAO {

	@Override
	public void addUser(User ref) {
		// TODO Auto-generated method stub
		User.getUserList().add(ref);

		System.out.println("Registration Successful!!");
	}

	@Override
	public List<User> showUsers() {
		// TODO Auto-generated method stub

		return User.getUserList();
	}

}
