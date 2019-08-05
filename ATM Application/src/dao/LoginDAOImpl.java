package dao;

import pojo.User;

public class LoginDAOImpl implements LoginDAO {

	boolean status;

	//Connect with the DB here

	@Override
	public boolean loginValidate(User ref) {



		for (int i=0; i<User.getUserList().size(); i++) {

			User a = User.getUserList().get(i);

			if ((ref.getUserEmail().equals(a.getUserEmail())) && (ref.getUserPassword().equals(a.getUserPassword())) ){
				a.setStatus(true);
				status = true;

			}
		}


		//		if(ref.getUserEmail().equals("admin@gmail.com") && ref.getUserPassword().equals("admin123")) {
		//			//System.out.println("if checkEmployee");
		//			status = true;
		//		}
		//		
		//		else
		//		{
		//			//System.out.println("else checkEmployee");
		//			status = false;
		//		}

		return status;
	}




}
