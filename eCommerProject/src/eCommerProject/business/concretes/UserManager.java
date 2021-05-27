package eCommerProject.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerProject.business.abstracts.UserService;
import eCommerProject.core.GoogleService;
import eCommerProject.dataAccsess.abstracts.UserDao;
import eCommerProject.entities.concretes.User;

public class UserManager implements UserService {
	
	private List<String> emailList= new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();
	
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}
	
	public static boolean isEmailValid(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}
	
	public static boolean isEmailValidOnClick(String email) {
		return true;
	}


	@Override
	public void register(User user) {
		
		//�ifre kontrol� 
		if (user.getPassword().length() < 6 || user.getPassword()==null) {
			System.out.println("Parolan�z en az 6 karakterden olu�mal�d�r!");
			return;
		}
		
		//Email daha �nce kullan�lm�� m�?
		if (emailList.contains(user.getEmail())) {
			System.out.println("Email daha �nce kullan�lm��t�r");
			return;
		}
		
		//Ad ve soyad en az 2 karakter olmal�
		if(user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
			System.out.println("Ad soyad en az 2 karakterden olu�mal�d�r!");
			return;
		}
		else {
			System.out.println("Do�rulama linki g�nderildi. Mailinizi kontrol ediniz. " + user.getEmail());
		}
		
		if(isEmailValidOnClick(user.getEmail())) {
			System.out.println("Kay�t tamamland�");
			emailList.add(user.getEmail());
			passwordList.add(user.getPassword());
			this.userDao.add(user);
			this.googleService.registerToSystem(null);
		}
		else {
			System.out.println("L�tfen mail adresinizi kontrol ediniz ve hesab�n�z� do�rulay�n�z!");
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Giri� ba�ar�l�");
		}
		else {
			System.out.println("Email veya parolan�z� kontrol ediniz");
		}
		
	}

	

}
