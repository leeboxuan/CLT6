package controller;

import java.util.List;
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
		addInput();
	}
	
	public void updateStudent() {
		studentServiceRef = new StudentServiceImpl();
		studentRef = new StudentsPOJO();
		updateInput();
	}
	
	public List<StudentsPOJO> listStudents() {
		studentServiceRef = new StudentServiceImpl();

		return studentServiceRef.listStudents();
	}
	
	public void removeStudent() {
		studentServiceRef = new StudentServiceImpl();
		deleteInput();

	}
	
	
	
	private void addInput() {
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
	
	private void updateInput() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //Creates a new scanner

		System.out.println("Enter which user ID you want to update: ");
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
		
		studentServiceRef.updateStudent(studentRef);
	}
	
	private void deleteInput() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //Creates a new scanner

		System.out.println("Enter which user ID you want to delete: ");
		int idInput = Integer.parseUnsignedInt(scan.nextLine());
		studentServiceRef.removeStudent(idInput);
	}
}
