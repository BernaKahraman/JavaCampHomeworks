package Adapters;


import java.rmi.RemoteException;

import Abstracts.ICustomerCheckService;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(String tc, String firstName, String lastName, int birtDate) throws RemoteException {
		
		KPSPublicSoapProxy merniss=new KPSPublicSoapProxy();
        boolean result=true;
        result=merniss.TCKimlikNoDogrula(Long.parseLong(tc), firstName, lastName, birtDate);
        return result;
	}
	

}
