package Concrete;

import java.rmi.RemoteException;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;

	}
	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		if (customerCheckService.CheckIfRealPerson(customer.getNationalityId(), customer.getFirstName(), customer.getLastName(),customer.getDateOfBirth())) {
			System.out.println("Do?ruland? : " + customer.getFirstName());
		} else {
			System.out.println("Ge?ersiz ki?i");
		}
		
	}
	
	
	
	
	
}
