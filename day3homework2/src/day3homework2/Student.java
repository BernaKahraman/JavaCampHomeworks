package day3homework2;

public class Student extends User {
	private String courseTaken;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email, String password, String courseTaken) {
		super(id,firstName,lastName,email,password);
		this.courseTaken = courseTaken;
	}

	public String getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
	}
}
