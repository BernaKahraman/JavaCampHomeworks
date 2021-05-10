package day3homework2;

public class Instructor extends User {
	private String courseGiven;
	
	public Instructor() {
		
	}

	public Instructor(String courseGiven) {
		this.courseGiven = courseGiven;
	}

	public String getCourseGiven() {
		return courseGiven;
	}

	public void setCourseGiven(String courseGiven) {
		this.courseGiven = courseGiven;
	}
}
