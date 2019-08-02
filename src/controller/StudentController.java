package controller;

import java.util.Scanner;

import pojo.StudentsPOJO;
import service.StudentService;
import service.StudentServiceImpl;

public class StudentController {

	private StudentService studentServiceRef;
	private StudentsPOJO studentRef;
	
	
	public void addStudent() {
		studentServiceRef = new StudentServiceImpl();
		studentRef = new StudentsPOJO();
		userInput();
	}
	
	private void userInput() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //Creates a new scanner

		System.out.println("Enter your user ID: ");
		int idInput = Integer.parseUnsignedInt(scan.nextLine());
		studentRef.setId(idInput);

		System.out.println("Enter your name");
		String nameInput = scan.nextLine();
		studentRef.setName(nameInput);
		
		
		System.out.println("Enter your password");
		String passInput = scan.nextLine();
		studentRef.setPassword(passInput);
		
		
		System.out.println("Enter your dob");
		String dobInput = scan.nextLine();
		studentRef.setDob(dobInput);
		
		studentServiceRef.addStudent(studentRef);
		
	}
}
