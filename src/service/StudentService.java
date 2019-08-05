package service;

import java.util.List;

import pojo.StudentsPOJO;

public interface StudentService {
	public void addStudent(StudentsPOJO student);
	public void updateStudent(StudentsPOJO student);
	public  List<StudentsPOJO> listStudents();
	public void removeStudent(int id);
	public Object getStudentById(int id);



}
