package service;

import dao.StudentsDAO;
import dao.StudentsDAOImpl;
import pojo.StudentsPOJO;

public class StudentServiceImpl implements StudentService{
	StudentsDAO refStudentsDao;

	@Override
	public void addStudent(StudentsPOJO student) {
		// TODO Auto-generated method stub
		
		refStudentsDao = new StudentsDAOImpl();
		refStudentsDao.addStudent(student);
		System.out.println("Student added!");
	}

	@Override
	public void updateStudent(StudentsPOJO student) {
		// TODO Auto-generated method stub
		refStudentsDao = new StudentsDAOImpl();
	}

}
