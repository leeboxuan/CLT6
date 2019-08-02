package application;

import java.util.Scanner;

import controller.StudentController;
import dao.StudentsDAO;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentController controller = new StudentController();
		controller.addStudent();
	}

}
