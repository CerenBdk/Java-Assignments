package day4Assignment2.Concrete;

import day4Assignment2.Abstract.BaseCustomerManager;
import day4Assignment2.Abstract.CustomerCheckService;
import day4Assignment2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Save to database for Starbucks: " + customer.getFirstName() + " " + customer.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
	}
}
