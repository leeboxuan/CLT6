package dao;

import java.util.List;

import pojo.User;

public interface RegisterDAO {
	public void addUser(User ref);
	public List<User> showUsers();


}
