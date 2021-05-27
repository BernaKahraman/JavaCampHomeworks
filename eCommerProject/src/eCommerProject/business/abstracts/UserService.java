package eCommerProject.business.abstracts;

import eCommerProject.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);

}
