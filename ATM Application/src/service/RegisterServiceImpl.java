package service;

import dao.RegisterDAO;
import dao.RegisterDAOImpl;
import pojo.User;

public class RegisterServiceImpl implements RegisterService {

	RegisterDAO refRegisterDAO;

	@Override
	public void addUser(User ref) {
		// TODO Auto-generated method stub
		refRegisterDAO = new RegisterDAOImpl();
		refRegisterDAO.addUser(ref);

	}

}
