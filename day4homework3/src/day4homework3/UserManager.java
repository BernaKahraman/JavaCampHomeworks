package day4homework3;

import day4homework3.IUserService;
import day4homework3.IUserValidationService;

public class UserManager implements IUserService {
	
	//Hiçbir sýnýf çýplak býrakýlmamalý :D 
	
	private IUserValidationService iuserValidationService;
	
	public UserManager(IUserValidationService iuserValidationService) {
		this.iuserValidationService = iuserValidationService;
	}

	@Override
	public void Add(User user) {
		if(iuserValidationService.Validate(user)==true) {
			System.out.println("Oyuncu doðrulandý. Sisteme kaydedildi : " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Oyuncu doðrulanamadý. Kayýt baþarýsýz.");
		}
		
	}

	@Override
	public void Update(User user) {
		System.out.println("Oyuncu bilgileri güncellendi : " + user.getNationalityId());
		
	}

	@Override
	public void Delete(User user) {
		System.out.println("Oyuncu sistemden silindi : " + user.getNationalityId());
		
	}

}
