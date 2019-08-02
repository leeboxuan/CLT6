package pojo;

public class StudentsPOJO {

	int id;
	String name, password, dob;


	public StudentsPOJO(int id, String name, String password, String dob) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.dob = dob;
	}
	
	public StudentsPOJO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
