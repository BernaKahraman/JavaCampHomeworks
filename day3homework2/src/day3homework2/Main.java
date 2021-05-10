package day3homework2;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Ali","Aslan","ali@gmail.com","1111");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Eymen");
		user2.setLastName("Özgenç");
		user2.setEmail("eymen@gmail.com");
		user2.setPassword("2222");
		
		Student student= new Student(1,"Berna","Kahraman","berna@gmail.com","1234","Java");
		
		Instructor instructor= new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@gmail.com");
		instructor.setPassword("12334");
		instructor.setCourseGiven("Java - C#");
			
		UserManager userManager= new UserManager();
		User[] users= {user,user2,student,instructor};		
		userManager.addMultiple(users);
		
		System.out.println("--------------------");
		
		StudentManager studentManager= new StudentManager();
		studentManager.Add(student);
		studentManager.Removo(student);
		
		System.out.println("--------------------");
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.Add(instructor);
		instructorManager.Removo(instructor);
	
	}

}
