package application;

import java.util.List;
import java.util.Scanner;

import controller.StudentController;
import dao.StudentsDAO;
import pojo.StudentsPOJO;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentController controller = new StudentController();
		System.out.println("Choose your options: ");
		System.out.println("1. Student List");
		System.out.println("2. Add student ");
		System.out.println("3. Update student details ");
		System.out.println("4. Delete student ");

		Scanner scan = new Scanner(System.in); //Creates a new scanner
		String input = scan.next();

		switch (input) {

		case "1":
			List<StudentsPOJO> list;
			list= controller.listStudents();
			System.out.println("User ID \tName \t\tPassword\tDOB ");
			for(int i=0;i<list.size();i++){  

				System.out.println(list.get(i).getId() + "\t\t" + list.get(i).getName() + "\t\t" + list.get(i).getPassword() + "\t\t" + list.get(i).getDob());			

			}
			break;

		case "2":

			controller.addStudent();
			break;
		case "3":
			
			controller.updateStudent();
			break;


		case "4":

			controller.removeStudent();
			break;

		default:
			System.out.println("Your input is invalid, please restart application.");
		}





	}

}
