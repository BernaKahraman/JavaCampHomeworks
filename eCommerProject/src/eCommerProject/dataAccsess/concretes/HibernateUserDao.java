package eCommerProject.dataAccsess.concretes;

import java.util.List;

import eCommerProject.dataAccsess.abstracts.UserDao;
import eCommerProject.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
