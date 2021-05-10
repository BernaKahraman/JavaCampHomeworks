package day3homework2;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi");
	}
	public void Removo(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sistemden silindi");
	}
	
	
	public void addMultiple(User[] users) {
		
		for(User user: users) {
			Add(user);
			
		}
	}

}
