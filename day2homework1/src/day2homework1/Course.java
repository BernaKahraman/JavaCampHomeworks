package day2homework1;

public class Course {
		//contructor (yapýcý blok)
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
		String courseName; //Kurs Adý
		String courseExplanation; // Kurs açýklamasý
		String instructorName; // Eðitmen Adý
}
