package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import pojo.StudentsPOJO;

public class StudentsDAOImpl implements StudentsDAO{

	public static Connection prepareConnection() throws SQLException, ClassNotFoundException{

		String connectionURL = "jdbc:mysql://localhost:3306/clt6";

		String uname = "root";
		String pwd = "root";

		//Register JDBC Driver

		Class.forName("com.mysql.jdbc.Driver");

		//open a connection

		Connection ref = DriverManager.getConnection(connectionURL, uname, pwd);
		return ref;
	}

	@Override
	public void addStudent(StudentsPOJO sRef) {
		Statement st;
		try {
			st = prepareConnection().createStatement();
			String sqlInsert = "INSERT INTO students " + "VALUES (" + sRef.getId() + ",'" + sRef.getName() + "','" + sRef.getPassword() + "','" + sRef.getDob() +"')";
			st.executeUpdate(sqlInsert);
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent(StudentsPOJO sRef) {
		// TODO Auto-generated method stub
		Statement st;
		try {
			st = prepareConnection().createStatement();
			String sqlUpdate = "UPDATE Students SET name = '"+ sRef.getName() + "', password= '"+ sRef.getPassword() + ",'dob='" + sRef.getDob() + "' WHERE userID=" + sRef.getId();
			
		    st.executeUpdate(sqlUpdate);
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<StudentsPOJO> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getStudentById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub

	}

}
