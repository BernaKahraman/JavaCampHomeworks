package Concrete;

import java.rmi.RemoteException;

import Abstracts.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Müþteri Eklendi" + customer.getFirstName());
		
	}

	
	
}
