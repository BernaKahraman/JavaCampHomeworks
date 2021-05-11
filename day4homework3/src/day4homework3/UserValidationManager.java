package day4homework3;

public class UserValidationManager implements IUserValidationService {

	@Override
	public boolean Validate(User user) {
		
		if(user.getDateOfBirth()==1997 && user.getFirstName()=="Berna" && user.getLastName()=="Kahraman" && user.getNationalityId()=="11111111111") 
		{
			return true;
		}else {
			return false;
			
		}
		
	}

}
