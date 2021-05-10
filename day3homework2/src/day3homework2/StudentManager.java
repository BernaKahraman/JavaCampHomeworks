package day3homework2;

public class StudentManager extends UserManager{
	public void Add(Student student) {
		System.out.println(student.getFirstName()  + " " + student.getLastName() + " " + student.getCourseTaken() + " kursuna eklendi");
	}
}
