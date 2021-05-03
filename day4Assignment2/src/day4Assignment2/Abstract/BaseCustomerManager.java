package day4Assignment2.Abstract;

import day4Assignment2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerManager{

	public abstract void save(Customer customer);

}
