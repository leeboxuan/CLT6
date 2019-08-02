package dao;

import java.util.List;

import pojo.StudentsPOJO;

public interface StudentsDAO {

 public void addStudent(StudentsPOJO sRef);
 public void updateStudent(StudentsPOJO sRef);
 public  List<StudentsPOJO> listStudents();
 public void getStudentById(int id);
 public void removeStudent(int id);
 
 
}
