package service;

import java.util.List;

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
		refStudentsDao.updateStudent(student);
		System.out.println("Student updated!");

	}

	@Override
	public List<StudentsPOJO> listStudents() {
		refStudentsDao = new StudentsDAOImpl();
		return refStudentsDao.listStudents();
	}

	@Override
	public void removeStudent(int id) {
		refStudentsDao = new StudentsDAOImpl();
		refStudentsDao.removeStudent(id);
		System.out.println("Student removed :(");

	}



}
