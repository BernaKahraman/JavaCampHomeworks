package day2homework1;

public class Course {
		//contructor (yap�c� blok)
		public Course() {
			System.out.println("Kurs");
		}
		
		public Course(int id,String courseName,String courseExplanation,String instructorName) {
			
			this.id=id;
			this.courseName= courseName;
			this.courseExplanation= courseExplanation;
			this.instructorName= instructorName;
		}
		
		int id;
		String courseName; //Kurs Ad�
		String courseExplanation; // Kurs a��klamas�
		String instructorName; // E�itmen Ad�
}
