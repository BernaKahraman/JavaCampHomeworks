package day2homework1;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Kursa kay�t yap�ld� : " + course.courseName);
	}
	public void cancelCourse(Course course) {
		System.out.println("Kurs kayd� iptal edildi : " + course.courseName);
	}
}
