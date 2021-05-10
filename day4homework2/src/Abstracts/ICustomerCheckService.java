package Abstracts;

import java.rmi.RemoteException;



public interface ICustomerCheckService {

	public boolean CheckIfRealPerson(String tc, String firstName, String lastName, int birthDay) throws RemoteException;

	
}
