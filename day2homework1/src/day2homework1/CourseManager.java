package day2homework1;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Kursa kayýt yapýldý : " + course.courseName);
	}
	public void cancelCourse(Course course) {
		System.out.println("Kurs kaydý iptal edildi : " + course.courseName);
	}
}
