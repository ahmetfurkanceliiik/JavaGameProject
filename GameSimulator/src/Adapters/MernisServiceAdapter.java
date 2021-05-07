package Adapters;

import Abstracts.UserValidationService;
import Entites.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements UserValidationService{

	public boolean CheckIFRealPerson(Gamer gamer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(
					  Long.parseLong(gamer.getNationalityId()), 
					  gamer.getFirstName().toUpperCase(), 
					  gamer.getLastName().toUpperCase(), 
					  gamer.getDateOfBirth().getYear()
				);
		  } 
		  catch (NumberFormatException e) {
			   e.printStackTrace();
		  } 
		  catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}
		
		
	}


