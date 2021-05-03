package day4Assignment2.Concrete;

import day4Assignment2.Abstract.CustomerCheckService;
import day4Assignment2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		return true;
	}


}
