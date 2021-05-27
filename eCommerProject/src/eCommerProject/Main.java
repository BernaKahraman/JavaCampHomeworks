package eCommerProject;

import eCommerProject.business.concretes.UserManager;
import eCommerProject.core.GoogleRegisterAdapter;
import eCommerProject.dataAccsess.concretes.HibernateUserDao;
import eCommerProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleRegisterAdapter());
		
		User users= new User(1,"Berna","Kahraman","bernakahraman@gmail.com","123456");
		userManager.register(users);
		userManager.login("bernakahraman@gmail.com", "123456");
	}

}
