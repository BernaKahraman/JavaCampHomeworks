package day2homework1;

public class Main {

	public static void main(String[] args) {
			Course course1= new Course(1,"C# Kamp","S?f?rdan","Engin Demiro?");
			Course course2= new Course(2,"Java&React Kamp","JAVA+REACT","Engin Demiro?");
			Course course3 = new Course(3,"Programlamaya Giri?","Programlama Mant???", "Engin Demiro?");
				
			Course[] courses= {course1, course2, course3};

			for(Course course : courses) {
				System.out.println(course.courseName);
			}
			
			System.out.println(courses.length);
			
			CourseManager courseManager = new CourseManager();
			courseManager.addCourse(course1);
			courseManager.addCourse(course2);
			courseManager.addCourse(course3);
			
			courseManager.cancelCourse(course1);
			
		}

	}


