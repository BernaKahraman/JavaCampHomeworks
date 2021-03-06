package day4homework2;

import java.rmi.RemoteException;

import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Berna");
		customer.setLastName("Kahraman");
		customer.setDateOfBirth(1993);
		customer.setNationalityId("11111111111");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);
	
	}

}
