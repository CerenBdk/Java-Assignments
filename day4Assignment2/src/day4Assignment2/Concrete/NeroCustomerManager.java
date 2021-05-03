package day4Assignment2.Concrete;

import day4Assignment2.Abstract.BaseCustomerManager;
import day4Assignment2.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to database for Nero: " + customer.getFirstName() + " " + customer.getLastName());
	}
}
