package Concrete;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(String tc, String firstName, String lastName, int birthDay) {
		System.out.println("M��teri Do�ruland�");
		return true;
	}

}
