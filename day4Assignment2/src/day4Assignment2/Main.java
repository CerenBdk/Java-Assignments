package day4Assignment2;

import java.time.LocalDate;

import day4Assignment2.Abstract.BaseCustomerManager;
import day4Assignment2.Adapters.MernisServiceAdapter;
import day4Assignment2.Concrete.NeroCustomerManager;
import day4Assignment2.Concrete.StarbucksCustomerManager;
import day4Assignment2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Ron", "Weasly", LocalDate.of(1980, 3, 1), "1234"));
		
	}

}
