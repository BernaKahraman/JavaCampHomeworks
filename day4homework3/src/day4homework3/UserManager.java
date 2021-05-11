package day4homework3;

import day4homework3.IUserService;
import day4homework3.IUserValidationService;

public class UserManager implements IUserService {
	
	//Hi�bir s�n�f ��plak b�rak�lmamal� :D 
	
	private IUserValidationService iuserValidationService;
	
	public UserManager(IUserValidationService iuserValidationService) {
		this.iuserValidationService = iuserValidationService;
	}

	@Override
	public void Add(User user) {
		if(iuserValidationService.Validate(user)==true) {
			System.out.println("Oyuncu do�ruland�. Sisteme kaydedildi : " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Oyuncu do�rulanamad�. Kay�t ba�ar�s�z.");
		}
		
	}

	@Override
	public void Update(User user) {
		System.out.println("Oyuncu bilgileri g�ncellendi : " + user.getNationalityId());
		
	}

	@Override
	public void Delete(User user) {
		System.out.println("Oyuncu sistemden silindi : " + user.getNationalityId());
		
	}

}
