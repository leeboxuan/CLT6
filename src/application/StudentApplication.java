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
		System.out.println("4. View specific student ");

		System.out.println("5. Delete student ");

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
			System.out.println("Enter student id: ");
			String id = scan.next();
			List<StudentsPOJO> list1;
			list1= (List<StudentsPOJO>) controller.getStudentById(Integer.parseInt(id));

			System.out.println("User ID \tName \t\tPassword\tDOB ");
			for(int i=0;i<list1.size();i++){  

				System.out.println(list1.get(i).getId() + "\t\t" + list1.get(i).getName() + "\t\t" + list1.get(i).getPassword() + "\t\t" + list1.get(i).getDob());			

			}
			break;
		case "5":
			controller.removeStudent();

			break;
		default:
			System.out.println("Your input is invalid, please restart application.");
		}





	}

}
